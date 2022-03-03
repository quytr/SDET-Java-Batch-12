package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
		String name = "Sophie";  // Always use this one its shorter
		String name2 = new String("TAE in all uppercase ");
		
		System.out.println(name);
		System.out.println(name2);
		
		System.out.println(name.toString());
		
		System.out.println(name.length());
		System.out.println(name2.length());
		
		String newName = name2.toLowerCase();
		System.out.println(newName);
		System.out.println(name2.toLowerCase());
		
		String anotherNewName =name2.toUpperCase();
		System.out.println(anotherNewName);
		System.out.println(name2.toUpperCase());
		
		System.out.println(name+name2);  // you should always prefer this method to perform concatenation
		System.out.println(name.concat(name2));
		
		System.out.println(name.isEmpty());
		name = "    ";
		System.out.println(name.isEmpty());
	}

}
