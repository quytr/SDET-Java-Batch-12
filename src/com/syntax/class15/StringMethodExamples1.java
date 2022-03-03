package com.syntax.class15;

public class StringMethodExamples1 {

	public static void main(String[] args) {
		
		String s = "Mohammad Mohammad";
		
		if(s.length() <=12) {
			// less than or equal to 12 characters in his/her name
			System.out.println("Username is created");
		}else {
			// this much long name is not allowed
			System.out.println("This much long name is not allowed");
		}
		
		String a = "      Quy ";
		String b = "      Truong            ";
		System.out.println(a.concat(b));
		System.out.println(a.trim());
		System.out.println(b.trim());
		
		

	}

}
