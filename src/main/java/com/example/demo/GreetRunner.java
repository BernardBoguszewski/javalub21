package com.example.demo;

public class GreetRunner {
    public static void main(String[] args) {
        Greet greet = new Greet();

        System.out.println(greet.greet("ADAM"));

        Greet5 greet5 = new Greet5();
        System.out.println(greet5.greet5("Adam,Iza,Robert"));
    }
}
