package com.group.project;

import java.util.Arrays;

public class CodingTask02 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer values. Print the sum of all numbers.
		 */
		
		int[][] numbs = {
				{1, -23, 5, 89},
				{2, 0, -11, -8},
				{4, 101, 5, 5},
				{0, 9, 0, -55}
		};
		
		int sum = 0;
		
		for(int[] row: numbs) {
			
			for(int col : row) {
				
				sum+=col;
			}
		}
		
		System.out.println("The sum of the array is " + sum);
		
		System.out.println("--------Another Way-----------");
		
		int sum2 = 0;
		
		for(int i =0; i <numbs.length;i++) {
			System.out.println(Arrays.toString(numbs[i]));
			for(int j =0; j <numbs[i].length;j++) {
				sum2+=numbs[i][j];
			}
		}
		System.out.println("The sum of the array is " + sum2);

	}

}
