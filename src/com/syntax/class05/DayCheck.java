package com.syntax.class05;

import java.util.Scanner;

public class DayCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 1-7:");
		
		int num = sc.nextInt();
		
		if(num >= 1 && num <=5) {
			System.out.println("It's a weekday");
		}else if(num == 6 || num == 7) {
			System.out.println("It's a weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
