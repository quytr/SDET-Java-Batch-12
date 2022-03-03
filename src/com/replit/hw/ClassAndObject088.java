package com.replit.hw;

public class ClassAndObject088 {

	/*
	 * In this class, you should specify the following attributes: breed, name,
	 * color, and following behaviors: bark(), run(), play().
	 * 
	 * Create 3 different objects of it: Husky, Bulldog, Labrador with specific
	 * attributes and behaviors.
	 */
	
	String breed;
	String name;
	String color;
	
	void bark() {
		System.out.println(breed + " can bark");
	}
	void run() {
		System.out.println(breed + " can run");
	}
	void play() {
		System.out.println(breed + " can play");
	}

	public static void main(String[] args) {
		
		ClassAndObject088 dog1 = new ClassAndObject088();
		dog1.name="Tony";
		dog1.breed="Husky";
		dog1.color="black";
		dog1.bark();
		dog1.run();
		dog1.play();
		
		ClassAndObject088 dog2 = new ClassAndObject088();
		dog2.name="Kido";
		dog2.breed="Bulldog";
		dog2.color="white";
		dog2.bark();
		dog2.run();
		dog2.play();
		
		ClassAndObject088 dog3 = new ClassAndObject088();
		dog3.name="Riddle";
		dog3.breed="Labrador";
		dog3.color="brown";
		dog3.bark();
		dog3.run();
		dog3.play();
		


	}

}
