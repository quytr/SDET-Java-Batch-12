package com.replit.hw;

public class DoWhileLoop053 {

	public static void main(String[] args) {
		/*
		 * Using do while loop print even numbers from 20 to 1
		 */
		int i = 20;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i--;
		} while (i >= 1);

	}

}
