package siscontec.test;

import junit.framework.Assert;
import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Administrador;
import siscontec.negocio.GestionAdministradores;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class AdministradorTest {

	@Test
	public void existeAdminLoginTest(){
		GestionAdministradores negocioAdmin = new GestionAdministradores();
		
		try {
			Administrador a = negocioAdmin.logear("JEMP087", "123456");
			
			Assert.assertNotNull(a);
			System.out.println("Bienvenido Administrador : "+a.getNombres()+" "+a.getApellidos()+" "+a.getObjRol().getIdRol());
			
		} catch (DAOExcepcion e) {
			Assert.fail("Fallo el ingreso");
		}
	}
	
	//@Test
	public void registrarNuevoClienteTest(){
		GestionClientes negocioCliente = new GestionClientes();
		
		try {
			Cliente c = negocioCliente.registrarCuenta("45677765", "Carlos Abraham", "Taboada", "Ortecho", "aortechoqq@gmail.com", "123456", "2603-695");
			
			Assert.assertNotNull(c);
			System.out.println(" Cliente("+c.getIdcliente()+") : " + c.getNombres() + " se ha registrado correctamente");
			
		} catch (DAOExcepcion e) {
			Assert.fail("Fallo el registro: " + e.getMessage());
		}
	}
	
	//@Test
	public void validaDniCorreoExisteTest(){
		GestionClientes negocioCliente = new GestionClientes();
		
		try {
			
			Assert.assertTrue(negocioCliente.validaExistencia("123456", "pacharly89@gmail.com"));
			System.out.println("Cliente ya existe!");
			
		} catch (DAOExcepcion e) {
			Assert.fail("Fallo la validación");
		}
	}
	
	//@Test
	public void registrarReservaCTest(){
		GestionReserva negocioReserva = new GestionReserva();
		
		try {
			GestionLocales gestLocal = new GestionLocales();
			Local local = gestLocal.obtener(1); 
			GestionSalas gestSala = new GestionSalas();
			Sala sala = gestSala.obtener(1);
			GestionClientes negocioCliente = new GestionClientes(); 
			Cliente c = negocioCliente.obtener("pacharly89@gmail.com", "123456");
			
			Reserva r = negocioReserva.registrarReservaCliente(sala, "2013-06-05", "05:00:00", 2, "espero pasar un momento inolvidable por mi cumpleaños", c);
			Assert.assertNotNull(r);
			System.out.println("Se insertó la reserva con id: " + r.getIdreserva());
			
		} catch (DAOExcepcion e) {
			Assert.fail("Fallo el registro: " + e.getMessage());
		}
	}
}
