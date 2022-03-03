package com.replit.hw;

import java.util.Scanner;

public class ForLoop065 {

	public static void main(String[] args) {
		/*
		 * Given the following inputs:
		 * 
		 * int x; int x; Write a for loop that will print out a series of numbers
		 * starting at one less than x and ending at 0.
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

//		int startX = x - 1;

		for (int i = x - 1; i >= 0; i--) {
			System.out.print(i + " ");
		}

	}

}
