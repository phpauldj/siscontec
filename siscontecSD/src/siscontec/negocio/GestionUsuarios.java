/**
 * 
 */
package siscontec.negocio;

import siscontec.dao.UsuarioDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Usuario;

/**
 * @author Paul
 *
 */
public class GestionUsuarios {

	public Usuario logear(String usuario, String clave) throws DAOExcepcion {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.logeo(usuario, clave);
	}
}
