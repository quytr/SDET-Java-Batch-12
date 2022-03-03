package com.syntax.class13;

public class MethodsHW3 {

	// Create a method that will say Hello in different language based on the
	// country that will passed when method is executed.

	String sayHello(String country) {
		if ("USA".equalsIgnoreCase(country)) {  // can also use a switch case
			return "Hello";
		} else if ("France".equalsIgnoreCase(country)) {
			return "Bonjour";
		} else if ("Vietnam".equalsIgnoreCase(country)) {
			return "Xin chao";
		} else if ("Thailand".equalsIgnoreCase(country)) {
			return "Swasdi";
		} else if ("Japan".equalsIgnoreCase(country)) {
			return "Kon'nichiwa";
		} else {
			return "I don't know";
		}
	}

	public static void main(String[] args) {
		MethodsHW3 obj = new MethodsHW3();
		System.out.println(obj.sayHello("japan"));
		System.out.println(obj.sayHello("thailand"));
		System.out.println(obj.sayHello("vietnam"));
		System.out.println(obj.sayHello("spain"));

	}

}
