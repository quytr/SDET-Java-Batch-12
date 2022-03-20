package com.syntax.class25;


public interface MoveAble {
    void move();
}
interface DriverAble{
    void drive();
}
interface Car extends DriverAble, MoveAble{

}
class BMW implements Car{

    @Override
    public void move() {
        System.out.println("we can move a car");
    }

    @Override
    public void drive() {
        System.out.println("we can drive the BMW");
    }
}

class CarTester{
    public static void main(String[] args) {
        Car car = new BMW();
        DriverAble driverAble = new BMW();
        driverAble.drive();

    }
}
