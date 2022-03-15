package com.syntax.class24;

public class Computer {
    void webBrowser(String URL) {
        System.out.println("Opening website " + URL);
    }
    void memoryCard() {
        System.out.println("64 GB RAM");
    }
    void osSystem() {
    }
}
class Apple extends Computer {
    @Override
    void webBrowser(String URL) {
        System.out.println("Opening website " + URL + " through Safari");
    }
    @Override
    void memoryCard() {
        System.out.println("256GB RAM");
    }
    @Override
    void osSystem() {
        System.out.println("Apple is using macOS");
    }
}
class Lenovo extends Computer {
    @Override
    void memoryCard() {
        System.out.println("1 TB RAM");
    }
    @Override
    void osSystem() {
        System.out.println("Lenovo is using Chrome OS and Windows");
    }
}
class HP extends Computer {
    @Override
    void osSystem() {
        System.out.println("HP is using Windows");
    }
}
class Dell extends Computer {
    @Override
    void osSystem() {
        System.out.println("Dell is using Windows");
    }
}
class ComputerTester{
    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new Lenovo(), new HP(), new Dell()};
        for(Computer computer : computers){
            computer.webBrowser("www.google.com");
            computer.memoryCard();
            computer.osSystem();
        }
    }
}
