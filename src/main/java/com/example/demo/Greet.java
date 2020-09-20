package com.example.demo;

public class Greet {
    public int numberOfCommas(String name) {
        int numberOfCommas = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ',') numberOfCommas++;
        }
        return numberOfCommas;
    }

    public String returnFirstName(String name) {
        int i;
        for (i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ',') break;
        }
        return name.substring(0, i);
    }

    public String returnSecondName(String name) {
        int i;
        for (i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ',') break;
        }
        return name.substring(i + 1);
    }

    public String greet(String name) {
        if (numberOfCommas(name) == 1) {
            String name1 = returnFirstName(name);
            String name2 = returnSecondName(name);
            return name1 + " i " + name2 + ", witajcie!";
        }
        if (name != null) {
            if (name.equals(name.toUpperCase())) {
                return "WITAJ, " + name + "!";
            } else {
                return "Witaj, " + name;
            }
        } else {
            return "Witaj, mój przyjacielu.";
        }
    }
}