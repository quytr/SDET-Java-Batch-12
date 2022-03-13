package com.replit.hw;

public class Inheritance151 {
    /*
For you to do:

In Method Class:

Complete static sum2D method by writing an accumulator algorithm that will calculate the sum of all the element in the 2D array passed as a parameter.

You know how to do this.

You know how to do an accumulator algorithm with a 1-D array. Now it's "loop through all the elements of the 2-D array" instead of "loop through all the elements of the 1-D array". You know how to loop through a 2-D array. You got this.

In Main Class:

Create relation between Main class and Method by making Main class as a subclass of the Method Class

Use Array:

int[][] a = {

             { 1, 2, 3 },

             { 4, 5, 6 },

             { 7, 8, 9 }

                               };
             { 1, 2, 3 },

             { 4, 5, 6 },

             { 7, 8, 9 }

                               };
and execute sum2D method

Expected Output:

45
     */


}

class Method{
    public int sumArr(int[][] arr){
        int sum = 0;
        for(int[] row : arr){
            for(int col : row){
                sum += col;
            }
        }
        return sum;
    }
}
class Main2 extends Method{

    public static void main(String[] args) {
        int[][]a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Main2 main2 = new Main2();
        System.out.println(main2.sumArr(a));

    }
}
