package com.tables.my_java_school;

public class Student {

	private String fname_str;
	private String lname_str;
	private int age_i;
	private String dnumber_stu_str;
	private String coach_str;
	
	public String getFname_str() {
		return fname_str;
	}

	public void setFname_str(String fname_str) {
		this.fname_str = fname_str;
	}

	public String getLname_str() {
		return lname_str;
	}

	public void setLname_str(String lname_str) {
		this.lname_str = lname_str;
	}

	public int getAge_i() {
		return age_i;
	}

	public void setAge_i(int age_i) {
		this.age_i = age_i;
	}

	public String getDnumber_stu_str() {
		return dnumber_stu_str;
	}

	public void setDnumber_stu_str(String dnumber_stu_str) {
		this.dnumber_stu_str = dnumber_stu_str;
	}

	public String getCoach_str() {
		return coach_str;
	}

	public void setCoach_str(String coach_str) {
		this.coach_str = coach_str;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	protected void studentDisplay() {
		
		System.out.println("\t\t1.  ADD A STUDENT");
		System.out.println("\t\t2.  UPDATE A STUDENT");
		System.out.println("\t\t3.  DELETE A STUDENT");
	}
}
