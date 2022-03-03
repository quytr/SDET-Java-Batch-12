package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
		/* create a variable and assign value
		 * or
		 * declare a variable and initialize (same)
		 */
		// 1:
		int age = 25;
		
		// 2:
		int num; // declare variable
		num= 10; // initialize it
		num =100; //reassign the value
		
		int n1, n2, n3; // all 3 variables are on the int type
		
		n1 = 10;
		n2 = 20;
		n3 = 30;
		
		//ctrl + d --> will remove entire line
		
		// reassigning the value of variable age
		age = 26;
		
		// age = 28.5; ERROR: age variable can hold only int value
		System.out.println(age); //26
		
		// Java Rules for identifiers:
		// boolean break = false; ERROR: do not use keyword as identifier (name)
		
//		char 1character = 'A'; ERROR: do not start identifier with numbers or special characters
		
		//double %value = 12.99; ERROR: do not start identifier with %
		
		// Java allows to use _ or $ as identifier
		double $price = 1.99;
		double _value = 2.99;
		
		char character1 = 'a';
		
		boolean Break = true;
		
		// not rules, but we prefer to follow
		/* variable and method names should start with lower case
		 * give variable a meaningful name
		 * 
		 * class name should start with upper case
		 * 
		 * if name has 2 or more words --> follow camelCase
		 */
		
		int bigNumber = 53545556;
		
	}

}
