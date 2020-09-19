package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name == null){
            return "Witaj, mój przyjacielu";
        }
        if (name.equals(name.toUpperCase())){
            return "WITAJ " + name.toUpperCase();
        }

        return String.format("Witaj, %s", name);
    }
}
