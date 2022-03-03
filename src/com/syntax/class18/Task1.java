package com.syntax.class18;

public class Task1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
    int sum;
    protected void sumOfArray (int[] arr){
        for(int i =0; i < arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Task1 task = new Task1();

        int[] arr = {12,14,0,5,6,3};
        task.sumOfArray(arr);

    }


}
