package com.replit.hw;

import java.util.Scanner;

public class ConditionalStatement028 {

	public static void main(String[] args) {
		/*
		 * Write a program to take values of length and width from the user.
		 * 
		 * Based on value define whether the shape is a square or rectangle.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the length");

		int length = sc.nextInt();

		System.out.println("Please enter the width");

		int width = sc.nextInt();

		if (length == width) {
			System.out.println("The shape of your object is square");

		} else {
			System.out.println("The shape of your object is rectangle");

		}
	}

}
