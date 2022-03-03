package com.group.project;

import java.util.Scanner;

public class CodingTask06Solution {

	public static void main(String[] args) {
		
		/*
		 * If a number is not greater than 1, it is not prime
		 * if a number is greater than 2 divide that number with all the numbers
		 * and check if you get a remainder == 0 if yes that number is
		 * not prime
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number");

		int number = sc.nextInt();
		
		boolean isPrime = true;
		
		if(number >1) {
			for(int i =2; i<number; i++) {
				if(number%i ==0) {
					isPrime = false;
					break;
				}
			}
			
		}else {
			isPrime = false;
		}
		
		System.out.println(number + " isPrime " + isPrime);
	}

}
