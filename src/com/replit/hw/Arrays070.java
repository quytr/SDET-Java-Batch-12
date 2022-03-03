package com.replit.hw;

public class Arrays070 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers and stores the following
		 * values: 45, 78, 12, 67, 55 and then prints all array values.
		 */

		int[] numbers = new int[5];
		numbers[0] = 45;
		numbers[1] = 78;
		numbers[2] = 12;
		numbers[3] = 67;
		numbers[4] = 55;

		for (int number : numbers) {

			System.out.print(number + " ");

		}

		int[] numbs = { 45, 78, 12, 67, 55 };
		
		for(int i = 0; i < numbs.length; i++) {
			System.out.print(numbs[i] + " ");
		}

	}

}
