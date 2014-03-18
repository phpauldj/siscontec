/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class TipoSolicitante {

	private int Id_Solicitante;
	private String Descripcion;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private int Eliminado;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public TipoSolicitante() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoSolicitante(int id_Solicitante, String descripcion,
			int fechaHoraRegistro, int fechaHoraModificacion, int eliminado,
			String usuarioRegistro, String usuarioModificacion) {
		Id_Solicitante = id_Solicitante;
		Descripcion = descripcion;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		Eliminado = eliminado;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}
	public int getId_Solicitante() {
		return Id_Solicitante;
	}
	public void setId_Solicitante(int id_Solicitante) {
		Id_Solicitante = id_Solicitante;
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
