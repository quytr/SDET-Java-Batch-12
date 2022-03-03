package com.replit.hw;

public class ClassAndObject087 {
	/*
	 * Create a class named 'Main' with specific attributes.
	 * Create two objects of that class in which you will be assigning the following
	 * values and then print them.
	 * 
	 * carColor='Black'
	 * carYear=2019
	 * carMake='BMW'
	 * carColor='White'
	 * carYear=2018
	 * carMake='Toyota'
	 * 
	 * Expected Output:
	 * Car color is Black and car year is 2019 and car model is BMW 
	 * Car color is White and car year is 2018 and car model is Toyota
	 */
	
	String carColor;
	int carYear;
	String carMake;
	
	void printLine() {
		System.out.println("Car color is " + carColor + " and car year is " + carYear + " and car model is " + carMake);
	}

	public static void main(String[] args) {
		ClassAndObject087 car1 = new ClassAndObject087();
		car1.carColor = "Black";
		car1.carYear = 2019;
		car1.carMake = "BMW";
		car1.printLine();
		
		ClassAndObject087 car2 = new ClassAndObject087();
		car2.carColor = "White";
		car2.carYear = 2018;
		car2.carMake = "Toyota";
		car2.printLine();

	}

}
