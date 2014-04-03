/**
 * 
 */
package vuce.modelo;

/**
 * @author Paul
 *
 */
public class EstadoCT {
	
	private int Id_EstadoCT;
	private String Descripcion;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private int Eliminado;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public EstadoCT() {
		// TODO Auto-generated constructor stub
	}

	public EstadoCT(int id_EstadoCT, String descripcion, int fechaHoraRegistro,
			int fechaHoraModificacion, int eliminado, String usuarioRegistro,
			String usuarioModificacion) {
		Id_EstadoCT = id_EstadoCT;
		Descripcion = descripcion;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		Eliminado = eliminado;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}

	public int getId_EstadoCT() {
		return Id_EstadoCT;
	}

	public void setId_EstadoCT(int id_EstadoCT) {
		Id_EstadoCT = id_EstadoCT;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
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

	public int getEliminado() {
		return Eliminado;
	}

	public void setEliminado(int eliminado) {
		Eliminado = eliminado;
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
