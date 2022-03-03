package com.replit.hw;

public class NestedForLoops069 {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern:
		 * 
		 * Expected output:
		 * 
		 * 1 2 3 4 5 6 7 1 2 3 4 5 6 1 2 3 4 5 1 2 3 4 1 2 3 1 2 1 1 2 1 2 3 1 2 3 4 1 2
		 * 3 4 5 1 2 3 4 5 6 1 2 3 4 5 6 7
		 */
		
		// First try:

		for (int i = 1; i <= 13; i++) {

			for (int j = 1; j <= 7; j++) {
				if ((i == 2 || i == 12) && j == 7) {
					System.out.print(" ");
				} else if ((i == 3 || i == 11) && (j == 6 || j == 7)) {
					System.out.print(" ");
				} else if ((i == 4 || i == 10) && (j == 5 || j == 6 || j == 7)) {
					System.out.print(" ");
				} else if ((i == 5 || i == 9) && (j == 4 || j == 5 || j == 6 || j == 7)) {
					System.out.print(" ");
				} else if ((i == 6 || i == 8) && (j == 3 || j == 4 || j == 5 || j == 6 || j == 7)) {
					System.out.print(" ");
				} else if (i == 7 && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7)) {
					System.out.print(" ");
				}else {
					System.out.print(j + " ");
				}

			}
			System.out.println(" ");
		}
		
		System.out.println("");
		System.out.println("--------------------");
		
		//Second try:
		for(int a = 7; a > 1; a--) {  // to print how many rows // the number is decreasing so from 7 to 1
			for(int b = 1; b <= a; b++) {  // to print how many numbers in one row
				System.out.print(b +" ");
			}
			System.out.println("");

		}
		for(int c = 1; c <= 7; c++) { // to print how many rows
			for(int d = 1; d <= c; d++) {
				System.out.print(d + " ");
			}
			System.out.println();
		}

	}

}
