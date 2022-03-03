package com.syntax.class10;

public class ArrayInClassTask2 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. WHile retrieving all values from an array print
		 * capital for each country
		 */

		String[] countries = { "Vietnam", "Japan", "England", "USA", "Autralia", "Thailand" };

		String capital = null;

		for (String country : countries) {
			switch (country) {
			case "USA":
				capital = "Washington DC";
				break;
			case "Thailand":
				capital = "Bangkok";
				break;
			case "Australia":
				capital = "Canberra";
				break;
			case "England":
				capital = "London";
				break;
			case "Japan":
				capital = "Tokyo";
				break;
			case "Vietnam":
				capital = "Ho Chi Minh City";
				break;
			}
			System.out.println("The capital of " + country + " is " + capital);
		}

	}

}
