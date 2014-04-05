/**
 * 
 */
package siscontec.servicios.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.ConsultaTecnica;
import siscontec.negocio.GestionConsultasTecnicas;

/**
 * @author Paul
 *
 */

@Path("/consultaTecnica")
public class ServicioRestConsultaTecnica {

	@GET
	public Response inicio(){
		
		String bienvenida = "Hola!, Bienvenido a los Servicios REST de DIGEMID!";
		return Response.status(200).entity(bienvenida).build();
	}
	
	@POST
	@Path("/register")
	@Consumes("application/json")
	public Response registrarConsultaTecnica(ConsultaTecnica ct) throws DAOExcepcion{
		
		Gson g = new Gson();
		GestionConsultasTecnicas negocioCT = new GestionConsultasTecnicas();
		ConsultaTecnica newCT = negocioCT.registrarConsultaTecnica(ct);
		return Response.status(200).entity(g.toJson(newCT)).build();
	}
	
	@GET
	@Path("/consultaTecnicaJson")
	@Produces("application/json")
	public ConsultaTecnica obtenerConsuTecnica() throws DAOExcepcion{
		
		GestionConsultasTecnicas negocioct = new GestionConsultasTecnicas();
		ConsultaTecnica oct =  negocioct.obtener(3);
		return oct;
	}
}
