/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class Tipo {

	private int Id_Tipo;
	private int Eliminado;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	private Clasificacion Id_Clasificacion;
	private String Descripcion;
	
	public Tipo() {
		// TODO Auto-generated constructor stub
	}
	
	public Tipo(int id_Tipo, int eliminado, int fechaHoraRegistro,
			int fechaHoraModificacion, String usuarioRegistro,
			String usuarioModificacion, Clasificacion id_Clasificacion,
			String descripcion) {
		Id_Tipo = id_Tipo;
		Eliminado = eliminado;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
		Id_Clasificacion = id_Clasificacion;
		Descripcion = descripcion;
	}
	public int getId_Tipo() {
		return Id_Tipo;
	}
	public void setId_Tipo(int id_Tipo) {
		Id_Tipo = id_Tipo;
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
	public Clasificacion getId_Clasificacion() {
		return Id_Clasificacion;
	}
	public void setId_Clasificacion(Clasificacion id_Clasificacion) {
		Id_Clasificacion = id_Clasificacion;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
