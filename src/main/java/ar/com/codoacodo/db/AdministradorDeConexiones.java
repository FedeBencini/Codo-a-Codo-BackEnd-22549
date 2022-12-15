package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	// static significa que no necesito instanciar objeto de la clase para
	// ejecutarlo
	public static Connection getConnection() throws Exception {

		String hosts = "localhost";
		String port = "3306";
		String username = "root";
		String password = "root";
		String dbName = "22549";

		// por usar JDBC, debo armar URL así
		String url = "jdbc:mysql://" + hosts + ":" + port + "/" + dbName + "?serverTimeZone=UTC&useSSL=false";

		// crear instancia de la conexión
		String driverClassName = "com.mysql.cj.jdbc.Driver";

		Class.forName(driverClassName);

		Connection connection = DriverManager.getConnection(url, username, password);

		return connection;
	}
}
