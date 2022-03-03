package com.syntax.class07;

import java.util.Scanner;

public class SecretNumberUsingWhile {

	public static void main(String[] args) {
		/*
		 * create a secret number we want user to guess our secret number the moment
		 * user guessed my secret number -> my program should stop otherwise, it should
		 * continue to guess my number
		 */

		int secretNumber = 12;
		Scanner sc = new Scanner(System.in);
		int guessNumber;

		System.out.println("Please enter a number to win");
		guessNumber = sc.nextInt();
		
		while (guessNumber != secretNumber) {
			System.out.println("Please enter a number to win");
			guessNumber = sc.nextInt()
;
		}
		
		System.out.println("Congrats");

	}

}
