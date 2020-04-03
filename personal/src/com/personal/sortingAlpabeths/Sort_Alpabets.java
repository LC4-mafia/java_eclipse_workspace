package com.personal.sortingAlpabeths;

import java.util.Scanner;

public class Sort_Alpabets {

	public Sort_Alpabets() {
		// TODO Auto-generated constructor stub
	}
	
	public static  String[] ascendingSort(String[] arr) {
		 
 		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				
				if(arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] word = new String[3];
		
		for(int i=0; i<3; i++) {
			word[i] = input.nextLine();
		}
		word = ascendingSort(word);
		
		System.out.println(word[1]);
		
	}

}
