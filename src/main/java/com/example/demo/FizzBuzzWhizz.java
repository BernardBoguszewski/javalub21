package com.example.demo;

import java.math.BigDecimal;
import java.math.BigInteger;

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
        if (BigInteger.valueOf(digit).isProbablePrime(20)) {
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
        return "Liczba nie spelnia zadnych wymagan";
    }
}
