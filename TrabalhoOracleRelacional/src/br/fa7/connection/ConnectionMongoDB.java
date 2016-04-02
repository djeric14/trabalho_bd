package br.fa7.connection;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConnectionMongoDB {
	
	private static MongoClient mongoClient;

	public static MongoDatabase getConnection() {
		mongoClient = new MongoClient("localhost", 27017);
        return mongoClient.getDatabase("consulta_medica");
	}
}
