package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name==null) {return "Witaj, mój przyjacielu";} else
        return String.format("Witaj, %s", name);
    }

}
