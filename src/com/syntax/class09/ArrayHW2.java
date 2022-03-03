package com.syntax.class09;

public class ArrayHW2 {
	public static void main(String[] args) {

		/*
		 * Create an array of animals and store 5 elements into it. Using 2 different
		 * loops print all elements from the array.
		 */

		String[] animals = { "Monkey", "Tiger", "Cow", "Sheep", "Panda" };

		// for each loop:
		for (String animal : animals) {
			System.out.println(animal);
		}

		// for loop:
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
	}

}
