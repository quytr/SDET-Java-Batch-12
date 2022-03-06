package com.syntax.class19;

public class Book {

    String name;
    String author;
    int pages;

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    Book(String author){
        System.out.println("The author " + author + " has so many great books");
    }

    void printAll(){
        System.out.println("The author " + author + " of the book " + name + " and it has " + pages + " pages");
    }
}
