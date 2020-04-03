package test;
import java.sql.*;

public class SomeJDBC {

	public SomeJDBC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");					//loads the driver class in the project explorer
			System.out.println("Driver Loaded Successfully");
			
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javaTest", "user", "user"); //connects db
			System.out.println("Database Connected Successfully");
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
