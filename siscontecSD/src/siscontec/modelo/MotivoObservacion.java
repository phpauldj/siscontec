/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class MotivoObservacion {

	private int Id_MotivoObservacion;
	private String Descripcion;
	private int Eliminado;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	private String Flg_Tipo;
	
	public MotivoObservacion() {
		// TODO Auto-generated constructor stub
	}
	
	public MotivoObservacion(int id_MotivoObservacion, String descripcion,
			int eliminado, int fechaHoraRegistro, int fechaHoraModificacion,
			String usuarioRegistro, String usuarioModificacion, String flg_Tipo) {
		Id_MotivoObservacion = id_MotivoObservacion;
		Descripcion = descripcion;
		Eliminado = eliminado;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
		Flg_Tipo = flg_Tipo;
	}
	public int getId_MotivoObservacion() {
		return Id_MotivoObservacion;
	}
	public void setId_MotivoObservacion(int id_MotivoObservacion) {
		Id_MotivoObservacion = id_MotivoObservacion;
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
	public String getFlg_Tipo() {
		return Flg_Tipo;
	}
	public void setFlg_Tipo(String flg_Tipo) {
		Flg_Tipo = flg_Tipo;
	}
	
	
}
