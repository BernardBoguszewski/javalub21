package com.example.demo;

import org.apache.commons.lang3.StringUtils;

public class Greet {

    public String greet(String name) {
        int counter = StringUtils.countMatches(name, ",");

        if (name =="ADAM"){
            return "WITAJ ADAM";
        }else {
            return "Witaj, mój przyjacielu";
        }
    }
}
