package com.syntax.class04;

import java.util.Scanner;

public class MoreExample {

	public static void main(String[] args) {

		Scanner inBox = new Scanner(System.in);

		System.out.println("Please enter your full name:");

		// if you need to capture more than 1 word -> use nextLine();	
		String fullName = inBox.nextLine();

		System.out.println("My fullname is " + fullName);

	}

}
