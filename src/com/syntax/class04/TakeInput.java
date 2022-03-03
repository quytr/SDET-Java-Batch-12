package com.syntax.class04;

import java.util.Scanner; //to auto import: ctrl+shift+o

public class TakeInput {

	public static void main(String[] args) {
		// 1. create a Scanner and assign to a variable

		Scanner box = new Scanner(System.in);

		// 2. specify instructions
		System.out.println("Please enter country where you're from:");

		// 3. we need to capture String value -> use next();
		String country = box.next();
		System.out.println("You are from " + country +".");
		
		// if you're from USA -> you speak English
		//     if you're from Vietnam -> you speak Viet
		//use IgnoreCase will ignore the case sensitive, so you can use upper case or lower case
		if(country.equalsIgnoreCase("USA")) {
			System.out.println("You speak English.");
		}else if(country.equalsIgnoreCase("Vietnam")) {
			System.out.println("You speak Vietnamese.");
		}else if(country.equalsIgnoreCase("Turkey")) {
			System.out.println("You speak Turkish.");
		}else {
			System.out.println("Sorry! I dont know what language you speak...");
		}
		

	}

}
