package com.example.demo;

import java.io.StringWriter;

public class Greet {

    public String greet(String name) {


        if (name != null && name.contains(",")) {
            String[] names = name.split(",");
            if (names.length == 3)
                return String.format(names[0] + ", " + names[1] + " i " + names[2] + ", witajcie!");
            else if (names.length < 3)
               return String.format(names[0] + " i " + names[1] + ", witajcie!");



        } else if (name != null && !name.equals(name.toUpperCase()) && !name.contains(",")) {
            return String.format("Witaj, %s", name);

        } else if (name != null && name.equals(name.toUpperCase())&& !name.contains(",")) {
            return String.format("WITAJ, %s", name);


        }return String.format("Witaj mój przyjacielu");
    }
}