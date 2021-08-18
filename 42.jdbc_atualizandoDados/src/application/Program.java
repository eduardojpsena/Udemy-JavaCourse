package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		 try {
			
			connection = DB.getConnection();
					
			preparedStatement = connection.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary+? "
					+ "WHERE "
					+ "(DepartmentId = ?)");
			preparedStatement.setDouble(1, 200.00);
			preparedStatement.setInt(2, 1);
						
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Rows affected: " + rowsAffected);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
		
	}

}
