/**
 * 
 */
package siscontec.modelo;

/**
 * @author Paul
 *
 */
public class ConsultaTecnica {

	private int Id_ConsultaTecnica;
	private String Institucion;
	private String Codigo_Vuce;
	private String Area;
	private String Apellidos;
	private String Nombres;
	private String Telefono;
	private String Fax;
	private Tipo Id_Tipo;
	private int FechaHoraRegistro;
	private String Codigo_Digemid;
	private String Email;
	private TipoSolicitante Id_TipoSolicitante;
	private MotivoConsulta Id_MotivoConsulta;
	private int FechaHoraCierre;
	private String Flg_Origen;
	private String UsuarioRegistro;
	private String Flg_Notificado;
	private String UsuarioModificacion;
	private int FechaHoraNotificacion;
	private TipoInstitucion Id_TipoInstitucion;
	private String Clave;
	private Entidad Id_Entidad;
	private MotivoNoAtencion Id_MotivoNoAtencion;
	private int FechaHoraModificacion;
	private EstadoCT Id_EstadoCT;
	private MedioConsulta Id_MedioConsulta;
	private Clasificacion Id_Clasificacion;
	private Prioridad Id_Prioridad;
	private MotivoObservacion Id_MotivoObservacion;
	private Usuario Id_Responsable;
	private String Descripcion;
	private int FechaHoraVencimiento;
	private int FechaHoraObservacion;
	private int FechaHoraPlazoNotificacion;
	private String Flg_Autoriza;
	private String DNI;
	private String RUC;
	private int id_Transmision;
	
	public ConsultaTecnica() {
		// TODO Auto-generated constructor stub
	}
	

	public ConsultaTecnica(int id_ConsultaTecnica, String institucion,
			String codigo_Vuce, String area, String apellidos, String nombres,
			String telefono, String fax, Tipo id_Tipo, int fechaHoraRegistro,
			String codigo_Digemid, String email,
			TipoSolicitante id_TipoSolicitante,
			MotivoConsulta id_MotivoConsulta, int fechaHoraCierre,
			String flg_Origen, String usuarioRegistro, String flg_Notificado,
			String usuarioModificacion, int fechaHoraNotificacion,
			TipoInstitucion id_TipoInstitucion, String clave,
			Entidad id_Entidad, MotivoNoAtencion id_MotivoNoAtencion,
			int fechaHoraModificacion, EstadoCT id_EstadoCT,
			MedioConsulta id_MedioConsulta, Clasificacion id_Clasificacion,
			Prioridad id_Prioridad, MotivoObservacion id_MotivoObservacion,
			Usuario id_Responsable, String descripcion,
			int fechaHoraVencimiento, int fechaHoraObservacion,
			int fechaHoraPlazoNotificacion, String flg_Autoriza, String dNI,
			String rUC, int id_Transmision) {
		Id_ConsultaTecnica = id_ConsultaTecnica;
		Institucion = institucion;
		Codigo_Vuce = codigo_Vuce;
		Area = area;
		Apellidos = apellidos;
		Nombres = nombres;
		Telefono = telefono;
		Fax = fax;
		Id_Tipo = id_Tipo;
		FechaHoraRegistro = fechaHoraRegistro;
		Codigo_Digemid = codigo_Digemid;
		Email = email;
		Id_TipoSolicitante = id_TipoSolicitante;
		Id_MotivoConsulta = id_MotivoConsulta;
		FechaHoraCierre = fechaHoraCierre;
		Flg_Origen = flg_Origen;
		UsuarioRegistro = usuarioRegistro;
		Flg_Notificado = flg_Notificado;
		UsuarioModificacion = usuarioModificacion;
		FechaHoraNotificacion = fechaHoraNotificacion;
		Id_TipoInstitucion = id_TipoInstitucion;
		Clave = clave;
		Id_Entidad = id_Entidad;
		Id_MotivoNoAtencion = id_MotivoNoAtencion;
		FechaHoraModificacion = fechaHoraModificacion;
		Id_EstadoCT = id_EstadoCT;
		Id_MedioConsulta = id_MedioConsulta;
		Id_Clasificacion = id_Clasificacion;
		Id_Prioridad = id_Prioridad;
		Id_MotivoObservacion = id_MotivoObservacion;
		Id_Responsable = id_Responsable;
		Descripcion = descripcion;
		FechaHoraVencimiento = fechaHoraVencimiento;
		FechaHoraObservacion = fechaHoraObservacion;
		FechaHoraPlazoNotificacion = fechaHoraPlazoNotificacion;
		Flg_Autoriza = flg_Autoriza;
		DNI = dNI;
		RUC = rUC;
		this.id_Transmision = id_Transmision;
	}


	public int getId_ConsultaTecnica() {
		return Id_ConsultaTecnica;
	}

	public void setId_ConsultaTecnica(int id_ConsultaTecnica) {
		Id_ConsultaTecnica = id_ConsultaTecnica;
	}

	public String getInstitucion() {
		return Institucion;
	}

	public void setInstitucion(String institucion) {
		Institucion = institucion;
	}

	public String getCodigo_Vuce() {
		return Codigo_Vuce;
	}

