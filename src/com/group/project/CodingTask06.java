package com.group.project;

import java.util.Scanner;

public class CodingTask06 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 * 
		 * What is prime number? Positive numbers and greater than 1 The number can be
		 * divisible ONLY by 1 and itself. Ex: 1-100 2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
		 * 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number");

		int number = sc.nextInt();
		

		if (number % 2 == 0 && number != 2) {
			System.out.println(number + " is not a prime number");
		} else if (number % 3 == 0 && number != 3) {
			System.out.println(number + " is not a prime number");
		} else if (number % 5 == 0 && number != 5) {
			System.out.println(number + " is not a prime number");
		} else if (number % 7 == 0 && number != 7) {
			System.out.println(number + " is not a prime number");
		} else if (number <= 1) {
			System.out.println(number + " is not a prime number");
		} else {
			System.out.println(number + " is a prime number");
		}

	}

}
