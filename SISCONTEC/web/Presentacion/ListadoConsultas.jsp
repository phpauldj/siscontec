<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Consultas Técnicas</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Criterios de Consulta</td>
            </tr>
            <tr>
                <td>Nro. Consulta</td>
                <td><input id="txtNroConulta"></td>
                <td>Situación</td>
                <td>
                    <select name="cmbSituacion">
                        <option value="0">TODOS</option>
                        <option value="1">INGRESADO</option>
                        <option value="1">PENDIENTE</option>
                        <option value="1">ATENDIDO</option>
                        <option value="1">OBSERVADO</option>
                        <option value="1">NO ATENDIDO</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Clasificación</td>
                <td>
                    <select name="cmbClasificacion">
                        <option value="0">TODOS</option>
                        <option value="1">INGRESADO</option>
                        <option value="1">PENDIENTE</option>
                        <option value="1">ATENDIDO</option>
                        <option value="1">OBSERVADO</option>
                        <option value="1">NO ATENDIDO</option>
                    </select>
                </td>
            </tr>
        </table>
    </body>
</html>
