package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Administrador;
import siscontec.modelo.Rol;
import siscontec.util.ConexionBD;

public class AdministradorDAO extends BaseDAO {

	public Administrador registrarCuentaAdministrador(Administrador a) throws DAOExcepcion{
		PersonaDAO pdao = new PersonaDAO();
		Persona p = pdao.insertar(a);
		
		String query = "insert into administrador(tipo, dni) values(?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, a.getTipo());
			stmt.setString(2, p.getDni());
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo insertar");
			}
			// Obtener el ultimo id
			int id = 0;
			query = "select last_insert_id()";
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1);
			}
			a.setIdadministrador(id);
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return a;
	}
	

	public Administrador obtener(String tipo) throws DAOExcepcion{
		Administrador a = new Administrador();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select p.*,a.idadministrador,a.tipo from administrador a inner join persona p on a.dni=p.dni where tipo=?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, tipo);
			rs = stmt.executeQuery();
			if (rs.next()) {
				a.setIdadministrador(rs.getInt("idadministrador"));
				a.setNombres(rs.getString("nombres"));
				a.setPaterno(rs.getString("paterno"));
				a.setMaterno(rs.getString("materno"));
				a.setDni(rs.getString("dni"));
				
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return a;
	}
	public Administrador obtenerPorID(int idadministrador) throws DAOExcepcion{
		Administrador a = new Administrador();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select p.*,a.idadministrador,a.tipo from administrador a inner join persona p on a.dni=p.dni where a.idadministrador=?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idadministrador);
			rs = stmt.executeQuery();
			if (rs.next()) {
				a.setIdadministrador(rs.getInt("idadministrador"));
				a.setNombres(rs.getString("nombres"));
				a.setPaterno(rs.getString("paterno"));
				a.setMaterno(rs.getString("materno"));
				a.setTipo(rs.getString("tipo"));
				a.setDni(rs.getString("dni"));
				
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return a;
	}
		
	public Collection<Administrador> buscarPorDni(String dni)
			throws DAOExcepcion {
		String query = "select p.*,a.idadministrador, a.tipo from administrador a inner join persona p on a.dni=p.dni where p.dni=?";
		Collection<Administrador> lista = new ArrayList<Administrador>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, dni);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Administrador a = new Administrador();
				a.setIdadministrador(rs.getInt("idadministrador"));
				a.setNombres(rs.getString("nombres"));
				a.setPaterno(rs.getString("paterno"));
				a.setMaterno(rs.getString("materno"));
				a.setDni(rs.getString("dni"));
				a.setTipo(rs.getString("tipo"));
				
				lista.add(a);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return lista;
	}
	
	public Collection<Administrador> listar() throws DAOExcepcion {
		String query = "select p.*,a.idadministrador,a.tipo from administrador a inner join persona p on a.dni=p.dni ";
		Collection<Administrador> lista = new ArrayList<Administrador>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				Administrador a = new Administrador();
				a.setIdadministrador(rs.getInt("idadministrador"));
				a.setNombres(rs.getString("nombres"));
				a.setPaterno(rs.getString("paterno"));
				a.setMaterno(rs.getString("materno"));
				a.setTipo(rs.getString("tipo"));
				a.setDni(rs.getString("dni"));
				
				lista.add(a);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return lista;
	}
	
	public Administrador logeo(String usuario, String pass) throws DAOExcepcion{
		Administrador a = new Administrador();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select a.* from administrador a where a.usuario=? and a.contrasena=?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, usuario);
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			if (rs.next()) {
				a.setIdAdmin(rs.getInt("idAdmin"));
				a.setNombres(rs.getString("nombres"));
				a.setApellidos(rs.getString("apellidos"));
				a.setContrasena(rs.getString("contrasena"));
				a.setUsuario(rs.getString("usuario"));
				
				RolDAO rdao = new RolDAO();
				Rol rol = rdao.obtener(rs.getInt("idRol"));
				a.setObjRol(rol);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return a;
	}
}
