package com.syntax.class05;

public class CleanLargestNumber {

	public static void main(String[] args) {
		/*
		 * find out the largest number out the 3 given numbers
		 * and then define whether largest number is even or
		 */
		int num1 = 1000;
		int num2 = 2000;
		int num3 = 300;
		
		int largest = 0;
		
		if(num1 > num2 && num1 > num3) {
			largest = num1;
			
		}else if ( num2 > num1 && num2 > num3) {
			largest = num2;
			
		}else if (num3 > num1 && num3 > num2) {
			largest = num3;
			
		}
		System.out.println(largest);
		
		if(largest %2 ==0) {
			System.out.println(largest + " is even number");
			
		}else {
			System.out.println(largest + " is odd number");
		}

	}

}
