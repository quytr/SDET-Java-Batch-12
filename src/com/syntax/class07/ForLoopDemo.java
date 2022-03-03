package com.syntax.class07;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello World");
		}

		System.out.println("I need to print numbers from 1 to 20");

		/*
		 * start point end point increment of decrement
		 */

		for (int a = 1; a <= 20; a++) {
			System.out.print(a + " ");
		}

		System.out.println("");
		System.out.println("I need to print numbers from 10 to 25:");

		for (int b = 10; b <= 25; b++) {
			System.out.print(b + " ");
		}
		
		System.out.println("");
		System.out.println("I need to print numbers from 50 to 1:");
		
		for(int c = 50; c >= 1; c--) {
			System.out.print(c + " ");
		}
		
	}

}
