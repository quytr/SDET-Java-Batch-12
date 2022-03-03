package com.syntax.class09;

public class ArrayAnotherWay {

	public static void main(String[] args) {

		// I want to create an array of color
		String[] colors = { "blue", "pink", "yellow", "orange" };

		System.out.println("My favorite color is " + colors[2]);

		// possible to do declaration and initialization in 2 steps
		String[] array; // 1. declaring
		array = new String[4]; // 2. initializing size
		
		// NOT possible to do declaration and initialization in 2 steps
		/*
		 * String[] arr;
		 * arr = {}
		 */

	}

}
