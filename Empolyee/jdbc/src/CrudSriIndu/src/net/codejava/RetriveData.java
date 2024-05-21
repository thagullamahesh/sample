package CrudSriIndu.src.net.codejava;

import java.sql.*;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "tMYADAV@2002";
		 
		try {
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		
			String sql = "SELECT * FROM rajudb";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString(2);
			    String pass = result.getString(3);
			    String fullname = result.getString("fullname");
			    String email = result.getString("email");
			 
			    String output = "Use"
			    		+ "r #%d: %s - %s - %s - %s";
			    System.out.println(String.format(output,  name, pass, fullname, email));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
