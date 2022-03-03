package com.syntax.class05;

import java.util.Scanner;

public class HeightCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches:");
		
		int height = sc.nextInt();
		
		if(height < 60) {
			System.out.println("You are short!");
		}else if(height > 60 && height < 72) {
			System.out.println("You are medium");
		}else if(height > 72) {
			System.out.println("You are tall");
		}

	}

}
