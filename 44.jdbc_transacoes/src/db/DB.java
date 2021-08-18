package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
	
	//metodos estáticos auxiliares para obter e fechar uma conexão com o banco de dados
	
	private static Connection connection = null;
	
	public static Connection getConnection() {
		if (connection == null) {
			try {
				
				Properties properties = loadProperties();
				String url = properties.getProperty("dburl");
				connection = DriverManager.getConnection(url, properties);
				System.out.println("- Conexão estabelecida -");
				
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		} 
		return connection;
	}
	
	public static void closeConnection() {
		if (connection != null) {
			try {
			connection.close();
			System.out.println("- Conexão encerrada -");
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeStatement(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
				System.out.println("- Statement encerrado -");
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeResultSet(ResultSet resultSet) {
		if (resultSet != null) {
			
			try {
				resultSet.close();
				System.out.println("- ResultSet encerrado -");
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")){
			
			Properties properties = new Properties();
			properties.load(fs);
			return properties;
			
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
}
