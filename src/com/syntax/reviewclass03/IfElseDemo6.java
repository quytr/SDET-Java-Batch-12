package com.syntax.reviewclass03;

public class IfElseDemo6 {

	public static void main(String[] args) {
		String day = "Sunday";
		if (day.equals("Sunday")) {
			System.out.println("Its weekend");
		} else if (day.equals("Saturday")) {
			System.out.println("Its weekend");
		} else {
			System.out.println("Its weekday");
		}

		// shorter way and cleaner way by using logical operators
		String day1 = "Sunday";
		if (day1.equals("Sunday") || day1.equals("Saturday")) {
			System.out.println("Its weekend");

		} else {
			System.out.println("Its weekday");
		}

	}

}
