package com.example.demo;

public class Greet {

    public String greet(String name) {
        if(name.isBlank()){
            return "Name needed";
        }
        return String.format("Witaj, %s", name);
    }

}
