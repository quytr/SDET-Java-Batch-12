package com.syntax.class02;

public class PracticeOperators {

	public static void main(String[] args) {
		// 1.
		int num1 = 1992;
		int num2 = 2;

		int sum = num1 + num2;
		int sub = num1 - num2;
		int div = num1 / num2;
		int multi = num1 * num2;

		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);
		System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + multi);

		// 2.
		double num3 = 3.9;
		double square = num3 * num3;

		System.out.println("The square of the " + num3 + " is " + square);

		// 3.
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);

		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);

	}

}
