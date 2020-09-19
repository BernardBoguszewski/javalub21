package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (name.equals(name.toUpperCase())) {
            return "WITAJ " + name.toUpperCase();
        }
        if (name.contains(",")) {
            String[] tab = name.split(",");
            if (tab.length == 2) {
                return tab[0] + " i " + tab[1] + " witajcie!";
            }
            if (tab.length == 3) {
                return tab[0] + " ," + tab[1] + " i " + tab[2] + " witajcie!";
            }
        }
        return String.format("Witaj, %s", name);
    }
}
