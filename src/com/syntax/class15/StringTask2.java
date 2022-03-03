package com.syntax.class15;

public class StringTask2 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: 
		 * if the String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
		
		String name = "heLlo";
		if(name.length()%2!=0 && name.length()>=3) {
			System.out.println(name.charAt(name.length()/2));
		}else {
			System.out.println("not what I wanna print");
		}

		
	}

}
