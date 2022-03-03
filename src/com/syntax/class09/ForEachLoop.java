package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] cities = { "Washington DC", "Boston", "Miami", "Los Angeles", "New York" };

		// if you have an array, you can use for each loop to iterate/loop through the
		// entire array

		for (String city : cities) {
			System.out.println(city);

		}
		System.out.println("--------------------------");

		int[] numbers = { 10, 20, 30, 40 };

		for (int num : numbers) {
			System.out.println(num);

		}

		System.out.println("-------------------");

		char[] grades = { 'A', 'B', 'C', 'D' };

		for (char grade : grades) {
			System.out.println(grade);
		}

		System.out.println("-------------");

		String[] countries = new String[5];
		countries[0] = "Vietnam";
		countries[1] = "USA";
		countries[2] = "Canada";
		countries[3] = "Thailand";
		countries[4] = "Japan";
		
		for(String country: countries) {
			if("Canada".equals(country)) {
				continue;
			}
			System.out.println(country);

		}

	}

}
