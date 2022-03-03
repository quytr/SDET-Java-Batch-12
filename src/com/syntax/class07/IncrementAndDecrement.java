package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		int num = 10;

		num = num + 1;  //11
		
		num += 1;  //12
		
		num ++;  //13
		
		System.out.println(num);  //13
		
		//increment operator add 1 to a VARIABLE
		
		num ++;
		System.out.println(num);
		
		//10++; CE: Invalid argument to operation ++/--
		
		//decrement operator subtract 1 from a variable
		
		num--;
		num--;
		num--;
		System.out.println(num);

	}

}
