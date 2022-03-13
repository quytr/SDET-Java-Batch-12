package com.syntax.class23;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calculateInterest(){
        System.out.println(balance * interest);
    }

}
class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println(balance * interest + 1);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println(balance * interest + 2);
    }
}

class CreditCardTester{
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(100.0,.2);
        creditCard.calculateInterest();
        Visa visa = new Visa(500.0,.3);
        visa.calculateInterest();
        AX ax = new AX(6000,.5);
        ax.calculateInterest();
    }

}