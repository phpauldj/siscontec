<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList,siscontec.modelo.Administrador"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    <%
	HttpSession sesion = request.getSession();
	Administrador admi = (Administrador)sesion.getAttribute("ADMIN");
	
	if(admi!=null){
		response.sendRedirect("ListadoConsultas.jsp");
	}
	%>
		<form action="LoginAdminServlet" method="post">
	        <table width="20%" align="center" border="1">
	            <tr align="center">
	                <td colspan="2">ACCESSO AL SISTEMA</td>
	            </tr>
	            <tr>
	                <td align="right">USUARIO</td>
	                <td><input id="txtUsuario"></td>
	            </tr>
	            <tr>
	                <td align="right">CONTRASE&Ntilde;A</td>
	                 <td><input id="txtContrasena"></td>
	            </tr>
	            <tr align="center">
	                <td colspan="2"><button>Ingresar</button></td>
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
	      			<div>
				        <strong>!Error</strong>&nbsp;&nbsp;&nbsp;Correo Electrónico o Contraseña Inválido.
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
