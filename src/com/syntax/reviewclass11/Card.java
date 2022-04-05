package com.syntax.reviewclass11;

public abstract class Card {
//    private abstract void showInterest();
//    static abstract  void showInterest();
//    abstract final void showInterest();
    abstract  void showInterest();
//    abstract Card(){
//        don't participate in inheritance
//    }

}

class Visa extends Card{

    @Override
    void showInterest() {
        System.out.println("15%");
    }
}
