package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Administrador;
import siscontec.modelo.Rol;
import siscontec.modelo.Usuario;
import siscontec.util.ConexionBD;

public class UsuarioDAO extends BaseDAO{

	public Usuario obtener(String idUsuario) throws DAOExcepcion {
		Usuario vo = new Usuario();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_Usuario where Id_Usuario= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, idUsuario);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_Usuario(rs.getString("Id_Usuario"));
				vo.setApellidos(rs.getString("Apellidos"));
				vo.setNombres(rs.getString("Nombres"));			
				vo.setFechaHoraRegistro(rs.getInt("FechaHoraRegistro"));
				vo.setFechaHoraModificacion(rs.getInt("FechaHoraModificacion"));
				vo.setEliminado(rs.getInt("Eliminado"));
				vo.setArea(rs.getInt("Area"));
				vo.setLogin(rs.getString("Login"));
				vo.setEmail(rs.getString("Email"));
				vo.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
				vo.setUsuarioModificacion(rs.getString("UsuarioModificacion"));
				vo.setContrasenia(rs.getString("Contrasenia"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return vo;
	}
	
	public Usuario logeo(String usuario, String pass) throws DAOExcepcion{
		Usuario vo = new Usuario();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_Usuario where Login=? and Contrasenia=?";
			con = ConexionBD.obtenerConexion();
			if (con!=null) {
				stmt = con.prepareStatement(query);			
				stmt.setString(1, usuario);
				stmt.setString(2, pass);
				rs = stmt.executeQuery();
				
				if (rs.next()) {
					vo.setId_Usuario(rs.getString("Id_Usuario"));
					vo.setApellidos(rs.getString("Apellidos"));
					vo.setNombres(rs.getString("Nombres"));			
					vo.setFechaHoraRegistro(rs.getInt("FechaHoraRegistro"));
					vo.setFechaHoraModificacion(rs.getInt("FechaHoraModificacion"));
					vo.setEliminado(rs.getInt("Eliminado"));
					vo.setArea(rs.getInt("Area"));
					vo.setLogin(rs.getString("Login"));
					vo.setEmail(rs.getString("Email"));
					vo.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
					vo.setUsuarioModificacion(rs.getString("UsuarioModificacion"));
					vo.setContrasenia(rs.getString("Contrasenia"));
				}
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			//throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return vo;
	}
}
