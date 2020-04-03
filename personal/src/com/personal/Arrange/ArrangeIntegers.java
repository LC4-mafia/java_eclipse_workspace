package com.personal.Arrange;

import java.util.Scanner;

public class ArrangeIntegers {

	//stupid constructor!
	public ArrangeIntegers() {
		// TODO Auto-generated constructor stub
	}
	
	//the container
	private int[] elements;
	
	//setting the elements
	public void setElements() {
		
		Scanner input = new Scanner(System.in);
		int size = 0;
		
		System.out.print("Enter how many elements: ");
		size  = input.nextInt();
			System.out.println();
		
		this.elements = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.print("Enter elememt " + i + ": ");
			this.elements[i] = input.nextInt();
				System.out.println();
		}
	}
	//display the elements currently in the array
	public void displayElements() {
		
		for(int members: elements)
			System.out.print(members + " ");
		
		System.out.println("\n");
	}
	
	public void eachToWhatPower(int power) {
		System.out.println("Each to the power of "+ power);
		
		for(int i =0; i< this.elements.length; i++) {
			System.out.print(Math.pow(this.elements[i], power) + " ");
		}
		System.out.println();
	}
	public void squareEachElement() {
		System.out.println("Squaring each digit!");
		
		for(int i =0; i< this.elements.length; i++) {
			System.out.print(Math.pow(this.elements[i], 2) + " ");
		}
		System.out.println();
	}
	public void arrangeElementsInAscending() {
		
		System.out.println("Arranging in Ascending!");
		
		for(int i=0; i<this.elements.length;i++) {
			for(int j=i+1; j<this.elements.length;j++) {
				
				if(this.elements[i] > this.elements[j]) {
					int temp = this.elements[j];
					this.elements[j] = this.elements[i];
					this.elements[i] = temp;
				}
			}
		}
	}
	
	public void arrangeElementsInDescending() {
		
		System.out.println("Arranging in Descending!");
		
		for(int i=0; i<this.elements.length;i++) {
			for(int j=i+1; j<this.elements.length;j++) {
				
				if(this.elements[i] < this.elements[j]) {
					int temp = this.elements[j];
					this.elements[j] = this.elements[i];
					this.elements[i] = temp;
				}
			}
		}
	}
	
	
	public static void main(String [] args) {
		
		ArrangeIntegers me = new ArrangeIntegers();
		me.setElements();
		me.displayElements();
		me.arrangeElementsInAscending();
		me.displayElements();
		me.arrangeElementsInDescending();
		me.displayElements();
		me.squareEachElement();
		//me.displayElements();
		me.eachToWhatPower(3);
		//me.displayElements();
	}
	
	
}
