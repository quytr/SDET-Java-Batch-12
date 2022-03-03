package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		int num = 1;

		// creating an array that holds 4 elements
		int[] numbers = new int[4];
		// storing values/element inside an array
//		numbers[0] = 90;
		numbers[1] = 87;
		numbers[2] = 89;
		numbers[3] = 99;

		System.out.println(numbers[0]);

		System.out.println(numbers[3] + numbers[0]); // addition 189

		System.out.println("----------");

		// I want to create an array of countries
		String[] countries = new String[5];
		countries[0] = "Vietnam";
		countries[1] = "USA";
		countries[2] = "Canada";
		countries[3] = "Thailand";
		countries[4] = "Japan";

		System.out.println(countries[3]);
		System.out.println(countries[0] + countries[4]);

		System.out.println("----------");

		String[] names = new String[5];
		names[1] = "Quy";
		names[2] = "Sophie";
		names[3] = "Tom";

		System.out.println(names[0]);

		names[1] = "Sora";
		System.out.println(names[1]);

		System.out.println("-----------");

		// Create an array to store 4 different prices
		// Find an average of how much we spend

		double[] prices = new double[4];
		prices[0] = 52.99;
		prices[1] = 19.58;
		prices[2] = 108.33;
		prices[3] = 5.99;

		double aveMoney = (prices[0] + prices[1] + prices[2] + prices[3]) / 4;

		System.out.println("$" + aveMoney);

	}

}
