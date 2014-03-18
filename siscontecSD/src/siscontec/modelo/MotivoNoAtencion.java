/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class MotivoNoAtencion {

	private int Id_MotivoNoAtencion;
	private String Descripcion;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private int Eliminado;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public MotivoNoAtencion() {
		// TODO Auto-generated constructor stub
	}
	
	public MotivoNoAtencion(int id_MotivoNoAtencion, String descripcion,
			int fechaHoraRegistro, int fechaHoraModificacion, int eliminado,
			String usuarioRegistro, String usuarioModificacion) {
		Id_MotivoNoAtencion = id_MotivoNoAtencion;
		Descripcion = descripcion;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		Eliminado = eliminado;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}
	public int getId_MotivoNoAtencion() {
		return Id_MotivoNoAtencion;
	}
	public void setId_MotivoNoAtencion(int id_MotivoNoAtencion) {
		Id_MotivoNoAtencion = id_MotivoNoAtencion;
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
