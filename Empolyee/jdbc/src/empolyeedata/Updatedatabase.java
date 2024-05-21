package empolyeedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updatedatabase {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "tMYADAV@2002";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE empolyee SET empolyee_name=?, empolyee_pass=?, empolyee_email=? WHERE empolyee_id=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "bill");
		    statement.setString(2, "William Henry Bill Gates");
		    statement.setString(3, "bill.gates@microsoft.com");
		    statement.setInt(4, 11);
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
