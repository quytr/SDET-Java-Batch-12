package com.syntax.class04;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner box = new Scanner(System.in);
		System.out.println("Please enter your first number:");
		int num1 = box.nextInt();
		System.out.println("Please enter your second number:");
		int num2 = box.nextInt();
		System.out.println("Please enter your third number:");
		int num3 = box.nextInt();
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("Your largest number is " + num1);
			} else if (num1 < num3) {
				System.out.println("Your largest number is " + num3);
			} else if (num1 == num3) {
				System.out.println("You largest number is " + num1);
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("Your largest number is " + num2);
			} else if (num2 < num3) {
				System.out.println("Your largest number is " + num3);
			} else if (num2 == num3) {
				System.out.println("Your largest number is " + num2);
			}
		} else if (num1 == num2) {
			if (num1 > num3) {
				System.out.println("Your largest numbers is " + num1);
			} else if (num1 < num3) {
				System.out.println("Your largest number is " + num3);
			} else if (num1 == num3) {
				System.out.println("No largest number. All numbers are same value!");
			}
		}
	}

}
