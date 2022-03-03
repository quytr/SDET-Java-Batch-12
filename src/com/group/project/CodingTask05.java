package com.group.project;

public class CodingTask05 {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable
		 * 
		 * Example:
		 * X= 25 (First number), Y= 23 (second number) 
		 * Swapping Logic: 
		 * X = X + Y = 25 +23 = 48 
		 * Y = X - Y = 48 - 23 = 25 
		 * X = X -Y = 48 - 25 = 23 
		 * and the numbers are swapped as X =23 and Y =25.
		 * 
		 */
		
		int a = 38;
		int b = 18;
		
		System.out.println("Before swapping a = " + a + " and b = " + b );
		
		a = a + b;     //a = 38 + 18 = 56
		b = a - b;     //b = 56 - 18 = 38
		a = a - b;     //a = 56 - 38 = 18
		
		System.out.println("After swapping a = " + a + " and b = " + b);

	}

}
