package com.syntax.class21;

public class UserClass {
    String name;
    String mobileNumber;

    public UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends  UserClass{
    String address;

    public UserInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    void userDetails(){
        System.out.println(name + " " + mobileNumber + " " + address);
    }
}

class UserTester{
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Dave", "703-568-8963", "2 Angel St Potomac");
        userInfo.userDetails();
    }
}

