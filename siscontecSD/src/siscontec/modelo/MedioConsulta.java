/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class MedioConsulta {

	private int Id_MedioConsulta;
	private String Descripcion;
	private int Eliminado;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	
	public MedioConsulta() {
		// TODO Auto-generated constructor stub
	}
	
	

	public MedioConsulta(int id_MedioConsulta, String descripcion,
			int eliminado, int fechaHoraRegistro, int fechaHoraModificacion,
			String usuarioRegistro, String usuarioModificacion) {
		Id_MedioConsulta = id_MedioConsulta;
		Descripcion = descripcion;
		Eliminado = eliminado;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}



	public int getId_MedioConsulta() {
		return Id_MedioConsulta;
	}

	public void setId_MedioConsulta(int id_MedioConsulta) {
		Id_MedioConsulta = id_MedioConsulta;
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
