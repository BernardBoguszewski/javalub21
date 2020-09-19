package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        } else if (name.equals(name.toUpperCase())) {
            return String.format("WITAJ %s!", name.toUpperCase());
        }
        if (name.contains(",")) {
            String[] table = name.split(",");
            if (table.length == 2) {
            return String.format("%s i %s, witajcie!", table[0], table[1]);
            } else if (table.length == 3) {
                return String.format("%s, %s i %s, witajcie!", table[0], table[1], table[2]);
            }
        }
        return String.format("Witaj, %s", name);
    }
}
