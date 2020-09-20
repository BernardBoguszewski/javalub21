package com.example.demo;

public class FizzBuzzWhizz {
    public String fizzBuzzWhizz(Integer digit) {
        if (digit == null) {
            return "Nie dla null!";
        }
        if (digit == 3) {
            return "FizzWhizz";
        }
        if (digit == 5) {
            return "BuzzWhizz";
        }
        if (isDigitPrime(digit)) {
            return "Whizz";
        }
        if (digit % 3 == 0 && digit % 5 == 0) {
            return "FizzBuzz";
        }
        if (digit % 3 == 0) {
            return "Fizz";
        }
        if (digit % 5 == 0) {
            return "Buzz";
        }
        return null;
    }

    private boolean isDigitPrime(Integer digit) {
        if (digit == 2) {
            return true;
        }

        int counter = 2;
        for (int i = 3; i <= digit; i++) {
            if (digit % i == 0) {
                counter++;
                if (counter > 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
