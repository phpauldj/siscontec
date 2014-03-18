/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.modelo.Rol;
import siscontec.util.ConexionBD;
import siscontec.excepcion.DAOExcepcion;

/**
 * @author Paul
 *
 */
public class RolDAO extends BaseDAO{
	
	public Rol obtener(int idLocal) throws DAOExcepcion {
		Rol vo = new Rol();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from rol where idRol= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idLocal);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setIdRol(rs.getInt("idRol"));
				vo.setNombre(rs.getString("nombre"));
				vo.setDescrip(rs.getString("descrip"));
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
}
