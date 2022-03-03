package com.syntax.class15;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String name = "How are you guys @";
		
//		System.out.println(name.charAt(3));
		
		for(int i=0; i<name.length();i++) {
			if(i == name.length() -1) {
				System.out.println(name.charAt(i));
			}else {
				System.out.print(name.charAt(i) + "_");

			}
		}

	}

}
