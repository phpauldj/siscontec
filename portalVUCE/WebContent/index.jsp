<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList,vuce.modelo.Administrador"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DIGEMID</title>
</head>
<body>
<h1>Bienvenido, ingrese con su Clave SOL</h1>

		<form action="<%=request.getContextPath() %>/ValidarUsuario" method="post">
	        <table width="20%" align="center" border="1">
	            <tr>
	                <td align="right">RUC</td>
	                <td><input type="text" value="" name="ruc" /></td>
	            </tr>
	            <tr>
	                <td align="right">USUARIO</td>
	                <td><input type="text" value="" name="usuario" /></td>
	            </tr>
	            <tr>
	                <td align="right">CLAVE</td>
	                 <td><input type="password" value="" name="clave" /></td>
	            </tr>
	            <tr align="center">
	                <td colspan="2"><input type="submit" value="Iniciar Sesión" name="btn" /></td>
	            </tr>
	        </table>
	   	</form>

</body>
</html>