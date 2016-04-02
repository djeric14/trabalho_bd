package br.fa7.connection;

import java.sql.Connection;
import java.sql.SQLException;

import com.mongodb.client.MongoDatabase;

public class ConnectionBDInMemoryFactory extends ConnectionFactory{

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return ConnectionBDInMemory.getConnection();
	}

	@Override
	public MongoDatabase getConnectionMongoDB() {
		// TODO Auto-generated method stub
		return null;
	}

}
