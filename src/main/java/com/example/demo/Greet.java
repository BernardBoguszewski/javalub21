package com.example.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Greet {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (isUpperCase(name)) {
            return String.format("WITAJ %s!", name);
        }
        if (name.contains(",")) {
            return threeNames(name);
        }
        return String.format("Witaj, %s", name);
    }

    private String threeNames(String name) {
        String[] names = name.split(",");
        if (names.length == 2) {
            return String.format("%s i %s, witajcie!", names[0], names[1]);
        }
        if (names.length == 3) return getString(names);
        return null;
    }

    private String getString(String[] names) {
        if (hasUpperCaseName(names)) {
            String upperCaseName = "";
            ArrayList<String> lowerCaseNames = new ArrayList<>();
            for (String string : names) {
                if (isUpperCase(string)) {
                    upperCaseName = string;
                }
                lowerCaseNames.add(string);
            }
            return String.format("%s i %s, witajcie! WITAJ %s!", lowerCaseNames.get(0), lowerCaseNames.get(1), upperCaseName);
        }
        return String.format("%s, %s i %s, witajcie!", names[0], names[1], names[2]);
    }

    private boolean hasUpperCaseName(String[] strings) {
        for (String name : strings) {
            if (isUpperCase(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasTwoNames(String name) {
        return name.contains(",");
    }

    private boolean isUpperCase(String name) {
        return name.equals(name.toUpperCase());
    }

}
