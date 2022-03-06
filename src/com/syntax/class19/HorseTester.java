package com.syntax.class19;

public class HorseTester {
    public static void main(String[] args) {

        Horse horse = new Horse("Jay", 20, 400);

        /*
        Horse -> Data type (Name of classes)
        horse -> Object/instance/reference variable/ variable
        =     -> assignment operator
        Horse("Jay", 20, 400) -> call to a constructor
        ;     -> Line terminator
         */
        horse.printHorseName();

    }
}
