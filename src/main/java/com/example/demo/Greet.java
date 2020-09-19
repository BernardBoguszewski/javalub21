package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name == null){
            return "Witaj, mój przyjacielu";
        } else if (name.equals(name.toUpperCase())){
            return String.format("WITAJ, %s", name);
        }
        return String.format("Witaj, %s", name);
    }

}
