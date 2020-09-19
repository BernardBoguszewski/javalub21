package com.example.demo;

public class Greet {

    public String greet(String name) {
        if(name == null){
            return "Witaj, mój przyjacielu";
        }
        if(isUpperCase(name)) {
            return String.format("WITAJ %s!", name);
        }
        if(hasTwoNames(name)){
            String[] strings = name.split(",");
            return String.format("%s i %s, witajcie!", strings[0], strings[1]);
        }
        return String.format("Witaj, %s", name);
    }

    private boolean hasTwoNames(String name) {
        return name.contains(",");
    }

    private boolean isUpperCase(String name){
        return name.equals(name.toUpperCase());
    }

}
