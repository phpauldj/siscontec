package vuce.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vuce.modelo.Usuario;
import vuce.cliente.rest.LoginSolicitanteRest;

/**
 * Servlet implementation class LoginUserServlet
 */
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUserServlet() {
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
		String usuario = request.getParameter("txtUsuario");
		String password = request.getParameter("txtClave");
		//String ruc = request.getParameter("txtRuc");
		
		LoginSolicitanteRest logrest = new LoginSolicitanteRest();
		ArrayList<String> errors = new ArrayList<String>();
		String redirect = "";
		
		try {
			Usuario c = logrest.logear(usuario, password);
			
			if(c!=null){
				HttpSession sesion = request.getSession();
				sesion.setAttribute("SOLICITANTE", c);
				
				redirect = "/ListadoConsultas.jsp";
			} else {
				errors.add("Ingreso Invalido");
				
				redirect = "/index.jsp";
			}
			
		} catch (Exception e) {
			errors.add("Fallo el Ingreso");
		}
		request.setAttribute("ERRORS", errors);
		
		RequestDispatcher rd = request.getRequestDispatcher(redirect);
		rd.forward(request, response);
	}

}
