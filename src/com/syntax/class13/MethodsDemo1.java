package com.syntax.class13;

public class MethodsDemo1 {
	
	// void is a type of method that dont return anything when called
	//checkEvenOdd is the name of the method
	//() we use to pass information from outside
	//int number this is parameter tjay we can pass to this method when called
	//we can use this variable inside the logic of method
	void checkEvenOdd(int number) {
		if(number%2 ==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	void checkWeather(boolean isRaining) {
		if(isRaining) {
			System.out.println("I am staying home");
		}else {
			System.out.println("Let's go for a walk");
		}
	}
	
	void checkName(String name) {
		if("Teyfur".equalsIgnoreCase(name)) {
			System.out.println("Send more memes");
		}else {
			System.out.println("Let's focus on the class");
		}
	}

	public static void main(String[] args) {
		
		MethodsDemo1 obj = new MethodsDemo1();
		obj.checkEvenOdd(120);
		obj.checkEvenOdd(3);
		obj.checkEvenOdd(7);
		
		obj.checkWeather(false);
		
		obj.checkName("Dave");
		obj.checkName("Teyfur");

	}

}
