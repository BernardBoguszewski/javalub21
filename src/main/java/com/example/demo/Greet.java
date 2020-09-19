package com.example.demo;

public class Greet {

    public String greet(String name) {

        if (name != null) {
            return String.format("Witaj, %s", name);
        }
        return "Witaj, mój przyjacielu";
    }
}
