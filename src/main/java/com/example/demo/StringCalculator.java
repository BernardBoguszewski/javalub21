package com.example.demo;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }
        String[] numbersTable = numbers.split(",");
        int sum = 0;

        for (String s : numbersTable) {
            sum = sum + Integer.parseInt(s);
        }

        return sum;
    }
}
