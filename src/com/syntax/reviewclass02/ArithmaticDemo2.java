package com.syntax.reviewclass02;

public class ArithmaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 3;

		double num3 = 10;
		double num4 = 3;

		float num5 = 10f;
		float num6 = 3f;

		System.out.println(num1 / num2);
		System.out.println(num3 / num4);
		System.out.println(num5 / num6);
		
		float f = 5.3f;
		if(f == 5.3) {
			System.out.println("Magic");
		}else {
			System.out.println("Simple math");
		}
		
		// for whole numbers always use int data type
		// for decimal numbers always use double date type
		
		System.out.println(num1%num2);
		System.out.println(num2%num1);
	

	}

}
