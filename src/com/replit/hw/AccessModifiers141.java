package com.replit.hw;

import java.util.Arrays;

public class AccessModifiers141 {
    /*
 For you to do: Create the maxValue method that will accept int array and return return the maximum value in the array.

Method should visible every class in any package!
     */

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }

    public static int maxValue(int[] arr){
        Arrays.sort(arr);
        return(arr[arr.length-1]);

    }

}
