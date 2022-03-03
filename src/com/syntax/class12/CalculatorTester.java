package com.syntax.class12;

public class CalculatorTester {

	public static void main(String[] args) {
		
		Calculator simpleMathCal = new Calculator();
		simpleMathCal.add();
		simpleMathCal.addNumbers(10, 25);
		simpleMathCal.addNumbers(30, 30);
		
		int number1 = 50;
		int number2 = 50;
		simpleMathCal.addNumbers(number1,number2);
		
		
		
		

	}

}
