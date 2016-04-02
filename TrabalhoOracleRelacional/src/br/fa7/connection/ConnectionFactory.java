package br.fa7.connection;

import java.sql.Connection;
import java.sql.SQLException;

import com.mongodb.client.MongoDatabase;

public abstract class ConnectionFactory {
	public static final int ORACLE = 1;
	public static final int MONGOBD = 2;
	public static final int BD_IN_MEMORY = 3;

	public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
	public abstract MongoDatabase getConnectionMongoDB();
	
	public static ConnectionFactory getConnectionFactory(int db) {
		switch (db) {
		case ORACLE:
			return new ConnectionOracleFactory();
		case MONGOBD:
			return new ConnectionMongoDBFactory();
		case BD_IN_MEMORY:
			return null;
		default:
			return null;
		}
	}

}
