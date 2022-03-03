package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// how many elements inside array?
		
		char [] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		int size = grade.length;  // number of element that inside array
		
		System.out.println("Numbers of elements is " + size);
		
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		
		System.out.println("----------------");
		
		for(int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + " ");
		}
		
		System.out.println("");
		System.out.println("-----------------");
		
		String[] cities = {"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
		// if value is Miami --> I want to leave in Miami
		
		for(int a = 0; a < cities.length; a++) {
			System.out.println(cities[a] + " ");
			
			if("Miami".equals(cities[a])) {
				System.out.println("I want to leave in Miami");
			}
		}
		
		
		

	}

}
