package com.example.demo;

public class StringCalc {

    public int add(String numbers){
        if(numbers == null || numbers.isBlank()){
            return 0;
        }

        String[] divided = numbers.split(",");

        return Integer.parseInt(divided[0]) + Integer.parseInt(divided[1]);
    }
}
