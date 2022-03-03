package com.replit.hw;

public class Arrays074 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers of size 11. Add the years
		 * 2010 to 2020 to your array one by one using a for loop and then print all
		 * those values.
		 */

		int[] years = new int[11];

		for (int i = 0; i < years.length; i++) {
			
			years[i] = 2010 + i;
			
			System.out.println(years[i]);
		}

	}

}
