/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.EstadoCT;
import siscontec.util.ConexionBD;

/**
 * @author Paul
 *
 */
public class EstadoCTDAO extends BaseDAO {

	public EstadoCT obtener(int idEstadoCT) throws DAOExcepcion {
		EstadoCT vo = new EstadoCT();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_EstadoCT where Id_EstadoCT= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idEstadoCT);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_EstadoCT(rs.getInt("Id_EstadoCT"));
				vo.setDescripcion(rs.getString("Descripcion"));
				vo.setEliminado(rs.getInt("Eliminado"));
				vo.setFechaHoraRegistro(rs.getInt("FechaHoraRegistro"));
				vo.setFechaHoraModificacion(rs.getInt("FechaHoraModificacion"));
				vo.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
				vo.setUsuarioModificacion(rs.getString("UsuarioModificacion"));
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
