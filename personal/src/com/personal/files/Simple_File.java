package com.personal.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Simple_File {

	public Simple_File() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		PrintWriter output = null;
		try {
			output = new PrintWriter(new FileOutputStream("Stuff.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("File Already Exist");
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		for(int i =0; i < 10; i++)
			output.println(i+1);
		
		output.close();
		
		System.out.println("Starting my scanner to get my input from the file");
		Scanner inputStream = null;
				
		try {
			inputStream = new Scanner (new FileInputStream("Stuff.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("File not found\nProgram aborting. . . ");
		}catch(Exception e) {
			System.out.println("Some exception occured!");
		}
		
		int [] inputArray = new int[25];
		int i=0;
	
		try {
			while(inputStream.hasNext()) {
				inputArray[i] = inputStream.nextInt();
				i++; 
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bounds");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("twentieth digit: " + inputArray[26]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Is out of bounds, cant you see? ");
		}
			System.out.println("twentieth digit: " + inputArray[26]);
		
	}

}
