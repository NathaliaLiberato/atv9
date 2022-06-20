package atividade9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


	public Connection recuperarConexao() throws SQLException {
		return DriverManager
				.getConnection
				("jdbc:mysql://localhost:3306/produto?useTimezone=true&serverTimezone=UTC",
						"root", "82467391");
	}
}
