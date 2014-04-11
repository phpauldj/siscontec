/**
 * 
 */
package siscontec.servicios.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.ConsultaTecnica;
import siscontec.negocio.GestionConsultasTecnicas;

import com.google.gson.Gson;

/**
 * @author Paul
 *
 */

@Path("/solicitante")
public class ServicioRestConsultasSolicitante {

	@POST
	@Path("/lista-consultas-tecnicas-json/{id}")
	@Produces("application/json")
	public ArrayList<ConsultaTecnica> obtenerConsultaTecnicasBySoliJson(@PathParam("id") String idSolicitante) throws DAOExcepcion{
		
		GestionConsultasTecnicas negocioCT = new GestionConsultasTecnicas();
		ArrayList<ConsultaTecnica> lista = (ArrayList<ConsultaTecnica>)negocioCT.obtenerConsultasBySoli(idSolicitante);
		return lista;
	}
	
	@POST
	@Path("/lista-consultas-tecnicas")
	@Consumes("application/json")
	public Response obtenerConsultaTecnicasBySoli(String idSolicitante) throws DAOExcepcion{
		
		Gson g = new Gson();
		GestionConsultasTecnicas negocioCT = new GestionConsultasTecnicas();
		ArrayList<ConsultaTecnica> lista = (ArrayList<ConsultaTecnica>)negocioCT.obtenerConsultasBySoli(idSolicitante);
		return Response.status(200).entity(g.toJson(lista)).build();
	}
}
