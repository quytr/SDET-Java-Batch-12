package com.syntax.class10;

public class ArrayInClassTask {

	public static void main(String[] args) {
		// create an array and retrieve all elements in reverse order

		String[] cars = { "Toyota", "BMW", "Honda", "Telsa", "Jeep", "Audi", "GMC" };

		int indexNum = cars.length - 1;

		for (int i = indexNum; i >= 0; i--) {
			System.out.print(cars[i] + " ");
		}

	}

}
