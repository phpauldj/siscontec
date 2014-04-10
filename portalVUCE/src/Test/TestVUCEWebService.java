/**
 * 
 */
package Test;

import java.rmi.RemoteException;

import edu.upc.sunat.Persona;
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
			ValidaRUC_PortType validar = new ValidaRUC_PortType();
			String respuesta= validar.consultaRuc(ruc, usuario, clave);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
