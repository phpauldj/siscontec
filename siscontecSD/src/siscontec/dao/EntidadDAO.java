package siscontec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import siscontec.excepcion.DAOExcepcion;
import siscontec.modelo.Entidad;
import siscontec.util.ConexionBD;

public class EntidadDAO extends BaseDAO {

	public Entidad obtener(int idEntidad) throws DAOExcepcion {
		Entidad vo = new Entidad();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select * from Tm_Entidad where Id_Entidad= ?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, idEntidad);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setId_Entidad(rs.getInt("Id_Entidad"));
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
