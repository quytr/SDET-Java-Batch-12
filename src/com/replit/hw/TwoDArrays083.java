package com.replit.hw;

public class TwoDArrays083 {

	public static void main(String[] args) {
		/*
		 * Write a program that calculates the sum of elements from each row in a 2D
		 * array and adds them into array of integers
		 * 
		 * For example, if we run rowSums for the following 2D array:
		 * {1,1,2}, //sum = 4 
		 * {3,1,2}, //sum = 6 
		 * {3,5,3}, //sum = 11 
		 * {0,1,2} //sum = 3 
		 */
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
		
		for(int[] row : a ) {
			
			int sum = 0;
			
			for(int col : row) {
				
				sum+=col;
				
			}
		
			System.out.println(sum);
		}


	}

}
