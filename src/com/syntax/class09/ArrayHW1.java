package com.syntax.class09;

public class ArrayHW1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 * 
		 */

		String[] cars = { "Toyota", "Honda", "BMW", "Audi", "Jeep", "GMC" };
		
		// for each loop:
		for (String car : cars) {
			System.out.print(car + " ");
		}
		
		System.out.println("");
		
		// for loop:
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}

	}

}
