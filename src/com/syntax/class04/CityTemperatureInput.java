package com.syntax.class04;

import java.util.Scanner;

public class CityTemperatureInput {

	public static void main(String[] args) {

		Scanner box = new Scanner(System.in);

		System.out.println("Please enter your city:");

		String city = box.nextLine();

		System.out.println("Please enter your city's temperature:" + " ___ Fahrenheit.");

		double temperature = box.nextDouble();

		temperature = (temperature - 32) / 1.8;

		System.out.println("Awesome! The temperature is " + temperature + " Celsius and the city is " + city + ".");
	}

}
