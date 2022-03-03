package com.syntax.reviewclass03;

public class IfElseDemo1 {

	public static void main(String[] args) {

		String userName = "Quy";
		String password = "pass124";
		if (userName.equals("Quy") && password.equals("pass123")) {
			System.out.println("Welcome back, " + userName);
		} else {
			System.out.println("Username or password is invalid");
		}

	}

}
