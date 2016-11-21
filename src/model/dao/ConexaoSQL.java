package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQL {

	public static java.sql.Connection getConexaoSQL() {

		Connection connection = null;
		try {
			// Carrega o driver JDBC
			String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // JDBC

			Class.forName(driverName); // Create a conexao com Banco de dados
//			String serverName = "54.166.242.183:1433";
//			String mydatabase = "teste";
//			String url = "jdbc:sqlserver://" + serverName + ";" + mydatabase; // a
//
//			String username = "SA";
//			String password = "Iel174_2016";
			connection = DriverManager.getConnection("jdbc:sqlserver://54.166.242.183:1433;DatabaseName=teste", "SA", "Iel174_2016");
		} catch (ClassNotFoundException e) {
			// Não pode encontrar o driver para Conectar
		} catch (SQLException e) {
			// Não pode efetuar a conexao com o banco
		}
		return connection;
	}
}