package com.syntax.class10;

public class TwoDArrayInClassTask1 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array (longer way)where you will store the following values: Mr,
		 * Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama. After storing values print
		 * following String: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */

		String[][] names = new String[2][4];

		names[0][0] = "Mr";
		names[0][1] = "Mrs";
		names[0][2] = "Ms";
		names[0][3] = "Miss";

		names[1][0] = "Smith";
		names[1][1] = "Jordan";
		names[1][2] = "Jackson";
		names[1][3] = "Obama";

		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);
		
		System.out.println("--------------------------");

		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names
		 * and second array will contain grades. Then your program should print name of
		 * the students that has A and B grade
		 */
		
		String[][] students = {
				
				{"Quy", "Sophie", "Tom", "Scott"},
				
				{"A", "B", "C", "D"}
		};
		
		System.out.println(students[0][0] + " has " + students[1][2] + " grade");
		System.out.println(students[0][1] + " has " + students[1][3] + " grade");
		System.out.println(students[0][2] + " has " + students[1][0] + " grade");
		System.out.println(students[0][3] + " has " + students[1][1] + " grade");


	}

}
