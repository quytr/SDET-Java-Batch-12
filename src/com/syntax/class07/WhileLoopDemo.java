package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("The value of i outside of while loop = " + i);
		
		// I need to print values from 2 to 20 
		
		int x =2;
		
		while(x <= 20) {
			System.out.println(x);
			x++;
		}
		
		System.out.println(x);
		
		// I need to print values from 1 to 50 in 1 line
		
		int y = 1;
		
		while(y <= 50) {
			System.out.print(y + " ");
			y++;
		}
		
		// I need to print numbers from 20 to 1
		
		int a = 20;
		
		while(a >= 1) {
			System.out.print(a + " ");
			a--;
		}
		
		System.out.println("The End");
		

	}

}
