package com.replit.hw;

import java.util.Scanner;

public class ScannerClass022 {

	public static void main(String[] args) {
		/*
		 * Write a program to take user name, age and mobile number
		 * 
		 * First Output: "Enter your name"
		 * 
		 * Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
		 * 
		 * Third Output: "Enter your age"
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");

		String name = sc.nextLine();

		System.out.println("Enter your mobile number");

		String phoneNumber = sc.nextLine();

		System.out.println("Enter your age");

		int age = sc.nextInt();

		System.out
				.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + phoneNumber);

	}

}
