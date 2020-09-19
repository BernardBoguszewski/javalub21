package com.example.demo;

public class Greet {

    public String greet(String name) {
        return (name != null) ? String.format("Witaj, %s", name) : "Witaj, mój przyjacielu";
    }

}
