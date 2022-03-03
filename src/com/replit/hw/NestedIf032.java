package com.replit.hw;

import java.util.Scanner;

public class NestedIf032 {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter his/her gender "Please enter your gender: M or F" and
		 * their age "Please enter your age"
		 * 
		 * You have 2 conditions:
		 * 
		 * If age is above 25, then check if a user entered F then the output should be
		 * "Woman" otherwise it should say "Man"
		 * 
		 * If age is below 25, then check if a user entered F then the output should be
		 * "Girl" otherwise it should say "Boy"
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your gender: M or F");

		char gender = sc.next().charAt(0);

		System.out.println("Please enter your age");

		int age = sc.nextInt();

		if (gender == 'F') {
			if (age > 25) {
				System.out.println("Woman");
			} else {
				System.out.println("Girl");
			}

		} else if (gender == 'M') {
			if (age > 25) {
				System.out.println("Man");
			} else {
				System.out.println("Boy");
			}

		}

	}

}
