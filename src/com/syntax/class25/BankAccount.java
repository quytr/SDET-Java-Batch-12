package com.syntax.class25;

public class BankAccount {
    private double balance = 1223;
    private String userName = "Kevin";
    private String password = "Kevin123@";

    //we won’t have direct access to instance vars, but by getter of that variable
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void printBalance(String userName, String password){
        if (userName.equals(this.userName) && password.equals(this.password)) {

            System.out.println(balance);
        }else{
            System.out.println("username password not correct");
        }
    }

}
