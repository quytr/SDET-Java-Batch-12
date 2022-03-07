package com.syntax.class20;

public class Task1A {

    int bankMoney = 500000;
}

class Task1B extends Task1A{

}

class Task1C extends  Task1B{

    public static void main(String[] args) {
        Task1C task = new Task1C();
        System.out.println(task.bankMoney);

    }
}
