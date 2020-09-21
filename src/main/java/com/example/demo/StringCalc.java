package com.example.demo;

import java.security.InvalidParameterException;

public class StringCalc {

    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }

        String[] divided = new String[0];
        int sum = 0;

        if (!numbers.contains("\n")) {
            divided = numbers.split(",");
        }

        if (numbers.contains("\n")) {
            String newNumbers = "";
            if(numbers.startsWith("//")){
                newNumbers = changeDelimiter(numbers);
            }
            if(!numbers.startsWith("//")) {
                newNumbers = numbers.replaceAll("\n", ",");
            }
            divided = newNumbers.split(",");
        }

        for (int i = 0; i < divided.length; i++) {
            if(Integer.parseInt(divided[i]) < 0){
                throw new IllegalArgumentException("Liczby ujemne nie sąobsługiwane");
            }
            if(Integer.parseInt(divided[i]) > 1000){
                String newI = divided[i].substring(divided[i].length()-1);
                divided[i] = newI;
            }
            sum += Integer.parseInt(divided[i]);
        }
        return sum;
    }

    private String changeDelimiter(String numbers) {
        String newNumbers = numbers.substring(4);
        String newDelimiter = String.valueOf(numbers.charAt(2));
        String newNumbers2 = newNumbers.replaceAll(newDelimiter, "," );
        return newNumbers2;
    }
}
