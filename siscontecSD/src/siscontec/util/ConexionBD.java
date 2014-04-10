package siscontec.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	private static String motorDB = "sql"; //"mysql";

	public static Connection obtenerConexion() throws SQLException {

		Connection con = null;
		try {
			
			if(motorDB.equals("sql")){
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            String url = "jdbc:sqlserver://localhost;databaseName=trabajo;user=sa;password=sa;";
	            con = DriverManager.getConnection(url);
			} else {			
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/trabajo",
						"root", "root");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
