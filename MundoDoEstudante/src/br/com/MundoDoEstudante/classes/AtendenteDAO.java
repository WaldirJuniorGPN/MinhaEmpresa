package br.com.MundoDoEstudante.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AtendenteDAO {
	
	private ConnectionFactory connection = new ConnectionFactory();
	private String nomeAtendente;
	
	public void inserirAtendenteBanco(String nome) {
		String sql = "INSERT INTO Atendentes(nome) VALUES(?)";
		Connection conn = connection.recuperarConexao();
		
		String selectSql = "SELECT COUNT(*) FROM Atendentes WHERE nome = ?";
		this.nomeAtendente = nome;
		
		try {
			PreparedStatement selectStatement = conn.prepareStatement(selectSql);
			selectStatement.setString(1, nome);
			ResultSet resultSet = selectStatement.executeQuery();
			resultSet.next();
			int count = resultSet.getInt(1);
			resultSet.close();
			if (count > 0) {
				return;
			}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, nome);
			prepareStatement.executeUpdate();
			prepareStatement.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
	
	public void inserirValoresBanco(double vendas, double gratificacao) {
		String sql = "UPDATE Atendentes SET vendas_totais = ?, gratificacao = ? WHERE nome = ?";
		Connection conn = connection.recuperarConexao();
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setDouble(1, vendas);
			prepareStatement.setDouble(2, gratificacao);
			prepareStatement.setNString(3, this.nomeAtendente);
			prepareStatement.executeUpdate();
			prepareStatement.close();
			conn.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
