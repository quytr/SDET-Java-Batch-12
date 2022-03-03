package com.syntax.class07;

import java.util.Scanner;

public class LoopsHW2 {

	public static void main(String[] args) {
		/*
		 * Declare a variable to store a price for a coffee. Ask user to pay for a
		 * coffee. Keep asking to pay for coffee until user enters exact amount . If
		 * user give more than the price --> ask them to give less, if user gives less money
		 * then ask to give more. Once user got a write amount print “Please enjoy your
		 * candy”
		 */

		int priceCoffee = 5;
		Scanner sc = new Scanner(System.in);
		int pay;

		do {
			System.out.println("Please pay for the coffee");
			pay = sc.nextInt();

			if (pay > priceCoffee) {
				System.out.println("Give less please!");
			} else if (pay < priceCoffee) {
				System.out.println("Give more please!");
			}

		} while (pay != priceCoffee);

		System.out.println("Thank you! Enjoy your coffee");

	}
}
