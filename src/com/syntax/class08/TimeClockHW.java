package com.syntax.class08;

public class TimeClockHW {

	public static void main(String[] args) {
		
		// 12 hours Time Clock

		for (int h = 1; h <= 12; h++) {
			
			for (int m = 0; m <= 59; m++) {

				for (int s = 0; s <= 59; s++) {

					System.out.println(h + ":" + m + ":" + s);
				}
			}
		}

	}

}
