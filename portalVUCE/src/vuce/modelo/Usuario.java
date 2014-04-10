/**
 * 
 */
package vuce.modelo;

/**
 * @author Paul
 *
 */
public class Usuario {

	private String Id_Usuario;
	private String Apellidos;
	private String Nombres;
	private int FechaHoraRegistro;
	private int FechaHoraModificacion;
	private int Eliminado;
	private int Area;
	private String Login;
	private String Email;
	private String UsuarioRegistro;
	private String UsuarioModificacion;
	private String Contrasenia;

	public Usuario() {
		// TODO Auto-generated constructor stub
		this.Id_Usuario = "";
		this.Apellidos = "";
		this.Nombres = "";
		this.Login = "";
		this.Email = "";
		this.UsuarioRegistro = "";
		this.UsuarioModificacion = "";
		this.Contrasenia = "";
	}
	
	public Usuario(String id_Usuario, String apellidos, String nombres,
			int fechaHoraRegistro, int fechaHoraModificacion, int eliminado,
			int area, String login, String email, String usuarioRegistro,
			String usuarioModificacion) {
		Id_Usuario = id_Usuario;
		Apellidos = apellidos;
		Nombres = nombres;
		FechaHoraRegistro = fechaHoraRegistro;
		FechaHoraModificacion = fechaHoraModificacion;
		Eliminado = eliminado;
		Area = area;
		this.Login = login;
		Email = email;
		UsuarioRegistro = usuarioRegistro;
		UsuarioModificacion = usuarioModificacion;
	}
	public String getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(String id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
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
	public int getArea() {
		return Area;
	}
	public void setArea(int area) {
		Area = area;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		this.Login = login;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
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
	
	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}
}
