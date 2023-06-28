package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private String dbName;
	private String userName;
	private String password;
	
	public DatabaseConnection(String dbName, String userName, String password) {
		super();
		this.dbName = dbName;
		this.userName = userName;
		this.password = password;
	}
	
	public Connection getConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost/"+ this.dbName, this.userName, this.password);
			System.out.println("Database Connected");

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
