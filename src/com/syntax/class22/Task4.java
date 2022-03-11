package com.syntax.class22;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private void subtract(int x, int y){
        System.out.println(x - y);
    }

    private void subtract(double x, double y){
        System.out.println(x - y);
    }

    private void subtract(int x, int y, int z){
        System.out.println(x - y - z);
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.subtract(9,5);
        task4.subtract(99.5, 23.2);
        task4.subtract(99,53,10);
    }
}
