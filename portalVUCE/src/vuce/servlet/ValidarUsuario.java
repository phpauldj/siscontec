package vuce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import edu.upc.sunat.Persona;
import edu.upc.sunat.ValidaRUC_Service;
import edu.upc.sunat.ValidaRUC_ServiceLocator;

/**
 * @author Melissa
 *
 */
@WebServlet("/ValidarUsuario")
public class ValidarUsuario  extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("INGRESE AQUI");
		ValidaRUC_Service servicio = new ValidaRUC_ServiceLocator();
		String ruc = request.getParameter("ruc");
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		try {
			Persona persona = servicio.getvalidaRUCPort().consultaRuc(ruc, usuario, clave);
			if(persona.getRpta().equals("OK")){
				
				request.getSession().setAttribute("persona", persona);
				response.sendRedirect("success.jsp");
			}else{
				response.sendRedirect("index.jsp");
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
