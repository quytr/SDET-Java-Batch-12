package com.syntax.reviewclass04;

public class IfElse {

	public static void main(String[] args) {

		String month = "Jan";
		int day = 2;
		
		// "Jan".equals(month)
		if ("Jan".equals(month)) {
			if (day == 1) {
				System.out.println("It is the first of Jan");
			} else {
				System.out.println("It is Jan but not first of Jan");
			}
		} else {
			System.out.println("it is not Jan");
		}

	}

}
