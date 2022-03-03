package com.syntax.reviewclass02;

public class ShortHandOperatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		
		// increment the value by 1 first, then print out the updated value on the same line
		System.out.println(++number);
		
		// print out the actual value first, then increment the value by 1, the updated value will use for the next line
		System.out.println(number++);
		
		// the actual value is already increased by 1
		System.out.println(number);
		
		int num = 10;
		
		// ++number = 11 and updated the value for line 22
		// number++ is using the updated value (++number = 11) and added 1 (number++ = 12)
		// but the value of number++ will remain as 11 
		// because the updated value will not get use until the next line
		System.out.println(++number+number++); // (11 + 11 = 22)
		
		System.out.println(number); // 12 
		
		

	}

}
