package com.example.demo;

public class StringCalc {

    public int add(String numbers){
        if(numbers == null || numbers.isBlank()){
            return 0;
        }

        String[] divided = numbers.split(",");
        int sum = 0;

        for (int i = 0; i < divided.length; i++) {
            sum += Integer.parseInt(divided[i]);
        }

        return sum;
    }
}
