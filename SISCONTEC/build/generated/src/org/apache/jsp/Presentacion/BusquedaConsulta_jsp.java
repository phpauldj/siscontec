package org.apache.jsp.Presentacion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BusquedaConsulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Busqueda Consulta Técnica</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <form>\r\n");
      out.write("        <table width=\"50%\" border=\"0\" align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td colspan=\"4\">Criterios de busqueda</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>Nro. Consulta:</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"txtNroConsulta\" id=\"txtNroConsulta\"></td>\r\n");
      out.write("        <td>Clave</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"txtClave\" id=\"txtClave\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr><td colspan=\"4\" align=\"right\"><input type=\"submit\" name=\"btnBuscar\" id=\"btnBuscar\" value=\"Buscar\"></td></tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td><input type=\"submit\" name=\"btnNuevaConsulta\" id=\"btnNuevaConsulta\" value=\"Nueva Consulta\"></td>\r\n");
      out.write("        <td colspan=\"3\" align=\"right\">No se encontraron registros</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
