package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		int age = 19;
		int weight = 100;

		if (age >= 18) {
			System.out.println("You are eligible. Let's check your weight!");
			if (weight > 110) {
				System.out.println("You are eligible to donate your blood.");
			} else {
				System.out.println("You are under weight. We can't accept your blood donation.");
			}
		} else {
			System.out.println("Sorry. You are not old enough. We cannot accept your blood donation.");
		}

	}

}
