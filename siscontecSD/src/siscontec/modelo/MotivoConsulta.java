/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class MotivoConsulta {

	private int Id_MotivoConsulta;
	private String Descripcion;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private int Eliminado;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public MotivoConsulta() {
		// TODO Auto-generated constructor stub
	}
	
	public MotivoConsulta(int id_MotivoConsulta, String descripcion,
			int fechaHoraRegistro, int fechaHoraModificacion, int eliminado,
			String usuarioRegistro, String usuarioModificacion) {
		Id_MotivoConsulta = id_MotivoConsulta;
		Descripcion = descripcion;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		Eliminado = eliminado;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}
	public int getId_MotivoConsulta() {
		return Id_MotivoConsulta;
	}
	public void setId_MotivoConsulta(int id_MotivoConsulta) {
		Id_MotivoConsulta = id_MotivoConsulta;
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
