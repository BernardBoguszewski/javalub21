package com.example.demo;

public class FizzBuzzWhizz {
    public String fizzBuzzWhizz(Integer digit) {
        if (digit == null) {
            return "Nie dla null!";
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
}
