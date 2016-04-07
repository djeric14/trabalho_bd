package br.fa7.connection;

import com.mongodb.MongoClient;

public class ConnectionMongoDB {

	public static MongoClient getConnection() {
		return new MongoClient("localhost", 27017);
	}
}
