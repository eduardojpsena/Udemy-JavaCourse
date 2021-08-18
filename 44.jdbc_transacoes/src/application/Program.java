package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		
		 try {
			
			connection = DB.getConnection();
			
			connection.setAutoCommit(false); //faz comque as alterações não sejam confirmadas automaticamente
			
			statement = connection.createStatement();
			
			int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			int x = 1;
			if (x < 2) {
				throw new SQLException("Fake Error!");
			}
			
			int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			connection.commit();  //confirmar a transação
			
			
			
		} catch (SQLException e) {
			try {
				connection.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error try rolleback! Caused by: " + e1.getMessage());
			}
		} finally {
			DB.closeStatement(statement);
			DB.closeConnection();
		}
		
	}

}
