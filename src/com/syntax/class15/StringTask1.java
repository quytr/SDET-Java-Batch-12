package com.syntax.class15;

import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby:
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the mom's first name:");
		String momName = sc.next();
		System.out.println("Please enter the dad's first name:");
		String dadName = sc.next();
		System.out.println("Boy or Girl");
		String gender = sc.next();

		if ("boy".equalsIgnoreCase(gender)) {
			String boyName = dadName.substring(0, dadName.length() / 2) + momName.substring(momName.length() / 2);
			System.out.println(boyName.toUpperCase());
		} else if ("girl".equalsIgnoreCase(gender)) {
			String girlName = momName.substring(0, momName.length() / 2) + dadName.substring(dadName.length() / 2);
			System.out.println(girlName.toUpperCase());

		} else {
			System.out.println("unknow gender");
		}

	}

}
