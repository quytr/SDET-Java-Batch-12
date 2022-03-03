package com.syntax.class04;

import java.util.Scanner;

public class DMVAgeCheck {

	public static void main(String[] args) {

		Scanner DMVrep = new Scanner(System.in);

		System.out.println("Welcome to DMV!");

		System.out.println("How old are you?");

		int age = DMVrep.nextInt();

		if (age >= 18) {
			System.out.println("Congrats! You are eligible to get a driver license!");
		} else {
			System.out
					.println("Sorry! Please get a learners permit first and wait until you're 18 for driver license.");
		}

	}

}
