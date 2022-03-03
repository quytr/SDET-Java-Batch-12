package com.syntax.class04;

import java.util.Scanner;

public class BonusCheck {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);

		System.out.println("Please enter numbers of worked years: ___");

		int workedYear = box.nextInt();

		System.out.println("Please enter your annual salary: $ ___");

		Double annualSalary = box.nextDouble();

		if (workedYear < 5) {
			System.out.println("Sorry! You are NOT eligible for bonus.");

		} else {
			System.out.println("Congrats! You are getting bonus for this year!");

			if (annualSalary > 50000) {
				System.out.println("Your bonus will be $5000. Woohoo!");
			} else {
				System.out.println("You will receive $3000 for your bonus! Keep it up!");
			}
		}

	}

}
