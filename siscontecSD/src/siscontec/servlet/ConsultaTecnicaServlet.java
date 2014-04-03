package siscontec.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConsultaTecnicaServlet
 */
public class ConsultaTecnicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaTecnicaServlet() {
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
		String idClasificacion = request.getParameter("cmbClasificacion");
		String idTipo = request.getParameter("cmbTipo");
		
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("NuevaConsulta.jsp");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(idClasificacion);
		al.add(idTipo);
		request.setAttribute("VALORES", al);
		rd.forward(request, response);
	}

}
