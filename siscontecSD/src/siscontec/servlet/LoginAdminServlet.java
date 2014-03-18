package siscontec.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Administrador;
import siscontec.negocio.GestionAdministradores;

/**
 * Servlet implementation class LoginAdminServlet
 */
@WebServlet("/sisadm/LoginAdminServlet")
public class LoginAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdminServlet() {
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
		String password = request.getParameter("txtContrasena");
		
		GestionAdministradores negocioAdmin = new GestionAdministradores();
		ArrayList<String> errors = new ArrayList<String>();
		RequestDispatcher rd = null;
		
		try {
			Administrador c = negocioAdmin.logear(usuario, password);
			
			if(c.getNombres()!=null){
				HttpSession sesion = request.getSession();
				sesion.setAttribute("ADMIN", c);
				
				rd = request.getRequestDispatcher("/sisadm/ListadoConsultas.jsp");
			} else {
				errors.add("Ingreso Invalido");
				rd = request.getRequestDispatcher("/sisadm/index.jsp");
			}
			
			
			
		} catch (DAOExcepcion e) {
			errors.add("Fallo el ingreso");
		}
		
		request.setAttribute("ERRORS", errors);
		rd.forward(request, response);
	}

	protected void cargarDataReservaCliente(HttpServletRequest request) throws DAOExcepcion{
		/*GestionLocales negocioL = new GestionLocales();
		Collection<Local> locales = negocioL.listar();
		
		request.setAttribute("LOCALES", locales);
		
		GestionReserva negocioR = new GestionReserva();
		Collection<Reserva> reservasCli = negocioR.listByCodNomSalaReservaByIdCliente(c.getIdcliente(), "", "");
		
		request.setAttribute("RESERVAS", reservasCli);*/
	}
}
