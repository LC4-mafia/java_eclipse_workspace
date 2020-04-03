package com.personal.ArrayLists;

import java.util.ArrayList;

public class firstTrial_ArrayList {

	public firstTrial_ArrayList() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(5);
		Sample<String> secrets = new Sample<String>();
		Sample<String> secretss = new Sample<String>();
		Sample<Integer> secr = new Sample<Integer>();
		secrets.setSecret("Money");
		secretss.setSecret("money");
		if(secretss.equals(secr)) {
			System.out.println("They are equal!");
		}else {
			System.out.println("Two different shit all together! you know");
		}
		String [] arr = new String[5];
		list.add("My");
		list.add("name");
		list.add("is");
		list.add("Godfred");
		list.add("Asuman");
		list.add(0, "Ok,");
		
		for(int i = 0; i <=5; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\nThe size of my array list is now: " + list.size());
		
		if(list.contains("Godfred")) {
			System.out.println("the index of godfred is at: " + list.indexOf("Godfred"));
		}else {
			System.out.println("we couldnt find what you are looking for! \nCome back next time!");
		}
		
		//arr = (String[]) list.toArray();
		//System.out.println(arr[4]);		
	}

}
