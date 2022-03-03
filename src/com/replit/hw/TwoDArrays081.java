package com.replit.hw;

public class TwoDArrays081 {

	public static void main(String[] args) {
		/*
		 * Write a program that prints the highest value in the array.
		 * 
		 * Expected Output: input [5,4,8]
		 * 
		 * 8
		 */
		
		int[] arr = {5,4,8};
		
		int largestNum = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] > largestNum) {
				
				largestNum = arr[i];
			}
		}
		
		System.out.println(largestNum);

	}

}
