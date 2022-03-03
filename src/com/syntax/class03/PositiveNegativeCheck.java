package com.syntax.class03;

public class PositiveNegativeCheck {

	public static void main(String[] args) {

		int numb = -12;

		if (numb > 0) {
			System.out.println("This number " + numb + " is positive!");
		} else if (numb < 0) {
			System.out.println("This number " + numb + " is negative!");
		} else {
			System.out.println(numb + " is special number!");
		}

	}

}
