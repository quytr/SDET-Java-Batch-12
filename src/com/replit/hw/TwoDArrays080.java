package com.replit.hw;

public class TwoDArrays080 {

	public static void main(String[] args) {
		/*
		 * Write a program to double the values of every element in the array and print it out.
		 */
		
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
			//Double and print array
		double arr = 0;
		
		for(double[]row : a) {
			
			for(double col : row) {
				
				arr = col * 2;
				
				System.out.print(arr + " ");
			}
			
			System.out.println("");
		}
		

	}

}
