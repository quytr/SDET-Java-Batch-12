package com.group.project2;

public class CodingTask4 {
    /*
   Create Registration Class in which you would have
variables as email, userName and password that
have an access scope only within its own class. After
creating an object of the class user should be able to
call methods and in each method separately pass
values to set users email, username and password.
Requirements:
A.Valid email consider to be only yahoo
B.Valid userName and password cannot be empty and
should be of length larger than 6 characters. Also
valid password cannot contain userName
     */
}

class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println("Your email is " + this.email);
        } else {
            System.out.println("Invalid email. Only yahoo mail");
        }

    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Your username is " + this.userName);
        } else {
            System.out.println("Username is invalid. Please try again");
        }

    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("Your password is good to use");
        } else {
            System.out.println("Password is invalid. Please try again");
        }
    }
}

class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("abcd13@yahoo.com");
        registration.setUserName("myusernameisusername");
        registration.setPassword("mypasswordispassword12345");

        Registration registration1 = new Registration();
        registration1.setEmail("mymail@gmail.com");

        registration1.setUserName("");
        registration1.setUserName("kevin");
        registration1.setUserName("kevin123");

        registration1.setPassword("");
        registration1.setPassword("hahaha");
        registration1.setPassword("kevin1235678");
        registration1.setPassword("password1234!@");

    }
}

