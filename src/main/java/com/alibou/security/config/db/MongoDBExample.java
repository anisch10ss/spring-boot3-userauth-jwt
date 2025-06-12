package com.alibou.security.config.db;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBExample {
    public static void main(String[] args) {
        // Connect to the MongoDB instance running on localhost
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            // Get access to the database
            MongoDatabase database = mongoClient.getDatabase("wisevision");

            // Now you can work with your database
            System.out.println("Connected to database: " + database.getName());
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }
}