package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean likeJava = false;
		boolean practice = true;
		boolean understandJava = true;
		
		if(likeJava && understandJava && practice) {
			System.out.println("Awesome! This is best combination");
		}
		
		System.out.println("End of the code");
		
		/* We want to compare 3 numbers
		 * 
		 * if      num1 > num2 && num1 > num3 --> num1 is the largest
		 * what if num2 > num1 && num2 > num3 --> num2 is the largest
		 * what if num3 > num1 && num3 > num2 --> num3 is the largest
		 */
		
		int num1 = 20;
		int num2 = 40;
		int num3 = 30;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is the largest");
		}
	}

}
