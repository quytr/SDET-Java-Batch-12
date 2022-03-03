package com.group.project;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTask01 {

	public static void main(String[] args) {
		
		/*
		 * Create an array on int values using a scanner and calculate the sum of all
		 * stored elements in that array.
		 * 
		 * syntax array:
		 * datatype[] varName = new datatype [#elements];  // ex: #elements = 3
		 * varName[0] = ;     // #elements is increase by 1 every time it repeats
		 * varName[1] = ;     // need for loop to hold the value input 
		 * varName[2] = ;     
		 * 
		 * to print out each element in the array -> for loop 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array:");
		
		int length = sc.nextInt();   // the length of the array
		
		int[] myArray = new int[length];  // create a new array
		
		int sumArray = 0;     // to hold the sum of all elements
		
		System.out.println("Enter the elements of the array with the size " + length);
		
		for(int i = 0; i < length; i++) {      // i is the index of the array
			myArray[i] = sc.nextInt();
			
			sumArray += myArray[i];        // to add each element together
			
		}
		
		//print out the elements of an array without a loops
		System.out.println(Arrays.toString(myArray));
		
		System.out.println("The sum of the array is " + sumArray);
		
		
	
	}

}



