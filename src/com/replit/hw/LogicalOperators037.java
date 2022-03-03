package com.replit.hw;

import java.util.Scanner;

public class LogicalOperators037 {

	public static void main(String[] args) {
		/*
		 * Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?"
		 * 
		 * "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=water
		 * 
		 * If user is thirsty and sleepy--> drink=coffee
		 * 
		 * If user is not thirsty and sleepy --> drink=tea
		 * 
		 * Otherwise drink="nothing"
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean isThirsty = sc.nextBoolean();

		System.out.println("Are your sleepy?");
		boolean isSleepy = sc.nextBoolean();

		String drink;

		if (isThirsty && isSleepy) {
			drink = "coffee";

		} else if (isThirsty && !isSleepy) {
			drink = "water";

		} else if (!isThirsty && isSleepy) {
			drink = "tea";

		} else {
			drink = "nothing";

		}
		System.out.println("Looks like you need to drink " + drink);

	}

}
