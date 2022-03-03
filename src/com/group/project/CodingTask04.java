package com.group.project;

public class CodingTask04 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 * 
		 */

		int[][] nums = { { 12, 35, 4, 9 }, { 45, 103, 11, 28 }, { 3, 9, 2, 16 } };

		int sumEven = 0;
		int sumOdd = 0;

		for (int row = 0; row < nums.length; row++) {

			for (int col = 0; col < nums[row].length; col++) {

//				System.out.println(nums[row][col]);

				if (nums[row][col] % 2 == 0) {

					sumEven += nums[row][col];

				} else {
					sumOdd += nums[row][col];
				}
			}
		}

		System.out.println("The sum of even numbers is " + sumEven);
		System.out.println("The sum of odd numbers is " + sumOdd);

	}

}
