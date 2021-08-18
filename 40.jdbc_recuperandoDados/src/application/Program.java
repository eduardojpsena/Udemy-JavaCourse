package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = DB.getConnection();  //estabelecendo conexão
			statement = connection.createStatement();  //monta a estrutura para receber o comando sql para recuperar os dados do banco de dados
			resultSet = statement.executeQuery("select * from department");  //objetio que contem o resultado da consulta a partir do comando sql
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(resultSet);
			DB.closeStatement(statement);
			DB.closeConnection();
		}
		
		
	}

}
