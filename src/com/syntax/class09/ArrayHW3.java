package com.syntax.class09;

public class ArrayHW3 {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */

		int[] numbs = { 3, 10, 2, 11, 2022 };
		int sum = 0;
		for (int numb : numbs) {
			sum += numb;
		}
		System.out.println("The sum of all elements is " + sum);

	}

}
