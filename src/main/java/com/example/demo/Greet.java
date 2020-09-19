package com.example.demo;

import org.springframework.util.StringUtils;

public class Greet {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (name.equals(name.toUpperCase())) {
            return String.format("WITAJ, %s", name);
        }
        if (name.contains(",")) {
            String names = name.replace(",", " i ");

            return String.format("%s, witajcie!", names);
        }
        return String.format("Witaj, %s", name);
    }
}
