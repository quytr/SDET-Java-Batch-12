package com.syntax.reviewclass06;

public class World {

	public static void main(String[] args) {

		Human human1 = new Human();
		human1.name = "John";
		human1.lastName = "Doe";
		human1.eyesColor = "blue";
		human1.hairColor = "grey";
		human1.age = 33;
		human1.gender = 'm';
//		human1.hands =2; .hands was not declared in Human class
		
		human1.run();
		human1.sleep();
		human1.run();
		
//		human1.tired(); tired method was not defined in Human class

	}

}
