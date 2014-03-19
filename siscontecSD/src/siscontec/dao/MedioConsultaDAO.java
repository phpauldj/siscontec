/**
 * 
 */
package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.MedioConsulta;
import siscontec.util.ConexionBD;

/**
 * @author Paul
 *
 */
public class MedioConsultaDAO extends BaseDAO {

	public MedioConsulta obtener(int idMedioConsulta) throws DAOExcepcion {
		MedioConsulta vo = new MedioConsulta();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_MedioConsulta where Id_MedioConsulta= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idMedioConsulta);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_MedioConsulta(rs.getInt("Id_MedioConsulta"));
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
