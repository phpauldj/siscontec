/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class Prioridad {
	
	private int Id_Prioridad;
	private String Descripcion;
	private int Eliminado;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public Prioridad() {
		// TODO Auto-generated constructor stub
	}
	
	public Prioridad(int id_Prioridad, String descripcion, int eliminado,
			int fechaHoraRegistro, int fechaHoraModificacion,
			String usuarioRegistro, String usuarioModificacion) {
		Id_Prioridad = id_Prioridad;
		Descripcion = descripcion;
		Eliminado = eliminado;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}



	public int getId_Prioridad() {
		return Id_Prioridad;
	}
	public void setId_Prioridad(int id_Prioridad) {
		Id_Prioridad = id_Prioridad;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getEliminado() {
		return Eliminado;
	}
	public void setEliminado(int eliminado) {
		Eliminado = eliminado;
	}
	public int getFechaHoraRegistro() {
		return FechaHoraRegistro;
	}
	public void setFechaHoraRegistro(int fechaHoraRegistro) {
		FechaHoraRegistro = fechaHoraRegistro;
	}
	public int getFechaHoraModificacion() {
		return FechaHoraModificacion;
	}
	public void setFechaHoraModificacion(int fechaHoraModificacion) {
		FechaHoraModificacion = fechaHoraModificacion;
	}
	public String getUsuarioRegistro() {
		return UsuarioRegistro;
	}
	public void setUsuarioRegistro(String usuarioRegistro) {
		UsuarioRegistro = usuarioRegistro;
	}
	public String getUsuarioModificacion() {
		return UsuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		UsuarioModificacion = usuarioModificacion;
	}

	
}
