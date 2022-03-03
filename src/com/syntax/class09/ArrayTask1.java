package com.syntax.class09;

public class ArrayTask1 {

	public static void main(String[] args) {
		/* Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 */
		
		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades [5] = 'F';
		System.out.println(grades[1]);
		
		char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grade[1]);
		
		System.out.println("--------------------------");
		/* Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 */
		
		String[] names = new String[5];
		names[0] = "Quy";
		names[1] = "Christian";
		names[2] = "Joey";
		names[3] = "Clarance";
		names[4] = "Andrew";
		System.out.println(names[0]);
		
		String[] name = {"Andrew", "Joey", "Quy", "Clarance", "Christian"};
		System.out.println(name[2]);
		
		System.out.println("--------------------------");
		/*Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		String[] words = new String[5];
		words[0] = "Java";
		words[1] = "Saturday";
		words[2] = "Day";
		words[3] = "coding";
		words[4] = "is";
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		
		String[] word = {"Java", "Saturday", "Day", "coding", "is"};
		System.out.println(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);
		
		

	}

}
