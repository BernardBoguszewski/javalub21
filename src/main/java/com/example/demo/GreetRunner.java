package com.example.demo;

public class GreetRunner {
    public static void main(String[] args) {
        Greet greet = new Greet();

        System.out.println(greet.greet("ADAM"));

        Greet4 greet4 = new Greet4();
        System.out.println(greet4.greet4("Adam,Iza,Robert"));
    }
}
