/**
 * 
 */
package siscontec.negocio;

import siscontec.dao.MotivoConsultaDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.MotivoConsulta;

/**
 * @author Paul
 *
 */
public class GestionMotivosConsulta {

	public MotivoConsulta obtener(int id) throws DAOExcepcion {
		MotivoConsultaDAO dao = new MotivoConsultaDAO();
		return dao.obtener(id);
	}
}
