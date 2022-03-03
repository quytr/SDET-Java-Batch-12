package com.syntax.class09;

public class ArrayFindLargestNumb {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number
		 */

		int[] numbs = { 1030, 30, 46, 990, 2010 };

		int largeNum = 0;

		for (int numb : numbs) {
			if (numb > largeNum) {
				largeNum = numb;

			}
		}
		System.out.println("The largest number is " + largeNum);

	}

}
