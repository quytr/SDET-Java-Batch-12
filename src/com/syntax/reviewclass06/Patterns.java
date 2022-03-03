package com.syntax.reviewclass06;

public class Patterns {

	public static void main(String[] args) {
		
		for(int r =1; r<=4; r++) {
			for(int c =1; c<=5; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		for(int r=1; r<=4; r++) {
			for(int c=1; c<=5;c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		for(int r=1; r<=4; r++) {
			for(int c=1; c<=5;c++) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int r =5; r >=1; r--) {
			for(int c =1; c<=4;c++) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		for(int r = 1; r <= 4; r++) {
			for(int c = 1; c <=5; c++) {
				
				if(r==1 || r ==4 || c==1 || c ==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
			
		}
		
		System.out.println("---------------");
		for(int c = 1; c <=5; c++) {
			for(int r = 1; r <=c; r++) {
				System.out.print(c+ " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
//		for (int a = 1; a < 2; a++) {
			for (int b = 1; b < 10; b++) {
				for (int c = 0; c < 9; c++) {
					System.out.print((1 + c) + " X " + b + " = " + (1 + c) * b + "\t");
				}
				System.out.println();
			}
//		}

	}

}
