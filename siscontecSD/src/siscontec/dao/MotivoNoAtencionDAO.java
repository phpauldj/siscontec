/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.MotivoNoAtencion;
import siscontec.util.ConexionBD;

/**
 * @author Paul
 *
 */
public class MotivoNoAtencionDAO extends BaseDAO{

	public MotivoNoAtencion obtener(int idMotivoNoAtencion) throws DAOExcepcion {
		MotivoNoAtencion vo = new MotivoNoAtencion();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_MotivoNoAtencion where Id_MotivoNoAtencion= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idMotivoNoAtencion);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_MotivoNoAtencion(rs.getInt("Id_MotivoNoAtencion"));
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
