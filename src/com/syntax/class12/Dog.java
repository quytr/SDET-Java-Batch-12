package com.syntax.class12;

import java.util.Scanner;

public class Dog {

	// define attributes/ fields/ properties/ variables (how it looks like)
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;

	// behaviors/ functions/ methods (performs an action)
	void bark() {
		System.out.println(name + " is barking...");
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}

	public static void main(String[] args) {

		// creating an object scooby from class dog

		Dog scooby = new Dog();
		// new keyword when we call an object from class
		// Dog is a class
		// scooby is an object, created from class
		// = is an assignment operator (whatever we write on the right will store on the
		// left)
		// new is keyword that we use to create the objects of a class
		// Dog() we are calling the constructor of the class

		//// accessing the property name on object scooby and setting its value
		scooby.name = "scooby";

//		Scanner scan = new Scanner(System.in);
		scooby.bark();
		scooby.eat();
		scooby.sleep();

		/*
		 *  Create a Dog Class and create 3 different
		 * objects of it: Husky, Bulldog, Labrador with specific attributes and
		 * behaviors.
		 */
		System.out.println("----------------");
		
		Dog husky = new Dog();
		husky.name = "Kido";
		husky.color = "white";
		husky.breed = "husky";
		husky.gender = 'M';
		husky.age = 5;
		husky.weight = 100;
		
		husky.bark();
		husky.eat();
		husky.sleep();
		
		System.out.println("-----------");
		
		Dog bullDog = new Dog();
		bullDog.name = "Luna";
		bullDog.color = "black";
		bullDog.breed = "bulldog";
		bullDog.gender = 'F';
		bullDog.age = 3;
		bullDog.weight = 80;
		
		bullDog.bark();
		bullDog.eat();
		bullDog.sleep();
		
		System.out.println("-----------");
		
		Dog labrador = new Dog();
		labrador.name = "Riddle";
		labrador.color = "brown";
		labrador.breed = "labrador";
		labrador.gender = 'M';
		labrador.age = 6;
		labrador.weight = 120;
		
		labrador.bark();
		labrador.eat();
		labrador.sleep();
		
		
		

	}

}
