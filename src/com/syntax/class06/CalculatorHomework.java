package com.syntax.class06;

import java.util.Scanner;

public class CalculatorHomework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double num1 = sc.nextDouble();

		System.out.println("Please enter the operator:");
		String operator = sc.next();

		System.out.println("Please enter the second number:");
		double num2 = sc.nextDouble();

		double result = 0;

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("Error");
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

	}

}
