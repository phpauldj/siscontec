/**
 * 
 */
package siscontec.test;

import junit.framework.Assert;

import org.junit.Test;

import siscontec.modelo.ConsultaTecnica;
import siscontec.negocio.GestionConsultasTecnicas;

/**
 * @author Paul
 *
 */
@SuppressWarnings("deprecation")
public class ConsultaTecnicaTest {

	@Test
	public void RegistrarNuevaConsultaTecnicaTest(){
		GestionConsultasTecnicas negocioConsTecnicas = new GestionConsultasTecnicas();
		
		ConsultaTecnica = negocioConsTecnicas.registrarConsultaTecnica(
				clasificacion, tipo, motivo, tipoInsti, institucion, area, tipoSoli, 
				apellidos, nombres, dni, ruc, telefono, fax, email, medio
				);
		
	}
}
