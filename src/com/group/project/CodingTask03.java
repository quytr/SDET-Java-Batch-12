package com.group.project;

import java.util.Scanner;

public class CodingTask03 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter how many rows you want for the 2D Array");
		
		int a = sc.nextInt();
		
		System.out.println("Please enter how many columns you want for the 2D Array");
		
		int b = sc.nextInt();

		int[][] numbs = new int[a][b];

		int row = 0;

		int col = 0;

		for (row = 0; row < numbs.length; row++) {

			for (col = 0; col < numbs[row].length; col++) {

				System.out.println("Please enter number " + (col + 1) + " of row " + (row + 1));

				numbs[row][col] = sc.nextInt();

			}

		}

		for (int[] numb : numbs) {
			
			for (int innerNumb : numb) {
				
				if (innerNumb % 2 == 0) {
					
					System.out.print(innerNumb + " ");
				}
			}
		}

	}

}
