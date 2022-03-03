package com.syntax.class07;

import java.util.Scanner;

public class LoopsHW3 {

	public static void main(String[] args) {
		/*
		 * Ask a user to enter name, last name and age 5 times. Every time your program
		 * should print those values in a format “You name is _ _ and you are _ years
		 * old’
		 */
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Please enter your first name:");
			String firstName = sc.next();

			System.out.println("Please enter your last name:");
			String lastName = sc.next();

			System.out.println("Please enter your age:");
			int age = sc.nextInt();

			System.out.println("You name is " + firstName + " " + lastName + " and you are " + age + " years old");
		}
	

	}

}
