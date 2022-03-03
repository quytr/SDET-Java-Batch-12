package com.replit.hw;

import java.util.Scanner;

public class Arrays077 {

	public static void main(String[] args) {
		/*
		 * Create an array of integers that will store 5 elements taken from a user
		 * 
		 * Don't print any prompt message for the user
		 * 
		 * Then print out all the elements you have created in the first loop in reverse
		 * order.
		 */

		Scanner sc = new Scanner(System.in);

		int[] numbs = new int[5];

		int size = numbs.length;

		// Option 1:
		for (int i = (size - 1); i >= 0; i--) {

			numbs[i] = sc.nextInt();
			

		}

		for (int numb : numbs) {

			System.out.println(numb);
		}

		System.out.println("------------------");

		// Option 2:
		for (int j = 0; j < size; j++) {

			numbs[j] = sc.nextInt();

		}

		for (int x = size - 1; x >= 0; x--) {
			System.out.println(numbs[x]);
		}

	}

}
