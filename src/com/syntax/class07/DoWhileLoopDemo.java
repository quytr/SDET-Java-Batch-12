package com.syntax.class07;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// while loop:
		int num = 2;
		while (num <= 3) {
			System.out.println("Hello"); // 5 times
			num++;
		}

		// do loop:
		int num1 = 10;
		do {
			System.out.println("Hi");
			num1++;
		} while (num1 <= 3);

		// I want to print numbers from 1 to 30 using do while loop
		int a = 1;
		do {
			System.out.print(a + " ");
			a++;
		} while (a <= 30);    
	}

}
