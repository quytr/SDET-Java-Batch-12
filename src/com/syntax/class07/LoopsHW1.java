package com.syntax.class07;

public class LoopsHW1 {

	public static void main(String[] args) {
		// 1. Print numbers from 1 to 100 in 1 line with space
		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		System.out.println("");

		// 2. Print numbers from 100 to 1
		for (int b = 100; b >= 1; b--) {
			System.out.print(b + " ");
		}
		System.out.println("");

		// 3. Print even numbers from 20 to 1 (2 ways)
		// Option 1:
		for (int c = 20; c >= 1; c--) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
		System.out.println("");
		// Option 2:
		for (int d = 20; d >= 1; d -= 2) {
			System.out.print(d + " ");
		}
		System.out.println("");
		// 4. Print odd numbers between 20 and 50 (2 ways)
		// Option 1:
		for (int x = 20; x <= 50; x++) {
			if (x % 2 != 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println("");
		//Option 2:
		for(int y = 21; y <=50; y+=2) {
			System.out.print(y + " ");
		}

	}

}
