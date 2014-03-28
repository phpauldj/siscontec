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
import siscontec.modelo.Tipo;
import siscontec.util.ConexionBD;

/**
 * @author Paul
 *
 */
public class TipoDAO extends BaseDAO{

	public Tipo obtener(int idLocal) throws DAOExcepcion {
		Tipo vo = new Tipo();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_Tipo where Id_Tipo= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idLocal);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_Tipo(rs.getInt("Id_Tipo"));
				vo.setEliminado(rs.getInt("Eliminado"));
				vo.setFechaHoraRegistro(rs.getInt("FechaHoraRegistro"));
				vo.setFechaHoraModificacion(rs.getInt("FechaHoraModificacion"));
				vo.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
				vo.setUsuarioModificacion(rs.getString("UsuarioModificacion"));
				
				ClasificacionDAO daoc = new ClasificacionDAO();
				Clasificacion objc = daoc.obtener(rs.getInt("Id_Clasificacion"));
				vo.setId_Clasificacion(objc);
				vo.setDescripcion(rs.getString("Descripcion"));
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
