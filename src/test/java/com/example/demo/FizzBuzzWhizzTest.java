package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzWhizzTest {

    @Test
    void testShouldReturnDefaultStringForNull() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String result = fizzBuzzWhizz.fizzBuzzWhizz(null);

        assertEquals("Nie dla null!", result);
    }

    @ParameterizedTest
    @CsvSource({"3", "6", "15", "18", "30", "102"})
    void testShouldReturnFizzIfDigitIsDivisibleByThree(Integer digit) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        assertEquals("Fizz", result);
    }

}