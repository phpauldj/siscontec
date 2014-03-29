/**
 * 
 */
package siscontec.negocio;

import siscontec.dao.TipoSolicitanteDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.TipoSolicitante;

/**
 * @author Paul
 *
 */
public class GestionTiposSolicitante {

	public TipoSolicitante obtener(int id) throws DAOExcepcion {
		TipoSolicitanteDAO dao = new TipoSolicitanteDAO();
		return dao.obtener(id);
	}
}
