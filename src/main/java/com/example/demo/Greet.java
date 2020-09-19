package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name.matches(".*\\d.*")) {
            return "Z liczbami się nie witam.";
        }
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
                return greetingWithOneCapitalName(table);
            }
        }

        return String.format("Witaj, %s", name);
    }

    private String greetingWithOneCapitalName(String[] table) {
        if (table[0].equals(table[0].toUpperCase())) {
            return String.format("%s i %s, witajcie! WITAJ %s!", table[1], table[2], table[0].toUpperCase());
        } else if (table[1].equals(table[1].toUpperCase())) {
            return String.format("%s i %s, witajcie! WITAJ %s!", table[0], table[2], table[1].toUpperCase());
        } else if (table[2].equals(table[2].toUpperCase())) {
            return String.format("%s i %s, witajcie! WITAJ %s!", table[0], table[1], table[2].toUpperCase());
        }
        return String.format("%s, %s i %s, witajcie!", table[0], table[1], table[2]);
    }
}
