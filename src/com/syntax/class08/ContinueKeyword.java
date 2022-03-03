package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");

			if (i == 2) {
				break;
			}
		}

		for (int x = 1; x <= 5; x++) {
			if (x == 3) {
				continue; // skip current iteration/cycle
			}

			System.out.println("Hi " + x);
			System.out.println("We are Batch 12 ");

		}

		// I want to print all numbers from 1 to 10 except number 4
		for (int y = 1; y <= 10; y++) {
			if (y == 4 || y == 7) {
				continue;
			}
			System.out.print(y + "  ");
		}

	}

}
