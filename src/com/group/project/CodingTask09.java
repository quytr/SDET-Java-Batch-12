package com.group.project;

public class CodingTask09 {

	public static void main(String[] args) {

		/*
		 * Write a java program to find the second largest number in the array?
		 * 
		 */

		int[] numbs = { -40, 10, -17, 0, -85 };

		int largestNum = Integer.MIN_VALUE;

		int secLargest = Integer.MIN_VALUE;

		for (int numb : numbs) {

			if (numb > largestNum) {

				secLargest = largestNum;

				largestNum = numb;
			} // else if(numb > secLargest && numb != largesrNum{
			  // secLargest = numb;
			  //}
			  // or using if, like below

			if (numb < largestNum && numb > secLargest) {

				secLargest = numb;

			}

		}

		System.out.println("The largest number is " + largestNum);

		System.out.println("The second largest number is " + secLargest);

	}
}
