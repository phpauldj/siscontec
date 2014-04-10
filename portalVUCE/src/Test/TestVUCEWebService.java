/**
 * 
 */
package Test;

import edu.upc.sunat.Persona;
import edu.upc.sunat.ValidaRUCProxy;
import edu.upc.sunat.ValidaRUC_PortType;

/**
 * @author Melissa
 *
 */
public class TestVUCEWebService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ValidaRUC_PortType validar = new ValidaRUCProxy();
			Persona persona = validar.consultaRuc("10458164326", "", "");
			if(persona!=null){
				System.out.println("BIENVENIDO : "+persona.getNombre()+" "+persona.getApellido());
			} else {
				System.out.println("Persona no encontrada");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
