package src;

import java.sql.*;

public class Usuario {
	private static final String CREATE_TABLE_SQL="CREATE TABLE USUARIO ("
            + "UID INT NOT NULL,"
            + "NAME VARCHAR(45) NOT NULL,"
            + "DOB DATE NOT NULL,"
            + "EMAIL VARCHAR(45) NOT NULL,"
            + "PRIMARY KEY (UID))";

public static void main(String[] args) {
	String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
			"databaseName = LUCAS;";
	String username = "sa";
	String password = "2547llll";
	
	Connection conn = null;
	Statement stmt = null;
	
	try {
	
	conn = DriverManager.getConnection(connectionUrl, username, password);
		
	stmt = conn.createStatement();
	
	stmt.executeUpdate(CREATE_TABLE_SQL);
	
	
	
	System.out.println("Table created");
	
	} catch (SQLException e) {
	e.printStackTrace();
	} finally {
	try {
	// Close connection
	if (stmt != null) {
	  stmt.close();
	}
	if (conn != null) {
	  conn.close();
	}
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	}
	}
