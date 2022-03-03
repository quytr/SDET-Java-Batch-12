package com.syntax.class13;

public class MethodsHW2 {

	// Create a method that will take a number and prints whether the number is even
	// or odd.

	void checkOddEven(int numb) {
		if (numb % 2 == 0) {
			System.out.println(numb + " is even number");
		} else {
			System.out.println(numb + " is odd number");
		}
	}

	public static void main(String[] args) {

		MethodsHW2 obj = new MethodsHW2();

		obj.checkOddEven(20);
		obj.checkOddEven(15);

	}

}
