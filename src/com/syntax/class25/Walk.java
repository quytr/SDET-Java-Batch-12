package com.syntax.class25;

public interface Walk extends HealthAble {
    void healthy();
    void burnCalories();
}
interface Milk extends HealthAble{
    void healthy();
    void giveEnergy();
}
interface Banana extends HealthAble{
    void healthy();
    void giveEnergy();
}
interface HealthAble{
    void healthy();
}
class Demo implements Banana{
    @Override
    public void healthy() {
        System.out.println("Banana is good for healthy");
    }

    @Override
    public void giveEnergy() {
        System.out.println("it gives us energy");
    }
}
class DemoTester{
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.giveEnergy();
        demo.healthy();
    }
}
