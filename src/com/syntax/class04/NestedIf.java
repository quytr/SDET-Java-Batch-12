package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 2;

		if (vaccine) {
			System.out.println("How many doses you have?");

			if (dose == 1) {
				System.out.println("You need another shot");
			} else {
				System.out.println("You are fully vaccinated!");
			}

		} else {
			System.out.println("I dont have any further questions.");
		}

		boolean allergy = false;

		if (allergy) {
			System.out.println("Let's check what allergies you have");

			String allergyType = "pollen";
			
			/* 
			 * nested if --> always has a dependency on outer if.
			 * outer if MUST be true in order for nested if to be checked
			 */

			if (allergyType.equals("pollen")) {
				System.out.println("Please take medication A");
			} else if (allergyType.equals("peanut")) {
				System.out.println("Please do not eat food that contains nuts.");
			} else if (allergyType.equals("gluten")) {
				System.out.println("Please follow gluten free diet.");
			}else {
				System.out.println("No suggestion to give");
			}

		} else {
			System.out.println("You are lucky!!!");
		}

	}

}
