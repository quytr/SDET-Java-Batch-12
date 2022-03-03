package com.syntax.class15;

public class StringDemo3 {
	public static void main(String[] args) {
		String name = "How Are @you @guys @";

		// java always give index of the first letter appears
		System.out.println(name.indexOf("@"));

		// find the next index, starting from the position after the 1st index letter
		// 9 is starting position
		System.out.println(name.indexOf("@", 8 + 1));
		// +1 is to skip the 1st index letter
		System.out.println(name.indexOf("@", name.indexOf("@") + 1));
		
		// to find the index of the last letter appears
		System.out.println(name.lastIndexOf("@"));
		
		
	}

}
