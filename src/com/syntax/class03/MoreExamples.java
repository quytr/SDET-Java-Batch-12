package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		/*
		 * we need to declare a boolean variable hungry yes or no
		 * 
		 * if we are hungry --> I am going to eat otherwise --> I am going to drink a
		 * tea
		 */

		boolean hungry = false;

		if (hungry == true) {
			System.out.println("I am going to eat!!!");
		} else {
			System.out.println("I am going to drink a tea!");
		}

		boolean traffic = true;
		if (traffic) {
			System.out.println("I am coming home late");
		}

		/*
		 * define a variable to store a browser
		 * 
		 * if browser is chrome --> we are executing on chrome otherwise --> browser is
		 * not supported for our test
		 */

		String browser = "Chrome";

		// Best way to compare the string value by using .equals()
		// Always use .equals to compare 2 strings
		if (browser.equals("chrome")) {
			System.out.println("We are executing tests on chrome");
		} else {
			System.out.println("We are not executing any test case");
		}

//		or 
//		would work in this example but not preferable 
//		if(browser=="chrome") {
//			System.out.println("We are executing tests on chrome");
//		}else {
//			System.out.println("We are not executing any test case");
//		}

	}

}
