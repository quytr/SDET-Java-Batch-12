package com.syntax.class07;

public class WhileLoopTask1 {

	public static void main(String[] args) {
		
		/*
		 * TASK 1
		 * PRINT ONLY EVEN NUMBERS FROM 1 TO 30
		 */
		
		// Option 1:
		int x = 2;
		while(x <=30) {
			System.out.print(x + " ");
			x+=2;
		}
		
		System.out.println("");
		System.out.println("------------------");
		
		// Option 2:
		int y = 1;
		while(y<=30) {
			if(y%2==0) {
				System.out.print(y + " ");
			}
			y++;
		}

	}

}
