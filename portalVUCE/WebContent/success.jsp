<%@page import="edu.upc.sunat.ValidaRUC_ServiceLocator"%>
<%@page import="edu.upc.sunat.Persona"%>
<%@page import="edu.upc.sunat.ValidaRUC_Service"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ValidaRUC_Service servicio = new ValidaRUC_ServiceLocator();
String ruc = request.getParameter("ruc");
String usuario = request.getParameter("usuario");
String clave = request.getParameter("clave");
Persona persona=(Persona)session.getAttribute("persona");


%>
<%=persona.getNombre() %><br><br>
<%=persona.getApellido() %>
</body>
</html>