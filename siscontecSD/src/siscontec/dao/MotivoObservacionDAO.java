/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.MotivoObservacion;
import siscontec.util.ConexionBD;

/**
 * @author Paul
 *
 */
public class MotivoObservacionDAO extends BaseDAO{

	public MotivoObservacion obtener(int idMotivoObservacion) throws DAOExcepcion {
		MotivoObservacion vo = new MotivoObservacion();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_MotivoObservacion where Id_MotivoObservacion= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idMotivoObservacion);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_MotivoObservacion(rs.getInt("Id_MotivoObservacion"));
				vo.setDescripcion(rs.getString("Descripcion"));
				vo.setFechaHoraRegistro(rs.getInt("FechaHoraRegistro"));
				vo.setFechaHoraModificacion(rs.getInt("FechaHoraModificacion"));
				vo.setEliminado(rs.getInt("Eliminado"));
				vo.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
				vo.setUsuarioModificacion(rs.getString("UsuarioModificacion"));
				vo.setFlg_Tipo(rs.getString("Flg_Tipo"));
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
