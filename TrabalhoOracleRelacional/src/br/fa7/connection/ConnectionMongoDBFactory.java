package br.fa7.connection;

import java.sql.Connection;
import java.sql.SQLException;

import com.mongodb.MongoClient;

public class ConnectionMongoDBFactory extends ConnectionFactory {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MongoClient getConnectionMongoDB() {
		// TODO Auto-generated method stub
		return ConnectionMongoDB.getConnection();
	}
	
}
