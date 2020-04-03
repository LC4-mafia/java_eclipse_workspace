package com.simple_CRUD.date;

public class Date{

	private int day;
	private int month;
	private int year;
	
	public Date() {
		this.setDay(1);
		this.setMonth(1);
		this.setYear(1990);
	}

	
	public String toString() {
		return (this.getDay()+" / "+this.getMonth()+" / "+this.getYear());
		
	}
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
