package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();
        Suzuki suzuki = new Suzuki();
        suzuki.park();
        suzuki.start();

        System.out.println("================");
        Car car = new BMW();
        car.start();

        Car car1 = new Tesla();
        car1.start();
        car1 = new Suzuki();
        car1.start();
    }
}
