package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.println("A");
//			continue;
			System.out.println("B");
		}

		System.out.println("-------------");

		for (int i = 1; i <= 3; i++) { // outer loop controls number of complete iteration of inner loop
			for (int j = 1; j <= 3; j++) { // inner loops always depend on outer loop
				System.out.println("Hello");
				break;
			}
			System.out.println("Good Morning");
		}
		
		System.out.println("------------");
		
		for(int k = 0; k <=3; k++) {
			for(int f = 1; f <=4; f++) {
				System.out.println("Good Morning");
				continue;  
			}
			System.out.println("Hello");

		}

	}

}
