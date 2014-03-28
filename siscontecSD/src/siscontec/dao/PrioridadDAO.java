/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Prioridad;
import siscontec.util.ConexionBD;

/**
 * @author Paul
 *
 */
public class PrioridadDAO extends BaseDAO{

	public Prioridad obtener(int idLocal) throws DAOExcepcion {
		Prioridad vo = new Prioridad();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_Prioridad where Id_Prioridad= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idLocal);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_Prioridad(rs.getInt("Id_Prioridad"));
				vo.setDescripcion(rs.getString("Descripcion"));
				vo.setFechaHoraRegistro(rs.getInt("FechaHoraRegistro"));
				vo.setFechaHoraModificacion(rs.getInt("FechaHoraModificacion"));
				vo.setEliminado(rs.getInt("Eliminado"));
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
