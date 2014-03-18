package siscontec.negocio;

import java.util.Collection;

import siscontec.dao.AdministradorDAO;
import siscontec.dao.RolDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Administrador;
import siscontec.modelo.Rol;

public class GestionAdministradores {


	public Administrador registrarCuenta(String dni, String nombres, String paterno, String materno,
			String tipo)
			throws DAOExcepcion {
		AdministradorDAO dao = new AdministradorDAO();

		Administrador ro = null;
		if(!validaExistencia(dni)){
			Administrador ad = new Administrador();
			ad.setDni(dni);
			ad.setNombres(nombres);
			ad.setPaterno(paterno);
			ad.setMaterno(materno);
			ad.setTipo(tipo);
		
			ro = dao.registrarCuentaAdministrador(ad); 
		}
		return ro; 
	}

	public Collection<Administrador> buscarPorNombre(String nombres)
			throws DAOExcepcion {
		AdministradorDAO dao = new AdministradorDAO();
		return dao.listar();
	}
	
	public Administrador obtener(String tipo) throws DAOExcepcion {
		AdministradorDAO dao = new AdministradorDAO();
		return dao.obtener(tipo);
	}
	public Administrador obtenerPorID(int idadministrador) throws DAOExcepcion {
		AdministradorDAO dao = new AdministradorDAO();
		return dao.obtenerPorID(idadministrador);
	}
	public boolean validaExistencia(String dni) throws DAOExcepcion{
		AdministradorDAO dao = new AdministradorDAO();
		
		Collection<Administrador> lista = dao.buscarPorDni(dni); 
		return (lista.size()>0);
	}
	
	public Collection<Administrador> listar() throws DAOExcepcion {
		AdministradorDAO dao = new AdministradorDAO();
		return dao.listar();
	}
	
	public Administrador logear(String dni, String clave) throws DAOExcepcion {
		AdministradorDAO dao = new AdministradorDAO();
		return dao.logeo(dni, clave);
	}
}
