package empolyeedata;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class Deletedatabase {	
		public static void main(String[] args) {
			String dbURL = "jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password = "tMYADAV@2002";
			 
			try {
			 
			    Connection conn = DriverManager.getConnection(dbURL, username, password);
			    String sql = "DELETE FROM empolyee WHERE empolyee_name=?";
			    
			    PreparedStatement statement = conn.prepareStatement(sql);
			    statement.setString(1, "prakash");
			    statement.setString(1, "mahesh");
			    int rowsDeleted = statement.executeUpdate();
			    if (rowsDeleted > 0) {
			        System.out.println("A user was deleted successfully!");
			    }
			} catch (SQLException ex) {
			    ex.printStackTrace();
			}
		}

		
	}
