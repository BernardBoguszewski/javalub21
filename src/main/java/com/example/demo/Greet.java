package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name == null){
            return "Witaj, mój przyjacielu";
        } else if (name.equals(name.toUpperCase())){
            return String.format("WITAJ, %s", name);
        } else if (name.contains(",")){
            String names= name.replace(",", " i");
            return String.format("%s, witajcie", names);
        }
        return String.format("Witaj, %s", name);
    }

}
