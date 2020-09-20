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
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            counter = i;
            if (name.charAt(i) == ',') break;
        }
        return name.substring(0, counter);
    }

    public String returnSecondName(String name) {
        int firstComma = 0;
        int secondComma = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ',') {
                firstComma = i;
                break;
            }
        }
        for (int i = firstComma + 1; i < name.length(); i++) {
            if (name.charAt(i) == ',') {
                secondComma = i;
                break;
            }
        }
        return name.substring(firstComma + 1, secondComma);
    }

    public String returnThirdName(String name) {
        int counterCommas = 0;
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            counter = i;
            if (name.charAt(i) == ',') counterCommas++;
            if (counterCommas == 2) break;
        }
        return name.substring(counter + 1);
    }

    public String greet(String name) {
        if (numberOfCommas(name) == 1) {
            return returnFirstName(name) + " i " + returnSecondName(name) + ", witajcie!";
        }
        if (numberOfCommas(name) == 2) {
            return returnFirstName(name) + ", " + returnSecondName(name) + " i " + returnThirdName(name) + ", witajcie!";
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