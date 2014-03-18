package siscontec.modelo;

public class Administrador {
	private int idAdmin;
	private String nombres;
	private String apellidos;
	private String usuario;
	private String contrasena;
	private Rol objRol;
	
	public Administrador(){
		
	}

	public Administrador(int idAdmin, String nombres, String apellidos,
			String usuario, String contrasena, Rol objRol) {
		super();
		//this.idAdmin = idAdmin;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.objRol = objRol;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Rol getObjRol() {
		return objRol;
	}

	public void setObjRol(Rol objRol) {
		this.objRol = objRol;
	}
	
	

}
