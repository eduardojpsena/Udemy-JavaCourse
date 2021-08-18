package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			
			connection = DB.getConnection();
			
			/*
			preparedStatement = connection.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, "Ed Yellow");
			preparedStatement.setString(2, "ed@gmail.com");
			preparedStatement.setDate(3, new java.sql.Date(simpleDateFormat.parse("15/07/2000").getTime()));
			preparedStatement.setDouble(4, 3000.00);
			preparedStatement.setInt(5, 4);
			*/
			
			preparedStatement = connection.prepareStatement(
					"insert into department (Name) values ('Foods'), ('Tools')",
					Statement.RETURN_GENERATED_KEYS);
			
			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				ResultSet resultSet = preparedStatement.getGeneratedKeys();
				while (resultSet.next()) {
					int id = resultSet.getInt(1);
					System.out.println("Done! ID insert = " + id);
				}
			} else {
				System.out.println("No rows affected!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
		
	}

}
