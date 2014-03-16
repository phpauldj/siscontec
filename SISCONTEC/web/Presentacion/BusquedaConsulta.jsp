<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busqueda Consulta Técnica</title>
    </head>
    <body>
    <form enctype="multipart/form-data">
      <table width="50%" border="0" align="center">
        <tr>
        <td colspan="4">Criterios de busqueda</td>
        </tr>
        <tr>
        <td>Nro. Consulta:</td>
        <td><input type="text" name="txtNroConsulta" id="txtNroConsulta"></td>
        <td>Clave</td>
        <td><input type="text" name="txtClave" id="txtClave"></td>
        </tr>
        <tr><td colspan="4" align="right"><input type="submit" name="btnBuscar" id="btnBuscar" value="Buscar"></td></tr>
        <tr>
        <td><input type="submit" name="btnNuevaConsulta" id="btnNuevaConsulta" value="Nueva Consulta"></td>
        <td colspan="3" align="right">No se encontraron registros</td>
        </tr>
        <tr>
        <td colspan="4"></td>
        </tr>
      </table>
    </form>
</body>
</html>