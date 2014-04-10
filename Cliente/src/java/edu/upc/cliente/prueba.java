/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.upc.cliente;

import edu.upc.sunat.ValidaRUC_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import edu.upc.sunat.Persona;

/**
 *
 * @author Eduardo
 */
@WebServlet(name="prueba", urlPatterns={"/prueba"})
public class prueba extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_21424/servidorSunat/validaRUC.wsdl")
    private ValidaRUC_Service service;
   
    /** 
     * try { // Call Web Service Operation
     * edu.upc.sunat.ValidaRUC port = service.getValidaRUCPort();
     * // TODO initialize WS operation arguments here
     * java.lang.String ruc = "";
     * // TODO process result here
     * java.lang.String result = port.consultaRuc(ruc);
     * out.println("Result = "+result);
     * } catch (Exception ex) {
     * // TODO handle custom exceptions here
     * }

     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Persona  rpta = null ;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here*/
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet prueba</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>VALIDACION DE RUC</h1>");
            out.println("<form method='post' action=''>");
            out.println("Ingresar RUC : <input type='text' id='txtruc' name='txtruc' value=''/>");
            out.println("Ingresar Usuario : <input type='text' id='txtusu' name='txtusu' value=''/>");
            out.println("Ingresar Clave : <input type='text' id='txtpwd' name='txtpwd' value=''/>");
            out.println("<input type='submit' value='Validar'/>");
            out.println("</form>");
            if(rpta != null){
                out.println("<h1>RPTA : " + rpta.getApellido() + rpta.getRpta() + "</h1>");
            }
            out.println("</body>");
            out.println("</html>");
            
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String ruc = "";
        String usu = "";
        String pwd = "";
        if(!request.getParameter("txtruc").toString().equalsIgnoreCase("")){
            rpta = new Persona();
            System.out.println("entro");
            try { // Call Web Service Operation
                edu.upc.sunat.ValidaRUC port = service.getValidaRUCPort();
                // TODO initialize WS operation arguments here
                ruc = request.getParameter("txtruc").toString();
                usu = request.getParameter("txtusu").toString();
                pwd = request.getParameter("txtpwd").toString();
                // TODO process result here
                rpta = port.consultaRuc(ruc,usu,pwd);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
                System.out.println("Error! - " + ex.getMessage());
            }
        }

        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
