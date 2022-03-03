package com.replit.hw;

import java.util.Scanner;

public class ScannerClass020 {

	public static void main(String[] args) {
		/*
		 * Write a program that takes user's first name and last name and prints in
		 * console
		 * 
		 * Instruct the user to enter first name: "Please Enter First Name"
		 * 
		 * Capture the first name
		 * 
		 * Instruct the user to enter last name:"Please Enter Last Name"
		 * 
		 * Capture last name
		 * 
		 * Print first name and last name
		 * 
		 */

		Scanner box = new Scanner(System.in);

		System.out.println("Please Enter First Name");

		String firstName = box.nextLine();

		System.out.println("Please Enter Last Name");

		String lastName = box.nextLine();

		System.out.println(firstName + " " + lastName);

	}

}
