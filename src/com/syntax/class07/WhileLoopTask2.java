package com.syntax.class07;

public class WhileLoopTask2 {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space
		int a = 1;
		while(a <= 100) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println("");
		
		// Print numbers from 100 to 1

		int b = 100;
		while(b >= 1) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println("");
		
		// Print even numbers from 20 to 100 
		// Option 1:
		int c = 20;
		while(c <= 100) {
			System.out.print(c + " ");
			c+=2;
		}
		System.out.println(" ");
		// Option 2:
		int d = 20;
		while(d <=100) {
			if(d%2 == 0) {
				System.out.print(d + " ");
			}
			d++;
		}
		System.out.println("");
		
		//Print only odd numbers from 100 to 1
		//Option 1:
		int e = 1;
		while(e <= 100) {
			System.out.print(e + " ");
			e+=2;
		}
		System.out.println("");
		//Option 2:
		int f = 1;
		while(f<=100) {
			if(f%2 != 0) {
				System.out.print(f + " ");
			}
			f++;
			
		}
		

	}

}
