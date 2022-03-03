package com.syntax.class09;

public class ArrayHW4 {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number
		 */

		int[] numbs = { 100, 30, 1992, 8, 90 };

		int largestNum = numbs[0];

		for (int i = 1; i < numbs.length; i++) {
			if (numbs[i] > largestNum) {
				largestNum = numbs[i];
			}
		}

		System.out.println("The largest number is " + largestNum);

	}
}