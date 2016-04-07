package br.fa7.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBDInMemory {
	
	public static Connection getConnection() throws  SQLException{

		Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite::memory";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            return conn;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());   
        }    
		return null;
     }	
}
