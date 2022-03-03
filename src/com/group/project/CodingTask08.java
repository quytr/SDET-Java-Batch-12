package com.group.project;

public class CodingTask08 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array
		 */

		int[] numbs = { 500, 40, 5, 88, 209, -324, 0 };
		
		int maxNumb = numbs[0];
		
		int minNumb = numbs[0];
		
		for(int i = 1; i < numbs.length; i++) {
			
			if(numbs[i] > maxNumb) {
				
				maxNumb = numbs[i];
				
			}else if(numbs[i] < minNumb) {
				
				minNumb = numbs[i];
				
			}
		}
		
		System.out.println("The maximun number is " + maxNumb);
		System.out.println("The minimun number is " + minNumb);

	}

}
