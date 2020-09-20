package com.example.demo;

import org.apache.commons.lang3.StringUtils;

public class Greet4 {
    public String greet4(String name) {

        int counter = StringUtils.countMatches(name, ",");
        if (counter > 0) {
            return name.replace(",", " i ");
        } else {
            return "Brak przecinków!";
        }
    }
}

