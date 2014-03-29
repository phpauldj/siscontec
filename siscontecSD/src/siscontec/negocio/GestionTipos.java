/**
 * 
 */
package siscontec.negocio;

import siscontec.dao.TipoDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Tipo;

/**
 * @author Paul
 *
 */
public class GestionTipos {

	public Tipo obtener(int id) throws DAOExcepcion {
		TipoDAO dao = new TipoDAO();
		return dao.obtener(id);
	}
}
