package com.replit.hw;

public class Arrays075 {

	public static void main(String[] args) {
		/*
		 * Using the following array.
		 * 
		 * {45, 78, 12, 67, 55, 89, 23, 77, 88}
		 * 
		 * Create a for loop to extract values from that array so your output looks as
		 * below:
		 * 
		 * 78 55 77
		 * 
		 * Note: Find out what is the start point an how much you need to increment to
		 * get the result.
		 */

		int[] numbs = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		
		for(int numb : numbs) {
			if(numb == 78 || numb == 55 || numb == 77) {
				System.out.print(numb + " ");
			}
			
		}
		
		System.out.println("");
		
		for(int i = 1; i< numbs.length; i+=3) {
			System.out.print(numbs[i] + " ");
		}
		

	}

}
