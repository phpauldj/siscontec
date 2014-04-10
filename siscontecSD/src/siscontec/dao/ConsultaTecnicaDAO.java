/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.ConsultaTecnica;
import siscontec.modelo.MotivoConsulta;
import siscontec.modelo.Tipo;
import siscontec.modelo.TipoInstitucion;
import siscontec.modelo.TipoSolicitante;
import siscontec.util.ConexionBD;
import siscontec.util.DateFormat;

/**
 * @author Paul
 *
 */
public class ConsultaTecnicaDAO extends BaseDAO {
	
	public ConsultaTecnica obtener(int idConsultaTecnica) throws DAOExcepcion {
		ConsultaTecnica vo = new ConsultaTecnica();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tt_ConsultaTecnica where Id_ConsultaTecnica= ?";
			con = ConexionBD.obtenerConexion();
			if (con!=null) {
				stmt = con.prepareStatement(query);
				stmt.setInt(1, idConsultaTecnica);
				rs = stmt.executeQuery();
			}
			if (rs != null && rs.next()) {
				vo.setId_ConsultaTecnica(rs.getInt("Id_ConsultaTecnica"));
				vo.setInstitucion(rs.getString("Institucion"));
				vo.setCodigo_Vuce(rs.getString("Codigo_Vuce"));
				vo.setArea(rs.getString("Area"));
				vo.setApellidos(rs.getString("Apellidos"));
				vo.setNombres(rs.getString("Nombres"));
				vo.setTelefono(rs.getString("Telefono"));
				vo.setFax(rs.getString("Fax"));
				
				TipoDAO daot = new TipoDAO();
				Tipo tip = daot.obtener(rs.getInt("Id_Tipo"));
				vo.setId_Tipo(tip);
				
				vo.setFechaHoraRegistro(rs.getInt("FechaHoraRegistro"));
				vo.setCodigo_Digemid(rs.getString("Codigo_Digemid"));
				vo.setEmail(rs.getString("Email"));
				
				TipoSolicitanteDAO daots = new TipoSolicitanteDAO();
				TipoSolicitante ts = daots.obtener(rs.getInt("Id_TipoSolicitante"));
				vo.setId_TipoSolicitante(ts);
				
				MotivoConsultaDAO daom = new MotivoConsultaDAO();
				MotivoConsulta mc = daom.obtener(rs.getInt("Id_MotivoConsulta"));
				vo.setId_MotivoConsulta(mc);
				
				vo.setFechaHoraCierre(rs.getInt("FechaHoraCierre"));
				vo.setFlg_Origen(rs.getString("Flg_Origen"));
				vo.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
				vo.setFlg_Notificado(rs.getString("Flg_Notificado"));
				vo.setUsuarioModificacion(rs.getString("UsuarioModificacion"));
				vo.setFechaHoraNotificacion(rs.getInt("FechaHoraNotificacion"));
				
				TipoInstitucionDAO daoti = new TipoInstitucionDAO();
				TipoInstitucion ti = daoti.obtener(rs.getInt("Id_TipoInstitucion"));
				vo.setId_TipoInstitucion(ti);
				
				vo.setClave(rs.getString("Clave"));
				
				EntidadDAO daoe = new EntidadDAO();
				vo.setId_Entidad(daoe.obtener(rs.getInt("Id_Entidad")));
				
				MotivoNoAtencionDAO daomna = new MotivoNoAtencionDAO();
				vo.setId_MotivoNoAtencion(daomna.obtener(rs.getInt("Id_MotivoNoAtencion")));
				
				vo.setFechaHoraModificacion(rs.getInt("FechaHoraModificacion"));
				
				EstadoCTDAO daoect = new EstadoCTDAO();
				vo.setId_EstadoCT(daoect.obtener(rs.getInt("Id_EstadoCT")));
				
				MedioConsultaDAO daomc = new MedioConsultaDAO();
				vo.setId_MedioConsulta(daomc.obtener(rs.getInt("Id_MedioConsulta")));
				
				ClasificacionDAO daoc = new ClasificacionDAO();
				vo.setId_Clasificacion(daoc.obtener(rs.getInt("Id_Clasificacion")));
				
				PrioridadDAO daop = new PrioridadDAO();
				vo.setId_Prioridad(daop.obtener(rs.getInt("Id_Prioridad")));
				
				MotivoObservacionDAO daomo = new MotivoObservacionDAO();
				vo.setId_MotivoObservacion(daomo.obtener(rs.getInt("Id_MotivoObservacion")));
				
				UsuarioDAO daou = new UsuarioDAO();
				vo.setId_Responsable(daou.obtener(rs.getString("Id_Responsable")));
				
				vo.setDescripcion(rs.getString("Descripcion"));
				vo.setFechaHoraVencimiento(rs.getInt("FechaHoraVencimiento"));
				vo.setFechaHoraObservacion(rs.getInt("FechaHoraObservacion"));
				vo.setFechaHoraPlazoNotificacion(rs.getInt("FechaHoraPlazoNotificacion"));
				vo.setFlg_Autoriza(rs.getString("Flg_Autoriza"));
				vo.setDNI(rs.getString("DNI"));
				vo.setRUC(rs.getString("RUC"));
				vo.setId_Transmision(rs.getInt("Id_Transmision"));				
			}
		} catch (SQLException e) {
			//System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return vo;
	}
	
	@SuppressWarnings("resource")
	public ConsultaTecnica registrarConsultaTecnica(ConsultaTecnica ct) throws DAOExcepcion{
		String query = "insert into Tt_ConsultaTecnica(Institucion, Area, Apellidos, Nombres, Telefono, Fax, Id_Tipo, Email, Id_TipoSolicitante," +
						"Id_MotivoConsulta, Id_TipoInstitucion, Id_MedioConsulta, Id_Clasificacion, Descripcion, DNI, RUC,"+ 
						"FechaHoraRegistro,Flg_Origen, Id_EstadoCT, Id_Prioridad) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,0,1,2)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, ct.getInstitucion());
			stmt.setString(2, ct.getArea());
			stmt.setString(3, ct.getApellidos());
			stmt.setString(4, ct.getNombres());
			stmt.setString(5, ct.getTelefono());
			stmt.setString(6, ct.getFax());
			stmt.setInt(7, ct.getId_Tipo().getId_Tipo());
			stmt.setString(8, ct.getEmail());
			stmt.setInt(9, ct.getId_TipoSolicitante().getId_TipoSolicitante());
			stmt.setInt(10, ct.getId_MotivoConsulta().getId_MotivoConsulta());
			stmt.setInt(11, ct.getId_TipoInstitucion().getId_TipoInstitucion());
			stmt.setInt(12, ct.getId_MedioConsulta().getId_MedioConsulta());
			stmt.setInt(13, ct.getId_Clasificacion().getId_Clasificacion());
			stmt.setString(14, ct.getDescripcion());
			stmt.setString(15, ct.getDNI());
			stmt.setString(16, ct.getRUC());
			
			long output = Long.valueOf(DateFormat.getNow().getTime()/1000).intValue();
			
			stmt.setLong(17, output);
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo insertar");
			}
			// Obtener el ultimo id
			int id = 0;
			query = "select scope_identity()";
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1);
			}
			ct.setId_ConsultaTecnica(id);
			
		} catch (SQLException e) {
			//System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return ct;
	}
}
