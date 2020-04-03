package com.privacyLeaks;

public class AccessorCompromise_PrivateVariables {

	public AccessorCompromise_PrivateVariables() {
		// TODO Auto-generated constructor stub
	}

	private static int secretNumber;
	private int mine;
	private int [] us = {1,2,3,4,5};

	public int[] getUs() {
		return us;
	}

	public void setUs(int[] us) {
		this.us = us;
	}

	public int getMine() {
		return mine;
	}

	
	public void setMine(int mine) {
		this.mine = mine;
	}

	public static int getSecretNumber() {
		return secretNumber;
	}

	public void display(int [] array) {
		for(int each: array) {
			System.out.print(each+ " ");
		}
		System.out.println();
	}
	public static void setSecretNumber(int secretNumber) {
		AccessorCompromise_PrivateVariables.secretNumber = secretNumber;
	}
	
	public static void main(String [] args) {
		
		AccessorCompromise_PrivateVariables them = new AccessorCompromise_PrivateVariables();
		int [] newUs = new int[5];
		newUs = them.getUs();
		int [] counterUs = new int[5];
		
		
		//displaying original
		System.out.println("displaying the original array");
		them.display(them.getUs());
		
		//display the object array;
		System.out.println("displaying new array");
		for(int each: newUs) {
			System.out.print(each + " ");
		}
		System.out.println();
		
		//making a change to the new array and check if the change will carry through to the original array
		newUs[3] = 9;
		//displaying original
				System.out.println("displaying the original array again");
				them.display(them.getUs());
		
		AccessorCompromise_PrivateVariables me = new AccessorCompromise_PrivateVariables();
		me.setMine(7);
		
		setSecretNumber(5);
		
		int a;
		a = getSecretNumber();
		
		int b; 
		
		b = me.getMine();
		
		//printing static shit
		System.out.println("new: "+ a + " original: " + getSecretNumber());
		a+=3;
		System.out.println("new: "+ a + " original: " + getSecretNumber());
		
		// printing object shits
		System.out.println("x : " + b + " y : " +  me.getMine());
		b = b + 7;
		System.out.println("x : " + b + " y : " + me.getMine());
		
	}
}
