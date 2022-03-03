package com.syntax.reviewclass06;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] array = new int[2][3];
		
		//1st row
		array[0][0]=10;
		array[0][1]=20;
		array[0][2]=30;
		
		//2nd row
		array[1][0]=1;
		array[1][1]=2;
		array[1][2]=3;
		
		System.out.println(array.length);  //size is = 2 ---> 2 1D array
		
		int[]arr = {10,4,58,56};
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length -1]);
		
		

	}

}
