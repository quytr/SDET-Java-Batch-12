package com.syntax.class21;

public class Shape {
    double radius;

    public Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape{
    public Circle(double radius) {
        super(radius);
    }
    void areaCircle(){
        System.out.println(Math.PI * radius * 2);
    }
}

class CircleTester{
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        circle.areaCircle();
    }
}