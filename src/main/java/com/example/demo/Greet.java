package com.example.demo;

public class Greet {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (name.equals(name.toUpperCase())) {
            return String.format("WITAJ %s!", name);
        }
        String [] names = name.split(",");
        if (names.length == 2) {
            return name.substring(0, name.indexOf(",")) + " i " + name.substring(name.indexOf(",") + 1) + ", witajcie!";
        }
        return String.format("Witaj, %s", name);
    }
}
