package test;
import java.sql.*;

public class Test_Database {

	public Test_Database() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");  			// this loads the driver for the program 
			System.out.println("Driver loaded successfully!");
			
			
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javaTest", "user", "user");
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaTest","user","user");
			System.out.println("successfully connnected!");
			
			//System.out.println("Connection: " + connection.toString());
//			//Statement stmt=con.createStatement();
//			Statement stmt = connection.createStatement();
//			//ResultSet rs =stmt.executeQuery("select * from student");
//			System.out.println("Successfully performed shit");
//			
//			
//			
//			
//			
//			while(rs.next()) { 
//				System.out.println(rs.getString(4)+"  "+rs.getString(2)+"  "+rs.getString(3) + " " +rs.getString(13));  
//					
//			}
//			//con.close();  
			
			Statement stmt = connection.createStatement();
			//stmt.executeUpdate("INSERT INTO `student`(`studentID`, `fname`, `minit`, `lname`) VALUES('5', 'Jesse','A','Pratt')");
			//stmt.executeUpdate("INSERT INTO `student` VALUES('6','Peter', '', 'Benoit')");
			//stmt.executeUpdate("UPDATE `student` SET `studentID` = '1' WHERE `studentID` = '1234'");
			//System.out.println("Updated Successfully!");
			ResultSet rs = stmt.executeQuery("SELECT * from `student`");
			System.out.println("successfully executed");
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			
			
			
			
			
			
			connection.close();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			//System.out.println("Error" + e.toString());;  
	} 
		
		
	}

}
