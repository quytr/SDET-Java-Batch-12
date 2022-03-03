package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String name = "          Luffy       "; 
		System.out.println(name);
		System.out.println(name.trim());
		
		
		String name2 = "Run Luffy"; 
		System.out.println(name2.toLowerCase().startsWith("run"));  //calling multiple method -> method chaining
		System.out.println(name2.startsWith("Luffy"));
		
		System.out.println(name2.endsWith("Luffy"));
		System.out.println(name2.endsWith("Run"));
		System.out.println(name2.endsWith("y"));
		
		
		System.out.println(name2.contains("u"));
		System.out.println(name2.toLowerCase().contains("L"));
		System.out.println(name2.contains(" "));

	}

}
