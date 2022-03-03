package com.syntax.class05;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your quiz score:");
		int score1 = sc.nextInt();

		System.out.println("Please enter your midterm score:");
		int score2 = sc.nextInt();

		System.out.println("Please enter your final score:");
		int score3 = sc.nextInt();

		int aveScore = (score1 + score2 + score3) / 3;
		
		char grade;

		if (aveScore >= 90) {
			grade = 'A';

		} else if (aveScore >= 70 && aveScore < 90) {
			grade = 'B';

		} else if (aveScore >= 50 && aveScore < 70) {
			grade = 'C';

		} else {
			grade = 'F';
		}
		
		System.out.println("Your grade is " + grade);
		
		// If your grade is A or B -> you are a good student
		// otherwise -> you should study more
		
		if(grade == 'A' || grade == 'B') {
			System.out.println("You are a great student");
		}else {
			System.out.println("You should study more");
		}

	}

}
