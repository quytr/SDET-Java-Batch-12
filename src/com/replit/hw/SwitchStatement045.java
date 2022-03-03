package com.replit.hw;

import java.util.Scanner;

public class SwitchStatement045 {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter any number from 1-7.
		 * 
		 * Based on the number define the day of the week
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Input a number between 1-7");
		int num = sc.nextInt();

		String day;

		switch (num) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "Invalid";
			break;

		}
		System.out.println(day);

	}

}
