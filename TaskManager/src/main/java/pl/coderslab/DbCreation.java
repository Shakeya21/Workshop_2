package pl.coderslab;

public class DbCreation {
    private static final String DBCREATE = "CREATE DATABASE workshop2  CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;";
    private static final String TABLECREATE="CREATE TABLE users (\n" +
            "  id INT(11) NOT NULL AUTO_INCREMENT,\n" +
            "  email VARCHAR(255) NOT NULL UNIQUE,\n" +
            "  username VARCHAR(255) NOT NULL,\n" +
            "  password VARCHAR(60) NOT NULL,\n" +
            "  PRIMARY KEY (id));";
}
