/**
 * 
 */
package siscontec.negocio;

import siscontec.dao.TipoInstitucionDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.TipoInstitucion;

/**
 * @author Paul
 *
 */
public class GestionTiposInsititucion {

	public TipoInstitucion obtener(int id) throws DAOExcepcion {
		TipoInstitucionDAO dao = new TipoInstitucionDAO();
		return dao.obtener(id);
	}
}
