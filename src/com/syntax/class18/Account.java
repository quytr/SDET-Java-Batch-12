package com.syntax.class18;

public class Account {

    private String userName = "Timmy";
    private String password = "12345";
    public String accountNumber = "9875";
    private double balance = 102.56;

    private void printUserName(){
        System.out.println(userName);
    }

    protected void printPassword(){
        System.out.println(password);
    }

    void printBalance(){
        System.out.println(balance);
    }

    public void printAccountNumber(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account account = new Account();

        System.out.println(account.userName);
        System.out.println(account.password);
        System.out.println(account.balance);
        System.out.println(account.accountNumber);

        account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }


}
