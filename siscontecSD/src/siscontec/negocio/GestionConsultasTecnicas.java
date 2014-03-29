/**
 * 
 */
package siscontec.negocio;

import siscontec.dao.ConsultaTecnicaDAO;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Clasificacion;
import siscontec.modelo.ConsultaTecnica;
import siscontec.modelo.MedioConsulta;
import siscontec.modelo.MotivoConsulta;
import siscontec.modelo.Tipo;
import siscontec.modelo.TipoInstitucion;
import siscontec.modelo.TipoSolicitante;

/**
 * @author Paul
 *
 */
public class GestionConsultasTecnicas {

	public ConsultaTecnica registrarConsultaTecnica(Clasificacion clasificacion, Tipo tipo, MotivoConsulta motivo, TipoInstitucion tipoInsti,
			String institucion, String area, TipoSolicitante tipoSoli, String apellidos, String nombres, String dni, String ruc, String telefono,
			String fax, String email, MedioConsulta medio, String descripcion)
			throws DAOExcepcion {
		ConsultaTecnicaDAO dao = new ConsultaTecnicaDAO();
		
		ConsultaTecnica ad = new ConsultaTecnica();
		ad.setId_Clasificacion(clasificacion);
		ad.setId_Tipo(tipo);
		ad.setId_MotivoConsulta(motivo);
		ad.setId_TipoInstitucion(tipoInsti);
		ad.setInstitucion(institucion);
		ad.setArea(area);
		ad.setId_TipoSolicitante(tipoSoli);
		ad.setApellidos(apellidos);
		ad.setNombres(nombres);
		ad.setDNI(dni);
		ad.setRUC(ruc);
		ad.setTelefono(telefono);
		ad.setFax(fax);
		ad.setEmail(email);
		ad.setId_MedioConsulta(medio);
		ad.setDescripcion(descripcion);
		
		return dao.registrarConsultaTecnica(ad); 
	}
	
	public ConsultaTecnica obtener(int id) throws DAOExcepcion {
		ConsultaTecnicaDAO dao = new ConsultaTecnicaDAO();
		return dao.obtener(id);
	}
}
