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
        return String.format("Witaj, %s", name);
    }
}
