package com.simple_CRUD.info;

import com.simple_CRUD.date.Date;

class Student_Info{
	
	private int studentID;
	private String fName;
	private String sName;
	private Date dob;
	
	public static void main(String [] args) {
		System.out.println("YAY");
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}