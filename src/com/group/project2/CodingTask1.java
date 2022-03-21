package com.group.project2;

import javafx.beans.binding.Bindings;

public interface CodingTask1 {
    /*
1.	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code
     */
}
interface Shape{
    double calculateArea(double area);
    double calculatePerimeter(double perimeter);

}
class Circle implements Shape{
    @Override
    public double calculateArea(double radius) {
        return (Math.PI * radius * radius);
    }

    @Override
    public double calculatePerimeter(double radius) {
        return (2 * Math.PI * radius );
    }
}
class Square implements Shape{
    @Override
    public double calculateArea(double a) {
        return (a * a);
    }

    @Override
    public double calculatePerimeter(double a) {
        return (4 * a);
    }
}
class ShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("The area of the circle is " + circle.calculateArea(4.5));
        System.out.println("The perimeter of the circle is " + circle.calculatePerimeter(1.5));

        Square square = new Square();
        System.out.println("The area of the square is " + square.calculateArea(5.0));
        System.out.println("The perimeter of the square is " + square.calculatePerimeter(4.5));
    }
}


