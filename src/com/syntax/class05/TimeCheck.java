package com.syntax.class05;

import java.util.Scanner;

public class TimeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your current hour (24 hours format):");
		
		int time = sc.nextInt();
		
		if(time >= 1 && time <= 11) {
			System.out.println("Good Morning");
		}else if(time>=12 && time<=15) {
			System.out.println("Good Afternoon");
		}else if(time >= 16 && time <= 20) {
			System.out.println("Good Evening");
		}else if(time >= 21 && time <= 24) {
			System.out.println("Good night");
		}

	}

}
