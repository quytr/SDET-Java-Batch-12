package com.group.project;

public class CodingTask07 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series
		 * 0 1 1 2 3 5 8 13 21 34
		 * 
		 * i input = 10;
		 * 
		 * 1stNum + 2ndNum = 3rdNum;
		 * 2ndNum + 3rdNum = 4thNum;
		 * 3rdNum + 4thNum = 5thNum;
		 * 4thNum + 5thNum = 6thNum;
		 * 
		 */
		
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
		int i = 0;
		

		
		for(int x = 0; x < 10; x ++) {
			System.out.print(firstNum + " ");
			
			thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
			
		}
		
		//while(i < 10) {
		//System.out.println(firstNum);
		//
		//thirdNum = firstNum + secondNum;
		//firstNum = secondNum;
		//secondNum = thirdNum;
		//i++;
		//
		//
		//}
		

	}

}




