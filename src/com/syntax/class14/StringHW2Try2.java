package com.syntax.class14;

import java.util.Scanner;

public class StringHW2Try2 {

	String checkPass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your username:");
		String username = sc.nextLine();
		System.out.println("Please enter your password:");
		String password = sc.nextLine();

		String reponse;

		if (username.isEmpty() || password.isEmpty()) {
			return reponse = "Username and password cannot be empty";
		} else {
			if (password.length() >= 8) {
				if (password.contains(username)) {
					reponse = "Password cannot contain username";
				} else {
					System.out.println("Please re-enter your password:");
					String confirmedPassword = sc.nextLine();
					if (confirmedPassword.contains(password)) {
						reponse = "Your username and password has been created";
					} else {
						reponse = "Your confirmed password does not match";
					}
				}

			} else {
				reponse = "Password is too short";
			}
		}
		return reponse;

	}

	public static void main(String[] args) {
		StringHW2Try2 obj = new StringHW2Try2();
		System.out.println(obj.checkPass());

	}

}
