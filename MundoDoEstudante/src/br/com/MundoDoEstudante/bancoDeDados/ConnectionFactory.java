package br.com.MundoDoEstudante.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperarConexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mundo?user=root&password=1102");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
