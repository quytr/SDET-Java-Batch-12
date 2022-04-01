package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    /*
    Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
    Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {

        Card1 card1 = new Card1("Capital One");
        Card2 card2 = new Card2("Discovery");
        Card3 card3 = new Card3("Bank of America");

        ArrayList<String> cards = new ArrayList<>();
        cards.add(card1.activateCard());
        cards.add(card1.creditCardType());
        cards.add(card2.activateCard());
        cards.add(card2.creditCardType());
        cards.add(card3.activateCard());
        cards.add(card3.creditCardType());

        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }

        for(String card: cards){
            System.out.println(card);
        }

        Iterator<String> iterator = cards.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
abstract class Card{
    String cardType;

    public Card(String cardType) {
        this.cardType = cardType;
    }
    public String activateCard(){
        return "Activating " + cardType + " card";
    }
    public abstract String creditCardType();
}
class Card1 extends Card{

    public Card1(String cardType) {
        super(cardType);
    }

    @Override
    public String creditCardType() {
        return "Credit-building cards";
    }
}

class Card2 extends Card{

    public Card2(String cardType) {
        super(cardType);
    }

    @Override
    public String creditCardType() {
        return "Rewards credit cards";
    }
}

class Card3 extends Card{

    public Card3(String cardType) {
        super(cardType);
    }

    @Override
    public String creditCardType() {
        return "Low interest and balance transfer card";
    }
}
