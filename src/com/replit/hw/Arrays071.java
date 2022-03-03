package com.replit.hw;

public class Arrays071 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers that stores the following
		 * values: 45,78, 12, 67, 55, 89, 23, 77, 88
		 * 
		 * Print only values that stored with even index including 0.
		 */

//		int[] numb = new int[9];
//		numb[0] = 45;
//		numb[1] = 78;
//		numb[2] = 12;
//		numb[3] = 67;
//		numb[4] = 55;
//		numb[5] = 89;
//		numb[6] = 23;
//		numb[7] = 77;
//		numb[8] = 88;


		int[] numbs = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };

		int size = numbs.length;

		for (int i = 0; i < size; i += 2) {

			System.out.print(numbs[i] + " ");

		}

		System.out.println("");

		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				System.out.print(numbs[i] + " ");
			}
		}

	}

}
