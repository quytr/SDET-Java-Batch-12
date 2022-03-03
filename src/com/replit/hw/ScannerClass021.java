package com.replit.hw;

import java.util.Scanner;

public class ScannerClass021 {

	public static void main(String[] args) {
		/*
		 * Write a program that asks the user's age: "Enter your age " Then display it
		 * by adding 10 (i.e age + 10) in your final output.
		 */

		Scanner box = new Scanner(System.in);

		System.out.println("Enter your age");

		int age = box.nextInt();

		System.out.println("Your age after 10 years is " + (age + 10));

	}

}
