package com.syntax.class06;

import java.util.Scanner;

public class GradeHomework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your grade:");
		
		char grade = sc.next().charAt(0);
		
		String gradeExp;
		
		switch (grade) {
		case 'A':
			gradeExp = "Excellent";
			break;
		case 'B':
			gradeExp = "Good";
			break;
		case 'C':
			gradeExp = "Average";
			break;
		case 'D':
			gradeExp = "Bad";
			break;
		default:
			gradeExp = "Not Acceptable";
			break;
			
		}
		
		System.out.println("Your grade is " + grade + " - " + gradeExp);

	}

}
