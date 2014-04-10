package vuce.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vuce.modelo.Clasificacion;
import vuce.modelo.ConsultaTecnica;
import vuce.modelo.MedioConsulta;
import vuce.modelo.MotivoConsulta;
import vuce.modelo.Tipo;
import vuce.modelo.TipoInstitucion;
import vuce.modelo.TipoSolicitante;

import vuce.cliente.rest.*;

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
		int idClasificacion = Integer.parseInt(request.getParameter("cmbClasificacion"));
		int idTipo = Integer.parseInt(request.getParameter("cmbTipo"));
		int idMotivo = Integer.parseInt(request.getParameter("cmbMotivo"));
		int idTipoInsti = Integer.parseInt(request.getParameter("cmbTipoInstitucion"));
		String insti = request.getParameter("txtInstitucion");
		String area = request.getParameter("txtArea");
		int idTipoSoli = Integer.parseInt(request.getParameter("cmbTipoSolicitante"));
		String apellidos = request.getParameter("txtApellidos");
		String nombres = request.getParameter("txtNombres");
		String dni = request.getParameter("txtDNI");
		String ruc = request.getParameter("txtRUC");
		String telefono = request.getParameter("txtTelefono");
		String fax = request.getParameter("txtFax");
		String email = request.getParameter("txtEmail");
		int idMedioConsu = Integer.parseInt(request.getParameter("cmbMedioConsulta"));
		String descrip = request.getParameter("txtDescripcionConsulta");
		
		ConsultaTecnica objc = new ConsultaTecnica();
		
		Clasificacion clasificacion = new Clasificacion();
		clasificacion.setId_Clasificacion(idClasificacion);
		
		Tipo tipo = new Tipo();
		tipo.setId_Tipo(idTipo);
		
		MotivoConsulta motivo = new MotivoConsulta();
		motivo.setId_MotivoConsulta(idMotivo);
		
		TipoInstitucion tipoInsti = new TipoInstitucion();
		tipoInsti.setId_TipoInstitucion(idTipoInsti);
	
		TipoSolicitante tipoSoli = new TipoSolicitante();
		tipoSoli.setId_TipoSolicitante(idTipoSoli);
		
		MedioConsulta medio = new MedioConsulta();
		medio.setId_MedioConsulta(idMedioConsu);
		
		objc.setId_Clasificacion(clasificacion);
		objc.setId_Tipo(tipo);
		objc.setId_MotivoConsulta(motivo);
		objc.setId_TipoInstitucion(tipoInsti);
		objc.setInstitucion(insti);
		objc.setArea(area);
		objc.setId_TipoSolicitante(tipoSoli);
		objc.setApellidos(apellidos);
		objc.setNombres(nombres);
		objc.setDNI(dni);
		objc.setRUC(ruc);
		objc.setTelefono(telefono);
		objc.setFax(fax);
		objc.setEmail(email);
		objc.setId_MedioConsulta(medio);
		objc.setDescripcion(descrip);
		ConsultasTecnicasRest restclient = new ConsultasTecnicasRest();
		ConsultaTecnica newct = restclient.registrarCTRest(objc);
		request.setAttribute("TECNICA", newct);
		
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("NuevaConsulta.jsp");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(insti);
		al.add(descrip);
		request.setAttribute("VALORES", al);
		
		rd.forward(request, response);
	}

}
