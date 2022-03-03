package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it Once values are captured print
		 * which language user speaks
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your country:");

		String country = sc.nextLine();

		String language;

		switch (country) {
		case "Vietnam":
			language = "Vietnamese";
			break;
		case "USA":
			language = "English";
			break;
		case "Thailand":
			language = "Thai";
			break;
		case "China":
			language = "Mandarin";
			break;
		default:
			language = "Unknown";
			break;
		}
		
		sc.close();
		
		System.out.println("You are from " + country + " and you speak " + language);

	}

}
