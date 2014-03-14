package org.apache.jsp.Presentacion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NuevaConsulta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Nueva Consulta</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <form>\r\n");
      out.write("    <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td colspan=\"2\">DATOS GENERALES</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr><td></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Clasificación</td>\r\n");
      out.write("    <td colspan=\"2\">\r\n");
      out.write("      <select name=\"cmbClasificacion\" id=\"cmbClasificacion\">\r\n");
      out.write("        <option value=\"0\">Seleccionar</option>\r\n");
      out.write("        <option value=\"1\">Productos Farmaceuticos</option>\r\n");
      out.write("        <option value=\"2\">Dispositivos Médicos</option>\r\n");
      out.write("        <option value=\"3\">Productos Sanitarios</option>\r\n");
      out.write("        <option value=\"4\">Establecimientos Farmaceuticos</option>\r\n");
      out.write("        <option value=\"5\">Aduana</option>\r\n");
      out.write("        <option value=\"6\">Cenadim</option>\r\n");
      out.write("        <option value=\"7\">Productos Controlados</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("    <td>Tipo</td>\r\n");
      out.write("    <td colspan=\"2\">\r\n");
      out.write("      <select name=\"cmbTipo\" id=\"cmbTipo\">\r\n");
      out.write("        <option value=\"0\">Seleccionar</option>\r\n");
      out.write("        <option value=\"1\">Productos Farmaceuticos</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Motivo de Consulta</td>\r\n");
      out.write("    <td colspan=\"2\">\r\n");
      out.write("      <select name=\"cmbMotivo\" id=\"cmbMotivo\">\r\n");
      out.write("        <option value=\"0\">Seleccionar</option>\r\n");
      out.write("        <option value=\"1\">Toma de desiciones</option>\r\n");
      out.write("        <option value=\"2\">Prescripción / Dispensación / Aplicación de medicamento</option>\r\n");
      out.write("        <option value=\"3\">Uso adecuado de medicamento</option>\r\n");
      out.write("        <option value=\"4\">Apoyo a la investigación</option>\r\n");
      out.write("        <option value=\"5\">Obtención de Registro Sanitario</option>\r\n");
      out.write("        <option value=\"6\">Información sobre reglamentación</option>\r\n");
      out.write("        <option value=\"7\">Obtención de Certificado de Registro Sanitario</option>\r\n");
      out.write("        <option value=\"8\">¿Está sujeto a Registro Sanitario otorgado por DIGEMID?</option>\r\n");
      out.write("        <option value=\"9\">Sobre normativa relacionada</option>\r\n");
      out.write("        <option value=\"10\">Desaduanaje</option>\r\n");
      out.write("        <option value=\"11\">Otros</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Tipo de Institución/Empresa</td>\r\n");
      out.write("    <td colspan=\"2\">\r\n");
      out.write("      <select name=\"cmbMotivo\" id=\"cmbMotivo\">\r\n");
      out.write("        <option value=\"0\">Seleccionar</option>\r\n");
      out.write("        <option value=\"1\">DIGEMID</option>\r\n");
      out.write("        <option value=\"2\">ESSALUD</option>\r\n");
      out.write("        <option value=\"3\">FUERZAS ARMADAS Y POLICIALES</option>\r\n");
      out.write("        <option value=\"4\">DISA/DIRESA/GERESA</option>\r\n");
      out.write("        <option value=\"5\">LABORATORIO</option>\r\n");
      out.write("        <option value=\"6\">FARMACIA, BOTICA, SERVICIO DE FARMACIA</option>\r\n");
      out.write("        <option value=\"7\">DROGUERÍA</option>\r\n");
      out.write("        <option value=\"8\">CLINICA</option>\r\n");
      out.write("        <option value=\"9\">OTRAS ENTIDADES PÚBLICAS</option>\r\n");
      out.write("        <option value=\"10\">MINISTERIO DE SALUD</option>\r\n");
      out.write("        <option value=\"11\">UNIVERSIDAD / INSTITUTO</option>\r\n");
      out.write("        <option value=\"12\">OTROS</option>\r\n");
      out.write("        <option value=\"13\">ADUANA-MARITIMA/AEREA/POSTAL/INTA</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Institución</td>\r\n");
      out.write("    <td colspan=\"2\"><input name=\"txtTipoInstitucion\" type=\"text\" id=\"txtTipoInstitucion\" size=\"80\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Area o Dpto.</td>\r\n");
      out.write("    <td colspan=\"2\"><input name=\"txtArea\" type=\"text\" id=\"txtArea\" size=\"80\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Tipo Solicitante</td>\r\n");
      out.write("    <td colspan=\"2\"><select name=\"cmbTipoSolicitante\" id=\"cmbTipoSolicitante\">\r\n");
      out.write("        <option value=\"0\">Seleccionar</option>\r\n");
      out.write("        <option value=\"1\">QUIMICO FARMACEUTICO</option>\r\n");
      out.write("        <option value=\"2\">MÉDICO</option>\r\n");
      out.write("        <option value=\"3\">OTROS</option>\r\n");
      out.write("        <option value=\"4\">ESTUDIANTE</option>\r\n");
      out.write("        <option value=\"5\">PACIENTE</option>\r\n");
      out.write("        <option value=\"6\">OTROS PROFESIONALES DE LA SALUD</option>\r\n");
      out.write("        <option value=\"7\">REPRESENTANTE LEGAL</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Apellidos y Nombres</td>\r\n");
      out.write("    <td><input name=\"txtApellidos\" type=\"text\" id=\"txtApellidos\" size=\"40\"></td>\r\n");
      out.write("    <td><input name=\"txtNombres\" type=\"text\" id=\"txtNombres\" size=\"40\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>DNI</td>\r\n");
      out.write("    <td><input name=\"txtDNI\" type=\"text\" id=\"txtDNI\" size=\"30\"></td>\r\n");
      out.write("    <td>RUC</td>\r\n");
      out.write("    <td><input name=\"txtRUC\" type=\"text\" id=\"txtRUC\" size=\"30\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Teléfono</td>\r\n");
      out.write("    <td><input name=\"txtTelefono\" type=\"text\" id=\"txtTelefono\" size=\"30\"></td>\r\n");
      out.write("    <td>Fax</td>\r\n");
      out.write("    <td><input name=\"txtFax\" type=\"text\" id=\"txtFax\" size=\"30\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Email</td>\r\n");
      out.write("    <td colspan=\"2\"><input name=\"txtEmail\" type=\"text\" id=\"txtEmail\" size=\"80\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Medio de Consulta</td>\r\n");
      out.write("    <td colspan=\"2\"><input name=\"txtMedioConsulta\" type=\"text\" id=\"txtMedioConsulta\" size=\"80\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Descripción de la Consulta</td>\r\n");
      out.write("    <td colspan=\"2\"><textarea name=\"txtDescripcionConsulta\" cols=\"80\" id=\"txtDescripcionConsulta\"></textarea></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr><td colspan=\"3\">\r\n");
      out.write("      <input type=\"submit\" name=\"btnGrabar\" id=\"btnGrabar\" value=\"Grabar\">\r\n");
      out.write("    </td></tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
