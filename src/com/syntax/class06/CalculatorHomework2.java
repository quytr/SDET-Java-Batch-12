package com.syntax.class06;

import java.util.Scanner;

public class CalculatorHomework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double num1 = sc.nextDouble();

		System.out.println("Please enter the operator:");
		char operator = sc.next().charAt(0);

		System.out.println("Please enter the second number:");
		double num2 = sc.nextDouble();

		double result = 0;

		if (operator == '+') {
			result = num1 + num2;

		} else if (operator == '-') {
			result = num1 - num2;

		} else if (operator == '*') {
			result = num1 * num2;

		} else if (operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("Error");
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

	}
}
