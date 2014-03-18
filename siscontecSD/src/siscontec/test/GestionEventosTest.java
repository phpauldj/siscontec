package siscontec.test;

import java.util.Collection;
import junit.framework.Assert;
import org.junit.Test;

import karaoke.dao.LocalDAO;
import karaoke.excepcion.DAOExcepcion;
import karaoke.modelo.Evento;
import karaoke.modelo.Local;
import karaoke.negocio.GestionEventos;

public class GestionEventosTest {

	//@Test
	public void insertarTest() {

		GestionEventos negocio = new GestionEventos();

		try {
			LocalDAO ldao = new LocalDAO();
			Local local = ldao.obtener(1);
			Evento c = negocio.insertar("D�a del trabajo", "20130501", 10,
					"Celebramos el d�a del trabajo", false, local);
			System.out.println("Se insert� el id: " + c.getIdevento());

		} catch (DAOExcepcion e) {
			Assert.fail("Fallo la inserci�n: " + e.getMessage());
		}
	}

	@Test
	public void actualizarTest() {

		GestionEventos negocio = new GestionEventos();

		try {
			negocio.actualizar(1, "Happy","20130615", 20, "Happy del Padrino",true);
			Evento nuevo = negocio.obtener(1);
			Assert.assertEquals("Happy del Padrino", nuevo.getDescripcion());

		} catch (DAOExcepcion e) {
			Assert.fail("Fall� la actualizaci�n: " + e.getMessage());
		}
	}

	// @Test
	public void listarTest() {

		GestionEventos negocio = new GestionEventos();

		try {
			Collection<Evento> listado = negocio.listar();

			System.out.println(listado.size());

			for (Evento Evento : listado) {
				System.out.println(Evento.getNombre());
			}

			Assert.assertTrue(listado.size() > 0);

		} catch (DAOExcepcion e) {
			Assert.fail("Fall� el listado: " + e.getMessage());
		}
	}

	// @Test
	public void eliminarTest() {
		GestionEventos negocio = new GestionEventos();
		try {
			negocio.eliminar(3);
			Evento nuevo = negocio.obtener(3);
			Assert.assertEquals(true, nuevo.isElog());
		} catch (DAOExcepcion e) {
			Assert.fail("Fall� la eliminici�n: " + e.getMessage());
		}
	}

	//@Test
	public void buscarPorLocalyNombreTest() {

		GestionEventos negocio = new GestionEventos();

		try {
			Collection<Evento> listado = negocio.buscarPorLocalyNombre(1, "Happy");

			System.out.println("Coincidencias:" + "\t" + listado.size());
			System.out
					.println("IdSala\tNombre de la Sala\tCapaci.\tDescripcion");
			for (Evento evento : listado) {

				System.out.println(evento.getIdevento() + "\t" + evento.getNombre()
						+ "\t" + evento.getCapacidad() + "\t"
						+ evento.getDescripcion());

			}

			Assert.assertTrue(listado.size() > 0);

		} catch (DAOExcepcion e) {
			Assert.fail("Fall� el listado: " + e.getMessage());
		}
	}

}