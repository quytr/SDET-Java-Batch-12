package com.replit.hw;

import java.util.Scanner;

public class NestedIf034 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the largest number among three distinct numbers using
		 * nested if condition
		 * 
		 * Please use Scanner class to take input from users
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter 3 distinct numbers");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("The largest number is " + a);
			} else if (a < c) {
				System.out.println("The largest number is " + c);
			}

		} else if (a < b) {
			if (b > c) {
				System.out.println("The largest number is " + b);
			} else if (b < c) {
				System.out.println("The largest number is " + c);
			}
		}

	}

}
