package com.syntax.class06;

import java.util.Scanner;

public class SaleHomework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Is it a sale day at the mall? yes or no");

		String answer = sc.nextLine();

		switch (answer) {
		case "no":
			System.out.println("You are NOT going for shopping :(");
			break;
		case "yes":
			System.out.println("Please enter the item's price:");
			double price = sc.nextDouble();
			double percent;

			if (price < 20) {
				percent = 0.1;
			} else if (price >= 20 && price <= 100) {
				percent = 0.2;
			} else if (price > 100 && price < 500) {
				percent = 0.3;
			} else {
				percent = 0.5;
			}

			double discount = price * percent;
			double priceAfterDiscount = price - discount;

			System.out.println("After the discount $" + discount + " the price of the item reduce from $" + price
					+ " to $" + priceAfterDiscount);
			break;
		default:
			System.out.println("Please enter a valid answer!");
			break;
		}

//		if (answer.equalsIgnoreCase("no")) {
//			System.out.println("You are not going for shopping :(");
//
//		} else if (answer.equalsIgnoreCase("yes")) {
//			System.out.println("Please enter the item's price:");
//			double price = sc.nextDouble();
//			double discount;
//
//			if (price < 20) {
//				discount = price * 0.1;
//			} else if (price >= 20 && price <= 100) {
//				discount = price * 0.2;
//			} else if (price > 100 && price < 500) {
//				discount = price * 0.3;
//			} else {
//				discount = price * 0.5;
//			}
//
//			System.out.println("After the discount $" + discount + " the price of the item reduce from " + price
//					+ " to " + (price - discount));
//
//		} else {
//			System.out.println("Please enter a valid answer!");
//		}

	}

}
