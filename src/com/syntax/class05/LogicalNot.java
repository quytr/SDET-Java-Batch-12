package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		// Logical not is used to revert the condition
		
		boolean value =! false;   // have to put = first then ! on boolean data type
		System.out.println(value);
		
		boolean traffic =! true;
		
		if(!traffic) {  //logical NOT ! first before variable name
			System.out.println("I will come on time to work");
		}
		
		System.out.println("------------------------------");
		
		String day = "Monday";
		if(!day.equals("Saturday")) { //if day is NOT saturday
			System.out.println("Today is not Saturday");
		}
		
		System.out.println("----------------------------------");
		
		boolean checkBoxChecked = false;
		
		if(!checkBoxChecked) {
			System.out.println("I will click on that checkbox");
		}
		
		System.out.println("----------------------");
		
		String java = "hard";
		
		if(!java.equals("hard")) {  // ! reverse the condition
			System.out.println("You are genius");
		}
		
		System.out.println("--------- THE END ----------");

	}

}
