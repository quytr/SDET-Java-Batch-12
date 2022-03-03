package com.syntax.class09;

public class TimeClockHWSolution {

	public static void main(String[] args) {

		// 12 hours Time Clock

		String time;

		for (int h = 1; h <= 12; h++) {

			for (int m = 0; m <= 59; m++) {

				for (int s = 0; s <= 59; s++) {

					String hour = String.format("%02d", h);
					String minute = String.format("%02d", m);
					String second = String.format("%02d", s);

					System.out.println(hour + ":" + minute + ":" + second);
				}
			}
		}

		System.out.println(" --------- Clock ----------");

		for (int a = 0; a <= 2; a++) {

			for (int b = 0; b <= 9; b++) {

				if (a == 2 && b == 4) {
					break;
				}

				for (int c = 0; c <= 5; c++) {

					for (int d = 0; d <= 9; d++) {
						System.out.println(" " + a + b + ":" + c + d);
					}
				}
			}
		}

		System.out.println(" --------- Clock ----------");

		for (int a = 0; a <= 2; a++) {

			for (int b = 0; b <= 9; b++) {

				if (a == 2 && b == 4) {
					break;
				}

				for (int c = 0; c <= 5; c++) {

					for (int d = 0; d <= 9; d++) {
						System.out.println(" " + a + b + ":" + c + d);
					}
				}

			}
		}
	}
}
