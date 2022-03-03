package com.syntax.class13;

public class MethodsDemo3 {
	
	// int we specify the datatype that method will return
	//squareTheNumber name of the method
	//(int number) parameters of the method
	//return tell java what to return from this method
	int squareTheNumber(int number) {
		return number * number;
	}
	
	int returnTheSameNumber(int number) {
		return number;
	}
	
	/*
	 * create a method that takes a person name and an animal name
	 * if person name is "Teyfur" and if animal is "Horse" it returns us "camel"
	 * 
	 */
	
	String checkName(String personName, String animalName) {
		if("Teyfur".equalsIgnoreCase(personName) && "Horse".equalsIgnoreCase(animalName)) {
			return "camel";
		}else {
			return "Idk";
		}
	}

	public static void main(String[] args) {
		MethodsDemo3 obj = new MethodsDemo3();
		
		int result = obj.squareTheNumber(5);
		System.out.println(result);
		
		int result2 = obj.returnTheSameNumber(5);
		System.out.println(result2);
		
		String result3 = obj.checkName("Teyfur", "Horse");
		System.out.println(result3);
		String result4 = obj.checkName("Tim", "cat");
		System.out.println(result4);
		
	
		

	}

}
