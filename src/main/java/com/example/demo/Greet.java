package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        } else if (name.equals(name.toUpperCase())) {
            return String.format("WITAJ %s!", name.toUpperCase());
        }
        return String.format("Witaj, %s", name);
    }

    public String greet(String name1, String name2) {
        return String.format("%s i %s, witajcie!", name1, name2);
    }
}
