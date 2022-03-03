package com.syntax.class03;

public class PrimitiveCasting {
	
	// main+ctrl+space
	//ctrl+space --> auto-complete
	
	public static void main(String[] args) {
		
		int i = 10;
		
		// widening or implicit or automatic
		// we store int value 10 inside double variable
		double d = 10;
		
		System.out.println(i); //10
		System.out.println(d); //10.0
		
		//int num = 10.0; // Type mismatch: cannot convert from double to int
		
		// narrowing or explicit casting or manual
		// we store double value 10.99 into int variable
		int num = (int) 10.99;
		System.out.println(num);
		
		// By default, decimal is as double
		float f = 10.99f; // Type mismatch: cannot convert from double to float
		
		byte b = (byte)1000;	
		System.out.println(b); // -128
		
		long number = 12343454353543l;
		System.out.println(number);
		
		//narrowing
		int numb = (int)12343454353543l;
		System.out.println(numb);
		
		
		
	}

}
