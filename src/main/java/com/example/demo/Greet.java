package com.example.demo;

public class Greet {

    public String greet(String name) {
        if(name == null){
            return "Witaj, mój przyjacielu";
        }
        if(isUpperCase(name)) {
            return String.format("WITAJ %s", name);
        }
        return String.format("Witaj, %s", name);
    }

    private boolean isUpperCase(String name){
        return name.equals(name.toUpperCase());
    }

}
