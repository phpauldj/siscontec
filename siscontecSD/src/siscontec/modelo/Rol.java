/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class Rol {

	private int idRol;
	private String nombre;
	private String descrip;
		
	public Rol(int idRol, String nombre, String descrip) {
		this.idRol = idRol;
		this.nombre = nombre;
		this.descrip = descrip;
	}
	public Rol() {
		// TODO Auto-generated constructor stub
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	
}
