/**
 * 
 */
package siscontec.servicios.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Usuario;
import siscontec.negocio.GestionUsuarios;

/**
 * @author Paul
 *
 */

@Path("/login")
public class ServicioRestLoginSolicitante {

	@GET
	@Path("/obtener-usuario-json/{usuario}/{clave}")
	@Produces("application/json")
	public Usuario obtenerUsuario(@PathParam("usuario") String usuario, @PathParam("clave") String clave) throws DAOExcepcion{
		
		GestionUsuarios negociocU = new GestionUsuarios();
		Usuario user =  negociocU.logear(usuario, clave);
		return user;
	}
	
	@GET
	@Path("/validar-usuario-json")
	@Produces("application/json")
	public Response obtenerUsuario(Usuario user) throws DAOExcepcion{
		Gson g = new Gson();
		
		GestionUsuarios negociocU = new GestionUsuarios();
		Usuario u = negociocU.logear(user.getLogin(), user.getContrasenia());
		
		return Response.status(200).entity(g.toJson(u)).build();
	}
}
