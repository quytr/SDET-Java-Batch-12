package com.syntax.class08;

public class CarMileageLoop {

	public static void main(String[] args) {
		System.out.println("------ Car Mileage ----");

		int a = 0;
		int b = 0;
		int c = 0;
		for (a = 0; a <= 2; a++) {
			if (a == 0 && b == 2 && c == 5) {
				break;
		}

			for (b = 0; b <= 9; b++) {
				if (a == 0 && b == 2) {
					break;
			}

				for (c = 0; c <= 9; c++) {
					
					System.out.println(a + " " + b + " " + c);

					if (a == 0 && b == 2 && c == 5) {
						break;
					}

				}
			}

		}

	}

}
