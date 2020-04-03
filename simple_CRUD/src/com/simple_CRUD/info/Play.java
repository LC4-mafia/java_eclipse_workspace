package com.simple_CRUD.info;

public class Play {

	public Play() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_Info a;
		Object[] me = new Object[5];
		for(int i=0; i<5;i++) {
			me[i] = new Student_Info();
		}
		((Student_Info) me[2]).setsName("Asuman");
		System.out.println(((Student_Info) me[2]).getsName());
	}

}
