package com.replit.hw;

public class FinalKeyword169 {
    /*
 Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.

Expected Output:

4.8
     */
}
class Main01{
    final static double avgElements(int[] arr){
        double sum = 0.0;
        double avg;
        for(int a : arr){
            sum+=a;
        }
        avg = (sum/arr.length);
        return avg;
    }

    //another way
   /*
    final static double avgElements(int[] arr){
        int sum = 0.0;
        for(int a : arr){
            sum+=a;
        }
        return ((double)sum)/arr.length);
    }
    */

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8

    }
}
