package com.tables.my_java_school;

public class Employee {

	private String eid_str;				//employee id
	private String ename_str;			//employee name
	private int e_key_i;				//employee key: determine what role an employee plays in the organisation
	private String dnumber_emp_str;		//employee department number
	
	public String getEid_str() {
		return eid_str;
	}

	public void setEid_str(String eid_str) {
		this.eid_str = eid_str;
	}

	public String getEname_str() {
		return ename_str;
	}

	public void setEname_str(String ename_str) {
		this.ename_str = ename_str;
	}

	public int getE_key_i() {
		return e_key_i;
	}

	public void setE_key_i(int e_key_i) {
		this.e_key_i = e_key_i;
	}

	public String getDnumber_emp_str() {
		return dnumber_emp_str;
	}

	public void setDnumber_emp_str(String dnumber_emp_str) {
		this.dnumber_emp_str = dnumber_emp_str;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
