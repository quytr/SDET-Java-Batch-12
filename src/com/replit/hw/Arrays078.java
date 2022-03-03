package com.replit.hw;

import java.util.Scanner;

public class Arrays078 {

	public static void main(String[] args) {
		/*
		 * Create an int array of integers with a size of 5 and input values with
		 * Scanner.
		 * 
		 * Don't print prompt questions for a user.
		 * 
		 * Using loop print out each element of the array that should look like the
		 * output below
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int size = arr.length;
		
		for(int i = 0; i < size; i++) {
			
			arr[i] = sc.nextInt();
			
			arr[i] *= 10;
			
			System.out.println(arr[i]);
		}
		
		
		

	}

}
