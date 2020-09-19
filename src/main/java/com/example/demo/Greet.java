package com.example.demo;

public class Greet {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        } else if (isUpperCase(name)) {
            return String.format("WITAJ %s!", name.toUpperCase());
        }
        return String.format("Witaj, %s", name);
    }

    private boolean isUpperCase(String name) {
        char[] charArray = name.toCharArray();

        for(int i=0; i < charArray.length; i++){
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }

        return true;
    }

}
