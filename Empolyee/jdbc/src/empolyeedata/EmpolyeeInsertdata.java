package empolyeedata;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

	public class EmpolyeeInsertdata {
		public static void main(String[] args) {
			String dbURL = "jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password = "tMYADAV@2002";
			 
			try {
			 
			    Connection conn = DriverManager.getConnection(dbURL, username, password);
			    String sql = "INSERT INTO empolyee (empolyee_id, empolyee_name, empolyee_email, empolyee_pass) VALUES ( ?, ?, ?, ?)";
			    
			    PreparedStatement statement1 = conn.prepareStatement(sql);
			    statement1.setString(1, "199");
			    statement1.setString(2, "prakash");
			    statement1.setString(3,"prakashlla@gmail.com" );
			    statement1.setString(4, "prakash12234");
			    
			    PreparedStatement statement2 = conn.prepareStatement(sql);
			    statement2.setString(1, "111");
			    statement2.setString(2, "mahesh");
			    statement2.setString(3,"mahesh@gmail.cm" );
			    statement2.setString(4, "mahesh1122");
			    
			    PreparedStatement statement3 = conn.prepareStatement(sql);
			    statement3.setString(1, "11");
			    statement3.setString(2, "ravi");
			    statement3.setString(3,"ravi@gmail.com" );
			    statement3.setString(4, "ravi2244");
			    
			  PreparedStatement statement4 = conn.prepareStatement(sql);
			    statement4.setString(1, "1");
			    statement4.setString(2, "raju");
			    statement4.setString(3,"rajuyadav@gmail.com" );
			    statement4.setString(4, "raju9642");
			    
			    //int rowsInserted = statement1.executeUpdate();
			    //int rowsInserted = statement2.executeUpdate();
			    //int rowsInserted = statement3.executeUpdate();
			    int rowsInserted = statement4.executeUpdate();
			    if (rowsInserted > 0) {
			        System.out.println("A new user was inserted successfully!");
			    }
			} catch (SQLException ex) {
			    ex.printStackTrace();
			}
		}}
		
