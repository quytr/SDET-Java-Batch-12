package com.syntax.class13;

public class MethodsHW4 {

	/*
	 * Create a method createEmail(). Based on values of users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * createEmail(John, Snow, gmail) → johnsnow@gmail.com or
	 */

	String createEmail(String userName, String lastName, String emailType) {
		return userName.toLowerCase() + lastName.toLowerCase() + "@" + emailType + ".com";
	}

	public static void main(String[] args) {

		MethodsHW4 obj = new MethodsHW4();

		System.out.println(obj.createEmail("John", "Asper", "yahoo"));

		System.out.println(obj.createEmail("Matt", "Davis", "gmail"));

		System.out.println(obj.createEmail("Tim", "Kain", "hotmail"));

	}

}
