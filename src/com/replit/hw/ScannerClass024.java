package com.replit.hw;

import java.util.Scanner;

public class ScannerClass024 {

	public static void main(String[] args) {
		/*
		 * Write a program that takes a user's name and prints it.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Hellow, please enter your name");

		String name = sc.nextLine();

		System.out.println("Your name is " + name);

	}

}
