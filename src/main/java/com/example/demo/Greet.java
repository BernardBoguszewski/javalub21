package com.example.demo;

public class Greet {

    public String greet(String name) {

        if(name != null && name.contains(",")){
            String [] names = name.split(",");
            return String.format(names[0] + " i " + names[1] + " witajcie!");
        }else if (name != null && !name.equals(name.toUpperCase())) {
            return String.format("Witaj, %s", name);

        } else if (name != null && name.equals(name.toUpperCase())) {
            return String.format("WITAJ, %s", name);

        }return String.format("Witaj mój przyjacielu");
    }
}