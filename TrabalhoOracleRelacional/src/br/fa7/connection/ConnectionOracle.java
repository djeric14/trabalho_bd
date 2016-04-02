package br.fa7.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionOracle {

	public static Connection getConnection() throws ClassNotFoundException, SQLException{

		try{
			Connection conn;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRABALHO_BD", "1234");
			return conn;
		}
		catch (ClassNotFoundException ex){
			ex.printStackTrace();
		}

		return null;
	}
}
