package com.syntax.class22;

import static com.syntax.class22.Area.calculateArea;

public class Area {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
     */

    static double calculateArea(double width, double length ){
        return width*length;
    }
    static double calculateArea(double width){
        return width*width;
    }
    static double calculateArea(double width, double length, double height){
        return width*length*height;
    }
}
class AreaTester{
    public static void main(String[] args) {
        System.out.println("The area of the rectangle is " + calculateArea(10.5,12.5));
        System.out.println("The area of the square is " + calculateArea(5.5));
        System.out.println("The area of the box is " + calculateArea(10.5,9,8.5));
    }
}
