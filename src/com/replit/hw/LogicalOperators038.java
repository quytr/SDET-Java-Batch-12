package com.replit.hw;

import java.util.Scanner;

public class LogicalOperators038 {

	public static void main(String[] args) {
		/*
		 * Prompt user with a question: "Is it weekend?"
		 * 
		 * If it is not a weekend --> subject="manual testing"
		 * 
		 * Otherwise --> subject="Java"
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Is it weekend?");

		boolean answer = sc.nextBoolean();

		String subject;

		if (answer) {
			subject = "Java";

		} else {
			subject = "manual testing";

		}
		System.out.println("Today you will be learning " + subject);

	}

}
