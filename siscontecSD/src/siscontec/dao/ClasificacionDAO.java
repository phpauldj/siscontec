/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Clasificacion;
import siscontec.util.ConexionBD;

/**
 * @author Paul
 *
 */
public class ClasificacionDAO extends BaseDAO {

	public Clasificacion obtener(int idClasificacion) throws DAOExcepcion {
		Clasificacion vo = new Clasificacion();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_Clasificacion where Id_Clasificacion= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idClasificacion);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_Clasificacion(rs.getInt("Id_Clasificacion"));
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
