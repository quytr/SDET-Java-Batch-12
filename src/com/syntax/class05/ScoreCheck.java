package com.syntax.class05;

import java.util.Scanner;

public class ScoreCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your quiz score:");
		int score1 = sc.nextInt();

		System.out.println("Please enter your midterm score:");
		int score2 = sc.nextInt();

		System.out.println("Please enter your final score:");
		int score3 = sc.nextInt();

		int aveScore = (score1 + score2 + score3) / 3;

		if (aveScore >= 90) {
			System.out.println("Awesome! You got an A");

		} else if (aveScore >= 70 && aveScore < 90) {
			System.out.println("Good job! You got an B");

		} else if (aveScore >= 50 && aveScore < 70) {
			System.out.println("Study harder! You got an C");

		} else if (aveScore < 50) {
			System.out.println("You failed! You got an F");
		}

	}

}
