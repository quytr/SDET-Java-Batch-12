package com.replit.hw;

import java.util.Scanner;

public class LogicalOperators035 {

	public static void main(String[] args) {
		/*
		 * Create a program that prompt user with question: "Do you need a loan?"(Use a
		 * boolean)
		 * 
		 * If the result is true then prompt user with question:
		 * "What is your credit score?". Otherwise eligibility is "Unknown"
		 * 
		 * Based on the score define users eligibility:
		 * 
		 * if score is below 600 --> eligibility = "Not eligible" if score is between
		 * 600 and 700 inclusive --> eligibility = "Maybe eligible" if score is between
		 * 701 and 800 inclusive --> eligibility = "Eligible" if score is higher than
		 * any other previous values --> eligibility = "Definitely eligible" .
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Do you need a loan?");
		boolean answer = sc.nextBoolean();

		if (answer) {
			System.out.println("What is your credit score?");
			int score = sc.nextInt();
			String eli;

			if (score < 600) {
				eli = "Not eligible";

			} else if ((score >= 600) && score <= 700) {
				eli = "Maybe eligible";

			} else if (score >= 701 && score <= 800) {
				eli = "Eligible";

			} else {
				eli = "Definitely eligible";
			}
			System.out.println("The eligibility is " + eli);

		} else {
			System.out.println("Unknown");
		}

	}

}
