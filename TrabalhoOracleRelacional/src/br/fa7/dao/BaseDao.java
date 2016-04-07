package br.fa7.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.fa7.connection.ConnectionFactory;

public class BaseDao {
	
	private static Connection connection;
	
	public static Connection getConnection(){
		try {
			if(connection == null){
				connection = ConnectionFactory.getConnectionFactory(ConnectionFactory.ORACLE).getConnection();
			}
			return connection;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}
