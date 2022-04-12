package com.syntax.reviewclass12;

public class Facebook {

    private String name;
    private int age;
    private String password;
    private String gender;
    private String phoneNumber;

    void setName(String name){
        if(name.length() <= 20 && !StringUtil.contains(name,"[0-9]")){
            this.name = name;
            System.out.println("value assigned");

        }else{
            System.out.println("Name should be less than 20 characters and it should not contain numbers");
        }
    }

    void setAge(int age){
        if(age<150 && age > 5){
            this.age = age;
        }else{
            System.out.println("This age is not allowed");
        }
    }

    void setPassword(String password){
        if(password.length() >= 8 && password.contains(name)){
            this.password = password;
        }
    }

    String getName(String password){
        if(this.password.equals(password)){
            return name;
        }else{
            return "";
        }
    }

    public void signUp(String name, int age, String password, String gender, String phoneNumber){
        if(name.length() <20){
            this.name = name;
            this.age = age;
            this.password = password;
            this.gender = gender;
            this.phoneNumber = phoneNumber;
        }
    }

    public void browserFacebook(){
        System.out.println(name = " is Scrolling Facebook");
    }


}
