package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name != null) {
            if (name.equals(name.toUpperCase())) {
                return "WITAJ, " + name + "!";
            } else {
                return "Witaj, " + name;
            }
        } else {
            return "Witaj, mój przyjacielu.";
        }
    }
}