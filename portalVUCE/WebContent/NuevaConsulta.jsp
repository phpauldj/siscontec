<%-- 
    Document   : NuevaConsulta
    Created on : 10-mar-2014, 23:27:05
    Author     : Melissa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="vuce.modelo.ConsultaTecnica,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VUCE - Nueva Consulta</title>
    </head>
    <body>
    <%
    	ArrayList<String> vals = (ArrayList<String>)request.getAttribute("VALORES");
    	String clasi = "", tipo = ""; 
		if(vals!=null){
			clasi = vals.get(0);
			tipo = vals.get(1);
		}
		
		ConsultaTecnica objc = (ConsultaTecnica)request.getAttribute("TECNICA");
		String mensaje = "No se registro la Consulta Técnica";
		if(objc!=null){
			mensaje = "Consulta Técnica ha sido Registrada [" + objc.getId_ConsultaTecnica() + "] por: " + 
					objc.getNombres() + " " + objc.getApellidos();
		}
    %>
    <%=clasi %> - <%=tipo %>
    <h1>PORTAL VUCE</h1>
    <h2>Consulta Técnica</h2>
    <form action="ConsultaTecnicaServlet" method="post">
    <table border="1">
    <tr>
    <td colspan="4">DATOS GENERALES</td>
    </tr>
    <tr><td colspan="4">--------------------------------------------------------------------------------------------</td></tr>
    <tr>
    <td>Clasificación</td>
    <td colspan="3">
      <select name="cmbClasificacion" id="cmbClasificacion">
        <option value="0">Seleccionar</option>
        <option value="1">Productos Farmaceuticos</option>
        <option value="2">Dispositivos Médicos</option>
        <option value="3">Productos Sanitarios</option>
        <option value="4">Establecimientos Farmaceuticos</option>
        <option value="5">Aduana</option>
        <option value="6">Cenadim</option>
        <option value="7">Productos Controlados</option>
      </select>&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span>
    </td>
    </tr>
	<tr>
    <td>Tipo</td>
    <td colspan="3">
      <select name="cmbTipo" id="cmbTipo">
        <option value="0">Seleccionar</option>
        <option value="1">Productos Farmaceuticos</option>
      </select>&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span>
    </td>
    </tr>
    <tr>
    <td>Motivo de Consulta</td>
    <td colspan="3">
      <select name="cmbMotivo" id="cmbMotivo">
        <option value="0">Seleccionar</option>
        <option value="1">Toma de desiciones</option>
        <option value="2">Prescripción / Dispensación / Aplicación de medicamento</option>
        <option value="3">Uso adecuado de medicamento</option>
        <option value="4">Apoyo a la investigación</option>
        <option value="5">Obtención de Registro Sanitario</option>
        <option value="6">Información sobre reglamentación</option>
        <option value="7">Obtención de Certificado de Registro Sanitario</option>
        <option value="8">¿Está sujeto a Registro Sanitario otorgado por DIGEMID?</option>
        <option value="9">Sobre normativa relacionada</option>
        <option value="10">Desaduanaje</option>
        <option value="11">Otros</option>
      </select>&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span>
    </td>
    </tr>
    <tr>
    <td>Tipo de Institución/Empresa</td>
    <td colspan="3">
      <select name="cmbTipoInstitucion" id="cmbTipoInstitucion">
        <option value="0">Seleccionar</option>
        <option value="1">DIGEMID</option>
        <option value="2">ESSALUD</option>
        <option value="3">FUERZAS ARMADAS Y POLICIALES</option>
        <option value="4">DISA/DIRESA/GERESA</option>
        <option value="5">LABORATORIO</option>
        <option value="6">FARMACIA, BOTICA, SERVICIO DE FARMACIA</option>
        <option value="7">DROGUERÍA</option>
        <option value="8">CLINICA</option>
        <option value="9">OTRAS ENTIDADES PÚBLICAS</option>
        <option value="10">MINISTERIO DE SALUD</option>
        <option value="11">UNIVERSIDAD / INSTITUTO</option>
        <option value="12">OTROS</option>
        <option value="13">ADUANA-MARITIMA/AEREA/POSTAL/INTA</option>
      </select>&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span>
    </td>
    </tr>
    <tr>
    <td>Institución</td>
    <td colspan="3"><input name="txtInstitucion" type="text" id="txtInstitucion" size="80">&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span></td>
    </tr>
    <tr>
    <td>Area o Dpto.</td>
    <td colspan="3"><input name="txtArea" type="text" id="txtArea" size="80"></td>
    </tr>
    <tr>
    <td>Tipo Solicitante</td>
    <td colspan="3"><select name="cmbTipoSolicitante" id="cmbTipoSolicitante">
        <option value="0">Seleccionar</option>
        <option value="1">QUIMICO FARMACEUTICO</option>
        <option value="2">MÉDICO</option>
        <option value="3">OTROS</option>
        <option value="4">ESTUDIANTE</option>
        <option value="5">PACIENTE</option>
        <option value="6">OTROS PROFESIONALES DE LA SALUD</option>
        <option value="7">REPRESENTANTE LEGAL</option>
      </select>&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span>
    </td>
    </tr>
    <tr>
    <td>Nombres</td>
    <td><input name="txtNombres" type="text" id="txtNombres" size="40"></td>
    <td>Apellidos</td>
    <td><input name="txtApellidos" type="text" id="txtApellidos" size="40">&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span></td>
    </tr>
    <tr>
    <td>DNI</td>
    <td><input name="txtDNI" type="text" id="txtDNI" size="30">&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span></td>
    <td>RUC</td>
    <td><input name="txtRUC" type="text" id="txtRUC" size="30">&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span></td>
    </tr>
    <tr>
    <td>Teléfono</td>
    <td><input name="txtTelefono" type="text" id="txtTelefono" size="30"></td>
    <td>Fax</td>
    <td><input name="txtFax" type="text" id="txtFax" size="30"></td>
    </tr>
    <tr>
    <td>Email</td>
    <td colspan="3"><input name="txtEmail" type="text" id="txtEmail" size="80"></td>
    </tr>
    <tr>
    <td>Medio de Consulta</td>
    <td colspan="3"><select name="cmbMedioConsulta" id="cmbMedioConsulta">
        <option value="0">Seleccionar</option>
        <option value="1">VIA WEB</option>
      </select>&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span>
    </td>
    </tr>
    <tr>
    <td>Descripción de la Consulta</td>
    <td colspan="3"><textarea name="txtDescripcionConsulta" cols="80" id="txtDescripcionConsulta"></textarea></td>
    </tr>
    <tr><td colspan="4">
      <input type="submit" name="btnGrabar" id="btnGrabar" value="GRABAR" style="width: 150px;height: 30px;">&nbsp;&nbsp;&nbsp;<span style="color: red;">(*)</span>
    </td></tr>
    </table>
    </form>
</body>
</html>
