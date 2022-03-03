package com.replit.hw;

import java.util.Scanner;

public class SwitchStatement040 {

	public static void main(String[] args) {
		/*
		 * By using the switch statement concept please validate what is the
		 * responsibility each instructor in the syntax solution.
		 * 
		 * First Output: "Enter name of the instructor" First Output:
		 * "Enter name of the instructor" case 1: if User provided the name as Asghar as
		 * input it should show "Will take care of Java Assignment" case 1: if User
		 * provided the name as Asghar as input it should show
		 * "Will take care of Java Assignment" case 2: if User provided the name as
		 * Moazzam as input it should show "Will take care of SDLC Assignment" case 2:
		 * if User provided the name as Moazzam as input it should show
		 * "Will take care of SDLC Assignment" case 3: if User provided the name as
		 * Weqas as input it should show "Will take care of Selenium Assignment" case 3:
		 * if User provided the name as Weqas as input it should show
		 * "Will take care of Selenium Assignment" case 4: if User provided the name as
		 * Asel as input it should show "Will take care of every Assignment" copied!
		 * case 4: if User provided the name as Asel as input it should show
		 * "Will take care of every Assignment" Other than these four names if the user
		 * provides any other names --> " Invalid instructor selected"
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of the instructor");
		String name = sc.nextLine();

		String clss = null;

		switch (name) {
		case "Asghar":
			clss = "Java Assignment";
			break;

		case "Moazzam":
			clss = "SDLC Assignment";
			break;

		case "Weqas":
			clss = "Selenium Assignment";
			break;

		case "Asel":
			clss = "every Assignment";
			break;

		default:
			System.out.println("Invalid instructor selected");
			break;

		}

		System.out.println("Will take care of " + clss);

	}

}
