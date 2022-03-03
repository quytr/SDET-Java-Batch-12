package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day = "Saturday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class");
			
		}
		
		System.out.println("Code outside of if statement");
		
		/* let's ask user what is today day
		 * 
		 * based on the day lets define which class we have
		 * 
		 * if(monday or friday) --> no class today
		 * else if (tuesday or wednesday) --> manual
		 * else if(thursday) --> review class
		 * else if (sat or sun) --> java class
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is today day?");
		String today = sc.nextLine();
		
		if ( today.equalsIgnoreCase("Monday") || today.equalsIgnoreCase("Friday")) {
			System.out.println("No class today");
		}else if (today.equalsIgnoreCase("Tuesday") || today.equalsIgnoreCase("Wednesday")) {
			System.out.println("Manual Test Class");
		}else if(today.equalsIgnoreCase("Thursday")) {
			System.out.println("Review Class");
		}else if(today.equalsIgnoreCase("Saturday") || today.equalsIgnoreCase("Sunday")) {
			System.out.println("Java Class");
		}
				
		
	}

}
