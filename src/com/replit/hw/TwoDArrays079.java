package com.replit.hw;

public class TwoDArrays079 {

	public static void main(String[] args) {
		/*
		 * Write a program to print values from a 2D array
		 * 
		 * Example Output:
		 * 
		 * 1.4 2.0 3.3 2.0 
		 * 4.0 1.5 6.1 1.0 
		 * 1.2 3.1 4.0 1.6
		 */
		
		double[][] numbs = {
				{1.4 , 2.0, 3.3, 2.0},
				{4.0, 1.5, 6.1, 1.0},
				{1.2, 3.1, 4.0, 1.6}
		};
	
		//for each loop:	
		for(double[] row : numbs) {
			
			for(double col : row) {
				
				System.out.print(col +" ");
						
			}
			System.out.println("");
			
		}
		System.out.println("------------------------------------------");
		
		//for loop:
		for(int row = 0; row < numbs.length; row++) {
			
			for(int col =0; col < numbs[row].length; col++) {
				
				System.out.print(numbs[row][col] + " ");
			}
			
			System.out.println("");
		}
		
		

	}

}
