<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList,vuce.modelo.Usuario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DIGEMID</title>
</head>
<body>
<center><h1>PORTAL VUCE, Ingrese con su Clave SOL:</h1></center>

<%
	HttpSession sesion = request.getSession();
	Usuario admi = (Usuario)sesion.getAttribute("SOLICITANTE");
	
	if(admi!=null){
		response.sendRedirect("ListadoConsultas.jsp");
	}
	%>
		<form action="LoginUserServlet" method="post">
	        <table width="20%" align="center" border="1">
	            <tr>
	                <td align="right">RUC</td>
	                <td><input id="txtRuc"></td>
	            </tr>
	            <tr>
	                <td align="right">USUARIO</td>
	                <td><input id="txtUsuario"></td>
	            </tr>
	            <tr>
	                <td align="right">CLAVE</td>
	                 <td><input id="txtClave"></td>
	            </tr>
	            <tr align="center">
	                <td colspan="2"><button>Iniciar Sesi�n</button></td>
	            </tr>
	            <tr align="center">
	                <td colspan="2">
		            <%
	      			ArrayList<String> errors = (ArrayList<String>)request.getAttribute("ERRORS");
	      			boolean flagerror = false;
	      			String classerror = "";
	      				
	      			if(errors!=null){
	      				if(errors.size()>=1){
	      					flagerror = true;
	      				}
	      			}
	      			
	      			if(flagerror){
	      			%>
	      				<div style="color: red;">
					        <strong>!Error!</strong>&nbsp;Correo Electr�nico o Contrase�a Inv�lida.
				      	</div>
				    <% 
	      			}
				    %>
			    	</td>
	            </tr>
	        </table>
	   	</form>

</body>
</html>