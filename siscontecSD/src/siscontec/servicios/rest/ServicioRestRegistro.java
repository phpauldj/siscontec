/**
 * 
 */
package siscontec.servicios.rest;

import javax.ws.rs.*;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.ConsultaTecnica;
import siscontec.negocio.GestionConsultasTecnicas;

/**
 * @author Paul
 *
 */

@Path("/registro")
public class ServicioRestRegistro {

	@GET
	@Path("/getConsultaTecnicaJson")
	@Produces("application/json")
	public ConsultaTecnica obtenerConsuTecnica() throws DAOExcepcion{
		
		GestionConsultasTecnicas negocioct = new GestionConsultasTecnicas();
		ConsultaTecnica oct = negocioct.obtener(3);
		return oct;
	}
}
