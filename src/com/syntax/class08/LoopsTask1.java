package com.syntax.class08;

public class LoopsTask1 {

	public static void main(String[] args) {
		/*
		 * I want to find out the sum of all even and all odd numbers from the range 1
		 * to 50
		 */
		
		int sumEven =0;
		int sumOdd = 0;
		for (int num = 1; num <= 50; num++) {
			if (num % 2 == 0) {
				sumEven += num;
//				System.out.println(num);
			} else {
				sumOdd += num;
//				System.out.println(num);
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);

	}

}
