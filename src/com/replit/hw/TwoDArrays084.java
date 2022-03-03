package com.replit.hw;

public class TwoDArrays084 {

	public static void main(String[] args) {
		/*
		 * Write a program that prints the total number of elements that are negative
		 * AND odd
		 */
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
		int total = 0;
		
		for(int[] row : a) {
			
			for(int col : row) {
				
				if(col < 0 && col%2 != 0) {
					total+=1;
				}
			}
		}
		
		System.out.println(total);
		

	}

}
