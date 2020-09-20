package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name != null) {
            return String.format("Witaj, %s", name);

        } else if (name != null && name.equals(name.toUpperCase())) {
            return String.format("WITAJ, %s,", name.toUpperCase());

        } else {
            return String.format("Witaj, mój przyjacielu! ");
        }
    }
}
