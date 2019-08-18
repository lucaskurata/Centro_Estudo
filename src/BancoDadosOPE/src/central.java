package src;

import java.sql.*;
import java.sql.Statement;

public class central {

	private static final String CREATE_TABLE_SQL="CREATE TABLE cadastro ("
            + "NOME VARCHAR(30) NOT NULL,"
            + "IDADE TIYINT NOT NULL,"
            + "CPF INT NOT NULL,"
            + "EMAIL VARCHAR(45) NOT NULL,"
            + "PRIMARY KEY (NOME))";
	
	public static void main(String[] args){
		Statement stmt = null;
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
				"databaseName = LUCAS;";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			String username = "sa";
			String password = "2547llll";
			
			Connection conn = DriverManager.getConnection(connectionUrl, username, password);
			
			System.out.println("Conexão bem sucedida!");
			
		}catch(SQLException e){
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		}catch(Exception ex) {
			System.out.println("Não foi possível conectar-se ao banco " + ex);
		}
		
		
	}
}
