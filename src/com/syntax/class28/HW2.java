package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HW2 {
    /*
    Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
    Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new Card1("Capital One"));
        cards.add(new Card2("Discovery"));
        cards.add(new Card3("Bank of America"));

        for (Card card : cards) {
            card.creditCardType();
        }

    }
}
abstract class Card{
    String cardType;

    public Card(String cardType) {
        this.cardType = cardType;
    }
    public void activateCard(){

        System.out.println("Activating " + cardType + " card");
    }
    public abstract void creditCardType();
}
class Card1 extends Card{

    public Card1(String cardType) {
        super(cardType);
    }

    @Override
    public void creditCardType() {

        System.out.println("Credit-building cards");
    }
}

class Card2 extends Card{

    public Card2(String cardType) {
        super(cardType);
    }

    @Override
    public void creditCardType() {

        System.out.println("Rewards credit cards");
    }
}

class Card3 extends Card{

    public Card3(String cardType) {
        super(cardType);
    }

    @Override
    public void creditCardType() {

        System.out.println("Low interest and balance transfer card");
    }
}
