/**
 * 
 */
package vuce.modelo;

/**
 * @author Paul
 *
 */
public class TipoInstitucion {

	private int Id_TipoInstitucion;
	private String Descripcion;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private int Eliminado;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public TipoInstitucion() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoInstitucion(int id_TipoInstitucion, String descripcion,
			int fechaHoraRegistro, int fechaHoraModificacion, int eliminado,
			String usuarioRegistro, String usuarioModificacion) {
		Id_TipoInstitucion = id_TipoInstitucion;
		Descripcion = descripcion;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		Eliminado = eliminado;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}
	public int getId_TipoInstitucion() {
		return Id_TipoInstitucion;
	}
	public void setId_TipoInstitucion(int id_TipoInstitucion) {
		Id_TipoInstitucion = id_TipoInstitucion;
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
