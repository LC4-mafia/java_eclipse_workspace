package com.personal.ArrayLists;

public class Sample<T> {
	
	private T secretword; // = (T) "money";
	
	public Sample() {
		this.secretword = (T) "money";
	}
	
	public Sample(T secret) {
		this.secretword =  secret;
	}
	
	public void setSecret(T secret) {
		this.secretword =  secret;
	}

	public T getSecret() {
		
		return this.secretword;
	}

	public boolean equals(Object otherObject) {
		
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else {
			Sample<T> otherSample = (Sample<T>) otherObject;
			return this.secretword.equals(otherSample.secretword);
		}
	}
	
}
