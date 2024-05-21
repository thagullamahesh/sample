package CrudSriIndu.src.net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsersManager {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "tMYADAV@2002";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected to the database");
		        conn.close();
		    }
		} catch (SQLException ex) {
			ex.printStackTrace();
		    		

		}
	} 

	
}
