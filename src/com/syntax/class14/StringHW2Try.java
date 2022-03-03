package com.syntax.class14;

import java.util.Scanner;

public class StringHW2Try {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your username:");
		String username = sc.nextLine();
		System.out.println("Please enter your password:");
		String password = sc.nextLine();
		System.out.println("Please re-enter your password:");
		String confirmedPassword = sc.nextLine();

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		} else if (password.length() < 8) {
			System.out.println("Password is too short");
		}else if(password.contains(username)) {
			System.out.println("Password cannot contain username");
		}else if(!confirmedPassword.contains(password)) {
			System.out.println("Your confirmed password does not match");
		}else {
			System.out.println("Your username and password has been created");
		}
		
	}

}
