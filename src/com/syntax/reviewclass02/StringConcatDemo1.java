package com.syntax.reviewclass02;

public class StringConcatDemo1 {

	public static void main(String[] args) {

		String name = "10";
		int num1 = 10;
		char letter1 = 'A';

		System.out.println(letter1 + num1 + name); // A = 65, 65+10 = 70
		System.out.println(letter1 + name + num1); // A = A because name is String
		System.out.println(10 + 10 + "10");
		System.out.println(10 + "10" + 10);
		System.out.println(10 + "10" + 10 + 10);
	}

}
