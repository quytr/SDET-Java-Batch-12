package com.syntax.reviewclass03;

public class IfElseDemo5 {

	public static void main(String[] args) {

		int price = 10;
		boolean sale = true;
		char gender = 'F';
		double discount = 0.15;
		double finalPrice = 0;
		
		// Option 1: using nested if
		if (sale) {

			if (gender == 'F') {
				if (price > 5) {
					finalPrice = price - finalPrice * discount;
				}
			}
		} else {
			finalPrice = price;
		}
		System.out.println(finalPrice);
		
		// Option 2: Easier and shorter way when using logical operators
		if(sale && gender == 'F' && price >5) {
			finalPrice = price - finalPrice * discount;

		}else {
			finalPrice = price;
		}
		System.out.println(finalPrice);

	}

}
