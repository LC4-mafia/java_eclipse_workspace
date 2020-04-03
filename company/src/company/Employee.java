package company;
import java.util.InputMismatchException;
import java.util.Scanner;




public class Employee {

	/// the data for the program
	private int dependents;
	private double hours;
	private String name;
	private int age;
	private double salary;
	private String sex;
	private String ssn;
	
	//tools
	//static Scanner ip;
	
	
	public Employee() {
		this.dependents = 0;
		this.hours = 0.0;
		this.name = "John";
		this.age = 18;
		this.salary = 100.0;
		this.sex = "M";
		this.ssn = "E1234";
	}
	
	public Employee(String ssn, String name, int age, String sex, double salary) {
		
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary	= salary;
	}

	public void display() {
		
		System.out.println("\t\t=== \tWELCOME TO THE PORTAL\t===");
		System.out.println("\t\tA.\tUpdate An Employee");
		System.out.println("\t\tB.\tAdd An Employee");
		System.out.println("\t\tE. \tEnter -1 To End The Program");
	}
	
	public void update() {
		String empName = null;
		String empSsn = null;

		
		Scanner ip = new Scanner(System.in);
		System.out.println("=======================================================================");
		System.out.println("ENTER EMPLOYEE NAME ");
		empName = ip.nextLine();
		
		/*
		 * is name already captured? 
		 * yes, update
		 * no, add them!
		 */
		if(this.getName() == null) {
			System.out.println("NO SUCH EMPLOYEE FOUND IN THE DATABSE, WANT TO ADD? Y or N");
			char choice = ip.next().charAt(0);
			if(choice == 'Y' || choice == 'y') {
				this.add();
			}
		}
		
		if(this.getName() == empName) {
			
			System.out.println("====================================================================");
			System.out.println("EMPLOYEE FOUND SUCCESSFULLY!");
			System.out.println("ENTER EMPLOYEE SSN TO UPDATE DETAILS");
			String ssn = ip.nextLine();
			if(ssn == this.getSsn()) {
				
				System.out.println("========================================");
				System.out.println("A.	UPDATE NAME");
				System.out.println("B.	UPDATE AGE");
				System.out.println("C.  UPDATE SEX");
				System.out.println("D.  UPDATE SALARY");
				System.out.println("");
			}
		}
		System.out.println("=======================================================================");

	}
	
	public void add() {
		String empName = null;
		String empSsn = null;
		int empAge = 0;
		String empSex =  null;
		int empDependants = 0;
		double empSalary = 0;
		double empHours = 0.0;
		
		try {
			Scanner ip = new Scanner(System.in);
			System.out.print("Name: ");
			empName = ip.nextLine();
			
			System.out.print("\nSSN: ");
			empSsn = ip.nextLine();
			
			System.out.print("\nAge: ");
			empAge = ip.nextInt();
			
			System.out.print("\nSex: ");
			empSex = ip.nextLine();
			
			System.out.print("\nDependants: ");
			empDependants = ip.nextInt();
			
			System.out.print("\nSalary: ");
			empSalary = ip.nextDouble();
			
			System.out.print("\nHours Worked: ");
			empHours = ip.nextDouble();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Check Your Inputs!");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some error occurred!");
		}
		
		this.setAge(empAge);
		this.setDependents(empDependants);
		this.setHours(empHours);
		this.setName(empName);
		this.setSalary(empSalary);
		this.setSex(empSex);
		this.setSsn(empSsn);
		
	}
	
	public int getDependents() {
		return dependents;
	}

	public void setDependents(int dependents) {
		this.dependents = dependents;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String empSex) {
		this.sex = empSex;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	

	

	public static void main(String[] args) {
		
		
		/*
		 * Database is connected.
		 * 
		 */
		try {
			Class.forName("com.mysql.jdbc.Driver"); //loads the jdbc driver
			System.out.println("db Driver Loaded Successfully!");
			
			Scanner ip = new Scanner(System.in);
			
			Employee emp = new Employee();
			
			emp.display();
			
			
			char choice = '\0';
			do{
				
				System.out.println("======================================================================");
				System.out.println("ENTER OPTION: ");
				choice = ip.next().charAt(0);
				System.out.println("======================================================================");

				
				switch(choice) {
				
					case 'A':
						emp.update();
						break;
					
					case 'B':
						emp.add();
						break;
						
					default:
						System.out.println("Invalid option, Enter correct option");
						break;
						
				}
			}while(choice != 'E' || choice != 'e');
		} catch (Exception e) {
			
			System.out.println(e.getMessage());;
		}

	}

	

}