	public void setCodigo_Vuce(String codigo_Vuce) {
		Codigo_Vuce = codigo_Vuce;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
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

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public Tipo getId_Tipo() {
		return Id_Tipo;
	}

	public void setId_Tipo(Tipo id_Tipo) {
		Id_Tipo = id_Tipo;
	}

	public int getFechaHoraRegistro() {
		return FechaHoraRegistro;
	}

	public void setFechaHoraRegistro(int fechaHoraRegistro) {
		FechaHoraRegistro = fechaHoraRegistro;
	}

	public String getCodigo_Digemid() {
		return Codigo_Digemid;
	}

	public void setCodigo_Digemid(String codigo_Digemid) {
		Codigo_Digemid = codigo_Digemid;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public TipoSolicitante getId_TipoSolicitante() {
		return Id_TipoSolicitante;
	}

	public void setId_TipoSolicitante(TipoSolicitante id_TipoSolicitante) {
		Id_TipoSolicitante = id_TipoSolicitante;
	}

	public MotivoConsulta getId_MotivoConsulta() {
		return Id_MotivoConsulta;
	}

	public void setId_MotivoConsulta(MotivoConsulta id_MotivoConsulta) {
		Id_MotivoConsulta = id_MotivoConsulta;
	}

	public int getFechaHoraCierre() {
		return FechaHoraCierre;
	}

	public void setFechaHoraCierre(int fechaHoraCierre) {
		FechaHoraCierre = fechaHoraCierre;
	}

	public String getFlg_Origen() {
		return Flg_Origen;
	}

	public void setFlg_Origen(String flg_Origen) {
		Flg_Origen = flg_Origen;
	}

	public String getUsuarioRegistro() {
		return UsuarioRegistro;
	}

	public void setUsuarioRegistro(String usuarioRegistro) {
		UsuarioRegistro = usuarioRegistro;
	}

	public String getFlg_Notificado() {
		return Flg_Notificado;
	}

	public void setFlg_Notificado(String flg_Notificado) {
		Flg_Notificado = flg_Notificado;
	}

	public String getUsuarioModificacion() {
		return UsuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		UsuarioModificacion = usuarioModificacion;
	}

	public int getFechaHoraNotificacion() {
		return FechaHoraNotificacion;
	}

	public void setFechaHoraNotificacion(int fechaHoraNotificacion) {
		FechaHoraNotificacion = fechaHoraNotificacion;
	}

	public TipoInstitucion getId_TipoInstitucion() {
		return Id_TipoInstitucion;
	}

	public void setId_TipoInstitucion(TipoInstitucion id_TipoInstitucion) {
		Id_TipoInstitucion = id_TipoInstitucion;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public Entidad getId_Entidad() {
		return Id_Entidad;
	}

	public void setId_Entidad(Entidad id_Entidad) {
		Id_Entidad = id_Entidad;
	}

	public MotivoNoAtencion getId_MotivoNoAtencion() {
		return Id_MotivoNoAtencion;
	}

	public void setId_MotivoNoAtencion(MotivoNoAtencion id_MotivoNoAtencion) {
		Id_MotivoNoAtencion = id_MotivoNoAtencion;
	}

	public int getFechaHoraModificacion() {
		return FechaHoraModificacion;
	}

	public void setFechaHoraModificacion(int fechaHoraModificacion) {
		FechaHoraModificacion = fechaHoraModificacion;
	}

	public EstadoCT getId_EstadoCT() {
		return Id_EstadoCT;
	}

	public void setId_EstadoCT(EstadoCT id_EstadoCT) {
		Id_EstadoCT = id_EstadoCT;
	}

	public MedioConsulta getId_MedioConsulta() {
		return Id_MedioConsulta;
	}

	public void setId_MedioConsulta(MedioConsulta id_MedioConsulta) {
		Id_MedioConsulta = id_MedioConsulta;
	}

	public Clasificacion getId_Clasificacion() {
		return Id_Clasificacion;
	}

	public void setId_Clasificacion(Clasificacion id_Clasificacion) {
		Id_Clasificacion = id_Clasificacion;
	}

	public Prioridad getId_Prioridad() {
		return Id_Prioridad;
	}

	public void setId_Prioridad(Prioridad id_Prioridad) {
		Id_Prioridad = id_Prioridad;
	}

	public MotivoObservacion getId_MotivoObservacion() {
		return Id_MotivoObservacion;
	}

	public void setId_MotivoObservacion(MotivoObservacion id_MotivoObservacion) {
		Id_MotivoObservacion = id_MotivoObservacion;
	}

	public Usuario getId_Responsable() {
		return Id_Responsable;
	}

	public void setId_Responsable(Usuario id_Responsable) {
		Id_Responsable = id_Responsable;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getFechaHoraVencimiento() {
		return FechaHoraVencimiento;
	}

	public void setFechaHoraVencimiento(int fechaHoraVencimiento) {
		FechaHoraVencimiento = fechaHoraVencimiento;
	}

	public int getFechaHoraObservacion() {
		return FechaHoraObservacion;
	}

	public void setFechaHoraObservacion(int fechaHoraObservacion) {
		FechaHoraObservacion = fechaHoraObservacion;
	}

	public int getFechaHoraPlazoNotificacion() {
		return FechaHoraPlazoNotificacion;
	}

	public void setFechaHoraPlazoNotificacion(int fechaHoraPlazoNotificacion) {
		FechaHoraPlazoNotificacion = fechaHoraPlazoNotificacion;
	}

	public String getFlg_Autoriza() {
		return Flg_Autoriza;
	}

	public void setFlg_Autoriza(String flg_Autoriza) {
		Flg_Autoriza = flg_Autoriza;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	public int getId_Transmision() {
		return id_Transmision;
	}

	public void setId_Transmision(int id_Transmision) {
		this.id_Transmision = id_Transmision;
	}
	
}
