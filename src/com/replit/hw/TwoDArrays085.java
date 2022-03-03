package com.replit.hw;

public class TwoDArrays085 {

	public static void main(String[] args) {
		/*
		 * Write a program that sums all numbers that are on even index and on even row.
		 * 
		 * Expected Output:
		 * 
		 * -4
		 */

		int[][] a = { 
				{ -5, -2, -3, 7 },  //row 1
				{ 1, -5, -2, 2 },  //row 2
				{ 1, -2, 3, -4 },  //row 3
		};

		
		int size = a.length;
		
		for(int i = 0; i < size; i++) {
			
			int sum = 0;
			
			if(i%2 != 0) {
				
				for(int j = 0; j < a[i].length; j++) {
					sum += a[i][j];
		
				}
				System.out.println(sum);
				
			}
		
			}
		}
	



	

	}


