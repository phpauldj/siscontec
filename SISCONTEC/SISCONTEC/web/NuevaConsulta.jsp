<%-- 
    Document   : NuevaConsulta
    Created on : 10-mar-2014, 23:27:05
    Author     : Melissa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Consulta</title>
    </head>
    <body>
    <form>
    <table>
    <tr>
    <td>Clasificación</td>
    <td>
      <select name="cmbClasificacion" id="cmbClasificacion">
        <option value="0">Seleccionar</option>
        <option value="1">Productos Farmaceuticos</option>
        <option value="2">Dispositivos Médicos</option>
        <option value="3">Productos Sanitarios</option>
        <option value="4">Establecimientos Farmaceuticos</option>
        <option value="5">Aduana</option>
        <option value="6">Cenadim</option>
        <option value="7">Productos Controlados</option>
      </select>
    </td>
    </tr>
	<tr>
    <td>Tipo</td>
    <td>
      <select name="cmbTipo" id="cmbTipo">
        <option value="0">Seleccionar</option>
        <option value="1">Productos Farmaceuticos</option>
      </select>
    </td>
    </tr>
    <tr>
    <td>Motivo de Consulta</td>
    <td>
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
      </select>
    </td>
    </tr>
    </table>
    </form>
</body>
</html>
