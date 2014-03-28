/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.TipoSolicitante;
import siscontec.util.ConexionBD;

/**
 * @author Paul
 *
 */
public class TipoSolicitanteDAO extends BaseDAO{

	public TipoSolicitante obtener(int idLocal) throws DAOExcepcion {
		TipoSolicitante vo = new TipoSolicitante();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_TipoSolicitante where Id_TipoSolicitante= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idLocal);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_TipoSolicitante(rs.getInt("Id_TipoSolicitante"));
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
