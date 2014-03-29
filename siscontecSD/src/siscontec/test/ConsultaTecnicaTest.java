/**
 * 
 */
package siscontec.test;

import junit.framework.Assert;

import org.junit.Test;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Clasificacion;
import siscontec.modelo.ConsultaTecnica;
import siscontec.modelo.MedioConsulta;
import siscontec.modelo.MotivoConsulta;
import siscontec.modelo.Tipo;
import siscontec.modelo.TipoInstitucion;
import siscontec.modelo.TipoSolicitante;
import siscontec.negocio.GestionClasificaciones;
import siscontec.negocio.GestionConsultasTecnicas;
import siscontec.negocio.GestionMediosConsulta;
import siscontec.negocio.GestionMotivosConsulta;
import siscontec.negocio.GestionTipos;
import siscontec.negocio.GestionTiposInsititucion;
import siscontec.negocio.GestionTiposSolicitante;

/**
 * @author Paul
 *
 */
@SuppressWarnings("deprecation")
public class ConsultaTecnicaTest {

	@Test
	public void RegistrarNuevaConsultaTecnicaTest(){
		GestionConsultasTecnicas negocioConsTecnicas = new GestionConsultasTecnicas();
		
		try {
			GestionClasificaciones gclasi = new GestionClasificaciones();
			Clasificacion clasificacion = gclasi.obtener(1);
			
			GestionTipos gtipo = new GestionTipos();
			Tipo tipo = gtipo.obtener(1);
			
			GestionMotivosConsulta gmoti = new GestionMotivosConsulta();
			MotivoConsulta motivo = gmoti.obtener(1);
			
			GestionTiposInsititucion gti = new GestionTiposInsititucion();
			TipoInstitucion tipoInsti = gti.obtener(1);
			
			GestionTiposSolicitante gts = new GestionTiposSolicitante();
			TipoSolicitante tipoSoli = gts.obtener(4);
			
			GestionMediosConsulta gmc = new GestionMediosConsulta();
			MedioConsulta medio = gmc.obtener(1);
			
			ConsultaTecnica objc = negocioConsTecnicas.registrarConsultaTecnica(
					clasificacion, tipo, motivo, tipoInsti, "Example Two", "AREA 2", tipoSoli, 
					"Montenegro", "Juan Pablo", "32445433", "10234567894", "789-3273", "2224324554", 
					"juan.montenegro@gmail.com", medio, "Alguna descripcion en la consulta"
					);
			
			Assert.assertNotNull(objc);
			System.out.println("Se insertó la consulta técnica con id: " + objc.getId_ConsultaTecnica());
		} catch (DAOExcepcion e) {
			// TODO Auto-generated catch block
			Assert.fail("Fallo el registro: " + e.getMessage());
		}
		
	}
}
