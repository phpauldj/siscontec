/**
 * 
 */
package siscontec.negocio;

import siscontec.dao.MedioConsultaDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.MedioConsulta;

/**
 * @author Paul
 *
 */
public class GestionMediosConsulta {

	public MedioConsulta obtener(int id) throws DAOExcepcion {
		MedioConsultaDAO dao = new MedioConsultaDAO();
		return dao.obtener(id);
	}
}
