package com.example.demo;

import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

public class Greet {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (stringContainsNumber(name)) {
            return "Z liczbami sie nie witam";
        }
        if (name.equals(name.toUpperCase())) {
            return String.format("WITAJ, %s", name);
        }
        if (name.contains(",")) {
            String[] names = name.split(",");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (String n : names) {
                if (!n.equals(n.toUpperCase())) {
                    sb.append(n).append(", ");
                } else {
                    sb2.append(n);
                }
            }
            if (sb2.toString().length() == 0) {
                String formattedNames = name.replaceAll("(,)([^,]*)$", " i " + "$2").replaceAll(",", ", ");
                return String.format("%s, witajcie!", formattedNames);
            } else {
                return sb.toString() + "witajcie!" + " WITAJ " + sb2.toString();
            }
        }
        return String.format("Witaj, %s", name);
    }

    public boolean stringContainsNumber(String string) {
        return Pattern.compile("[0-9]").matcher(string).find();
    }
}