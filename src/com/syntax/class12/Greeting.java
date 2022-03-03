package com.syntax.class12;

public class Greeting {
	
	void sayHello(String name) {
		System.out.println("Hello " + name);
		
	}
	
	void sayHelloManyTimes(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello " + name);
		}
	}
	
	void sayHello(String name, int numb) {
		for(int i =0; i < numb; i++) {
			System.out.println("Hello " + name);
		}
	}

	public static void main(String[] args) {
		
		Greeting greeter = new Greeting();
//		greeter.sayHello("Tim");
		greeter.sayHelloManyTimes("Tom");
		
		greeter.sayHello("Matt", 4);

	}

}
