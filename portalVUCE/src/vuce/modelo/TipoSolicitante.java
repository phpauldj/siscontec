/**
 * 
 */
package vuce.modelo;

/**
 * @author Paul
 *
 */
public class TipoSolicitante {

	private int Id_TipoSolicitante;
	private String Descripcion;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private int Eliminado;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public TipoSolicitante() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoSolicitante(int id_TipoSolicitante, String descripcion,
			int fechaHoraRegistro, int fechaHoraModificacion, int eliminado,
			String usuarioRegistro, String usuarioModificacion) {
		Id_TipoSolicitante = id_TipoSolicitante;
		Descripcion = descripcion;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		Eliminado = eliminado;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}

	public void setId_TipoSolicitante(int id_TipoSolicitante) {
		Id_TipoSolicitante = id_TipoSolicitante;
	}

	public int getId_TipoSolicitante() {
		return Id_TipoSolicitante;
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
