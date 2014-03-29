/**
 * 
 */
package siscontec.negocio;

import siscontec.dao.ClasificacionDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Clasificacion;

/**
 * @author Paul
 *
 */
public class GestionClasificaciones {

	public Clasificacion obtener(int id) throws DAOExcepcion {
		ClasificacionDAO dao = new ClasificacionDAO();
		return dao.obtener(id);
	}
}
