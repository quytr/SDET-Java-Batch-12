package com.replit.hw;

public class NestedForLoops067 {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern:
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 * 
		 * 2 4 6 8 10 12 14 16 18 20
		 * 
		 * 3 6 9 12 15 18 21 24 27 30
		 * 
		 * 4 8 12 16 20 24 28 32 36 40
		 * 
		 * 5 10 15 20 25 30 35 40 45 50
		 */
		int num = 0;
		for(int i = 1; i <=5; i++) {
			for(int j =1; j <=10; j++) {
				num = i*j;
				System.out.print(num + " ");
			}
			System.out.println("");
			
		}
//
//		for (int i = 1; i <= 10; i++) {
//
//			System.out.print(i + " ");
//
//		}
//		System.out.println(" ");
//
//		for (int j = 2; j <= 20; j += 2) {
//			System.out.print(j + " ");
//		}
//		System.out.println("");
//
//		for (int k = 3; k <= 30; k += 3) {
//			System.out.print(k + " ");
//		}
//		System.out.println("");
//
//		for (int f = 4; f <= 40; f += 4) {
//			System.out.print(f + " ");
//		}
//		System.out.println("");
//
//		for (int h = 5; h <= 50; h += 5) {
//			System.out.print(h + " ");
//		}
//
//		System.out.println("");
//		System.out.println("---------");
//
//		for (int a = 1; a <= 5; a++) {
//			if (a == 1) {
//				for (int b = 1; b <= 10; b++) {
//					System.out.print(b + " ");
//				}
//			} else if (a == 2) {
//				for (int c = 2; c <= 20; c += 2) {
//					System.out.print(c + " ");
//				}
//			} else if (a == 3) {
//				for (int d = 3; d <= 30; d += 3) {
//					System.out.print(d + " ");
//				}
//			} else if (a == 4) {
//				for (int e = 4; e <= 40; e += 4) {
//					System.out.print(e + " ");
//				}
//			} else if (a == 5) {
//				for (int f = 5; f <= 50; f += 5) {
//					System.out.print(f + " ");
//				}
//			}
//			System.out.println(" ");
//		}

	}

}
