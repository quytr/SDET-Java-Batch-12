package com.syntax.class04;

public class NestIfTask {

	public static void main(String[] args) {

		// Task 1
		boolean diploma = true;

		if (diploma) {
			System.out.println("Congraduations!");

			double gpaScore = 3.1;

			if (gpaScore >= 3.5) {
				System.out.println("Awesome! You are eligible for scholarship!");
			} else {
				System.out.println("You should have studied harder to get scholarship.");
			}
		} else {
			System.out.println("You need to get a degree...");
		}

		System.out.println("***************");

		// Task 2
		double mortgageRate = 3.4;

		if (mortgageRate > 4.5) {
			System.out.println("Don't buy the house!!!");
		} else {
			System.out.println("You can consider to buy a house.");

			int mortgagePrice = 740000;

			if (mortgagePrice > 50000) {
				System.out.println("Not enough money! You will need to take a loan!");
			} else {
				System.out.println("Congraduations!You can pay cash!");
			}
		}

	}

}
