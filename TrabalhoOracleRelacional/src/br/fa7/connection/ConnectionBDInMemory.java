package br.fa7.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBDInMemory {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{

		try{
			//precisamos definir o banco
			Connection conn;
			Class.forName("");
			conn = DriverManager.getConnection("", "", "");
			return conn;
		}
		catch (ClassNotFoundException ex){
			ex.printStackTrace();
		}

		return null;
	}
}
