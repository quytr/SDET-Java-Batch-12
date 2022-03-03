package com.replit.hw;

import java.util.Scanner;

public class ForLoop064 {

	public static void main(String[] args) {
		/*
		 * You should input:
		 * 
		 * int end; int end; Write a for loop that will print out a series of numbers
		 * starting at 0 and ending at the doubled value of end(value must be taken from
		 * a user), exclusive.
		 * 
		 * Each number should be on the same line, separated by a space.
		 */

		Scanner sc = new Scanner(System.in);

		int end = sc.nextInt();

		int finalEnd = end * 2;

		for (int i = 0; i < finalEnd; i++) {
			System.out.print(i + " ");
		}
	}

}
