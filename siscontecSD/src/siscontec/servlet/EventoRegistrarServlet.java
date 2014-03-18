package siscontec.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import karaoke.excepcion.DAOExcepcion;
import karaoke.modelo.JsonResult;
import karaoke.modelo.Local;
import karaoke.modelo.Evento;
import karaoke.negocio.GestionEventos;
import karaoke.negocio.GestionLocales;

/**
 * Servlet implementation class RecuperaPostServlet
 */
@WebServlet("/admin/EventoRegistrarServlet")
public class EventoRegistrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EventoRegistrarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonResult result = new JsonResult();
		String message = "";
		int tipoMsg = JsonResult.WARNING;
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("RegNombre");
		String fecha = request.getParameter("RegFecha");
		int capacidad = Integer.parseInt(request.getParameter("RegCapacidad"));
		String descripcion = request.getParameter("RegDescripcion");
		int idlocal = Integer.parseInt(request.getParameter("RegidLocal"));
		boolean elog = false;
		
		GestionEventos negocio = new GestionEventos();
		GestionLocales negocioLocal = new GestionLocales();		
		try {
			Local local = negocioLocal.obtener(idlocal);
			Evento nuevo = negocio.insertar(nombre, fecha, capacidad, descripcion, elog, local);
			if (nuevo.getIdevento()>0) {
				tipoMsg = JsonResult.SUCCESS;
				message = "["+nuevo.getIdevento()+"] Evento se grabo satisfactoriamente";
			} else {
				tipoMsg = JsonResult.ERROR;
				message = "No se pudo registrar";
			}

		} catch (DAOExcepcion e) {
			tipoMsg = JsonResult.ERROR;
			message = e.getMessage();
		}

		// Guardando datos en el scope REQUEST		
     	result.addMenssage(tipoMsg, message);		
		out.println(gson.toJson(result));

	} // DoPost

}
