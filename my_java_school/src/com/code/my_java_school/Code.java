package com.code.my_java_school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import com.tables.my_java_school.*;

public class Code {
	
	public Code() {
		// TODO Auto-generated constructor stub
	}

	public void display() {
		
		System.out.println("\t\t=====\t\tWELCOME TO MY JAVA SCHOOL\t\t=====");
		System.out.println("\t\t1.  STUDENT");
		System.out.println("\t\t2.	EMPLOYEE");
		System.out.println("\t\t2.	DEPARTMENT");
		
		System.out.println("ENTER CHOICE HERE OR -1 TO QUIT:");
		
	}
	
	/*
	 * private int addDepartment() { boolean isSuccessful = false; String dnum,
	 * dname, mgr; ip = new Scanner(System.in);
	 * 
	 * System.out.println("ENTER DEPARTMENT NUMBER: "); dnum = ip.nextLine();
	 * 
	 * System.out.println("ENTER DEPARTMENT NAME: "); dname = ip.nextLine();
	 * 
	 * System.out.println("ENTER MANAGER ID: "); mgr = ip.nextLine();
	 * 
	 * 
	 * 
	 * if(isSuccessful) { return 0; }else { return 1; } }
	 */
	
	public void display(int choice) {
		
		if(choice == 1) {
			this.studentDisplay();
		}else if(choice == 2) {
			this.employeeDisplay();
		}else if(choice == 3) {
			this.departmentDisplay();
		}else if(choice == -1) {
			System.out.println("EXITING");
		}
		
	}
	

	
	private void departmentDisplay() {
		
		System.out.println("\t\t1.  EDIT A DEPARTMENT");
		System.out.println("\t\t2.  ADD A DEPARTMENT");
		System.out.println("\t\t3.  DELETE A DEPARTMENT");
	}
	
	private void employeeDisplay() {
		
		System.out.println("\t\t1.  ADD AN EMPLOYEE");
		System.out.println("\t\t2.  EDIT AN EMPLOYEE");
		System.out.println("\t\t3.  DELETE AN EMPLOYEE");
	}
	
	
	
	public static void main(String[] args) {
		
		Code me = new Code();
		Department department = new Department();
		Student student = new Student();
		Employee employee = new Employee();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRIVER LOADED SUCCESSFULLY!");
			
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/myschool", "user", "user");
			System.out.println("CONNECTED SUCCESSFULLY\n\n"); 
			
			Statement mysql = connection.createStatement();
			
			//mysql.executeUpdate("");
			
			Scanner ip = new Scanner(System.in);
			int choice = 0;
			
			
			
			me.display(); //ends with an stdin statement for the user choice
			choice = ip.nextInt();
			
			//enter -1 to end the whole program
			while (choice != -1) {
				
				switch(choice) {
				
				case 1:
					me.studentDisplay();
					System.out.println("ENTER CHOICE or -1 TO QUIT");
					choice = ip.nextInt();
					
					switch(choice) {
					case 1:
						System.out.print("ENTER FIRST NAME: ");
						String fname = ip.next();
						student.setFname_str(fname);
						
						System.out.print("\nENTER LAST NAME: ");
						String lname = ip.next();
						student.setLname_str(lname);
						
						System.out.print("\nENTER AGE: ");
						int age = ip.nextInt();
						student.setAge_i(age);
						
						System.out.print("\nENTER DEPARTMENT NUMBER: ");
						String dnumber = ip.next();
						student.setDnumber_stu_str(dnumber);
						
						System.out.print("\nENTER COACH ID: ");
						String coach = ip.next();
						student.setCoach_str(coach);
						
						System.out.println("Successfully added, ENTER -1 TO QUIT ");
						break;
					}
					break;
					
				default:
					me.display();
					System.out.println("ENTER CHOICE AGAIN: ");
					choice = ip.nextInt();
				}
				
				System.out.println("\n\nstudent name: " + student.getFname_str() + " " + student.getLname_str());
				System.out.println("Age: " + student.getAge_i());
				
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
	
	}

}
