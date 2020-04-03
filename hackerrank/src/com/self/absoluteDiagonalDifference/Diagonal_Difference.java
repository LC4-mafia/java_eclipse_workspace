package com.self.absoluteDiagonalDifference;


import java.util.Scanner;

public class Diagonal_Difference {

	public Diagonal_Difference() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size=0;
		
		System.out.println("Enter the size of the diagonal Matrix: ");
		size = input.nextInt();
		int [][] array = new int[size][size];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10);
			}
		}
		
		//display the array
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		//difference
		int sumRight = 0;
		int sumLeft = 0;
		int help = array[sumRight].length -1;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i==j) {
				sumRight += array[i][j];
				sumLeft += array[i][help];
				}
			}
			--help;
		}
		
		System.out.println("The sum of the right: " + sumRight);
		System.out.println("The sum of the left: " + sumLeft);
		System.out.println("The absolute difference is: " + Math.abs(sumLeft-sumRight));
		
	}

}
