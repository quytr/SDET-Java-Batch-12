package com.syntax.class13;

public class MethodsHW1 {

	// Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.

	void largerNumb(int numb1, int numb2) {
		if (numb1 > numb2) {
			System.out.println("The larger number is " + numb1); 
		} else if (numb2 > numb1) {
			System.out.println("The larger number is " + numb2); 
		} else {
			System.out.println("Numbers are equal");
		}
	}

	public static void main(String[] args) {

		MethodsHW1 obj = new MethodsHW1();

		obj.largerNumb(8, 90);
		obj.largerNumb(50, 10);
		obj.largerNumb(0, 0);

	}

}
