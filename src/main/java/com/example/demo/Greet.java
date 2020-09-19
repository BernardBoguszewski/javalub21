package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (isUpperCase(name)) {
            return String.format("WITAJ %s!", name);
        }
        if (name.contains(",")) {
            String[] strings = name.split(",");
            if (strings.length == 2) {
                return String.format("%s i %s, witajcie!", strings[0], strings[1]);
            }
            if (strings.length == 3) {
                return String.format("%s, %s i %s, witajcie!", strings[0], strings[1], strings[2]);
            }
        }
        return String.format("Witaj, %s", name);
    }

    private boolean hasTwoNames(String name) {
        return name.contains(",");
    }

    private boolean isUpperCase(String name) {
        return name.equals(name.toUpperCase());
    }

}
