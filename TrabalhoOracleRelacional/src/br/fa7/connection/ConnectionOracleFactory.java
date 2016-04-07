package br.fa7.connection;

import java.sql.Connection;
import java.sql.SQLException;

import com.mongodb.MongoClient;

public class ConnectionOracleFactory extends ConnectionFactory {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return ConnectionOracle.getConnection();
	}

	@Override
	public MongoClient getConnectionMongoDB() {
		// TODO Auto-generated method stub
		return null;
	}

}
