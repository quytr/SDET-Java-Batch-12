package com.syntax.class04;

import java.util.Scanner;

public class CreditCardCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have creadit card? ");
		System.out.println("Please answer yes or no");
		String answer = sc.nextLine();

		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Do you want to create a credit card? yes/no");
			String answer1 = sc.nextLine();
			if (answer1.equalsIgnoreCase("yes")) {
				System.out.println("Congrats! Here your new credit card!");
			} else if (answer1.equalsIgnoreCase("no")) {
				System.out.println("Thank you! Have a good day!");
			} else {
				System.out.println("Invalid answer! Please try again!");
			}
		} else if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is your balance on the card?");
			Double balance = sc.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your blance $" + balance + " immediately.");
			} else {
				System.out.println("You can spend more $$$");
			}
		} else {
			System.out.println("Invalid answer! Please try again!");
		}

	}

}
