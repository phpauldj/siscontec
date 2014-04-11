/**
 * 
 */
package siscontec.servicios.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.ConsultaTecnica;
import siscontec.negocio.GestionConsultasTecnicas;

import com.google.gson.Gson;

/**
 * @author Paul
 *
 */
@Path("/rest1")
public class ServicioRestCT {

	@POST
	@Path("/registrar-consulta")
	@Consumes("application/json")
	public Response registrarConsultaTecnica(ConsultaTecnica ct) throws DAOExcepcion{
		
		Gson g = new Gson();
		GestionConsultasTecnicas negocioCT = new GestionConsultasTecnicas();
		ConsultaTecnica newCT = negocioCT.registrarConsultaTecnica(ct);
		return Response.status(200).entity(g.toJson(newCT)).build();
	}
}
