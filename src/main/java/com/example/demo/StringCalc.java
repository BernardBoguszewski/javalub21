package com.example.demo;

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
            String newNumbers = numbers.replaceAll("\n", ",");
            divided = newNumbers.split(",");
        }

        for (int i = 0; i < divided.length; i++) {
            sum += Integer.parseInt(divided[i]);
        }

        return sum;
    }
}
