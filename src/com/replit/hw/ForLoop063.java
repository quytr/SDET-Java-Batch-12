package com.replit.hw;

import java.util.Scanner;

public class ForLoop063 {

	public static void main(String[] args) {
		/*
		 * Given the following inputs:
		 * 
		 * int x; int x; Write a for loop that will print out a series of numbers
		 * starting at 0 and ending at the x(value must be taken from a user),
		 * exclusive.
		 */

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.print(i + " ");
		}

	}

}
