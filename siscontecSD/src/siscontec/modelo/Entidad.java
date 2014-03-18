package siscontec.modelo;

public class Entidad {
	
	private int Id_Entidad;
	private String Descripcion;
	private int Eliminado;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public Entidad() {
		// TODO Auto-generated constructor stub
	}
	
	public Entidad(int id_Entidad, String descripcion, int eliminado,
			int fechaHoraRegistro, int fechaHoraModificacion,
			String usuarioRegistro, String usuarioModificacion) {
		Id_Entidad = id_Entidad;
		Descripcion = descripcion;
		Eliminado = eliminado;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}
	public int getId_Entidad() {
		return Id_Entidad;
	}
	public void setId_Entidad(int id_Entidad) {
		Id_Entidad = id_Entidad;
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
