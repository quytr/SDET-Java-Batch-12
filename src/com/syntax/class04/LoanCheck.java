package com.syntax.class04;

import java.util.Scanner;

public class LoanCheck {

	public static void main(String[] args) {
		Scanner bank = new Scanner(System.in);

		System.out.println("How much loan would you like to borrow?");

		int loanMoney = bank.nextInt();

		if (loanMoney <= 200000) {
			System.out.println("You are qualified for a $" + loanMoney + " loan.");
		} else {
			System.out.println("Sorry! You can NOT get approved for your $" + loanMoney + " loan.");
		}

	}

}
