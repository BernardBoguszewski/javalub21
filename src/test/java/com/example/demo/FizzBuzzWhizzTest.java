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
    @CsvSource({"3", "6", "18", "102"})
    void testShouldReturnFizzIfDigitIsDivisibleByThree(Integer digit) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @CsvSource({"5", "10", "100", "1015"})
    void testShouldReturnBuzzIfDigitIsDivisibleByFive(Integer digit) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @CsvSource({"15", "30", "45", "60"})
    void testShouldReturnBuzzIfDigitIsDivisibleByThreeAndFive(Integer digit) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        assertEquals("FizzBuzz", result);
    }

    @ParameterizedTest
    @CsvSource({"3, FizzWhizz", "5, BuzzWhizz"})
    void testShouldReturnFizzWhizzIfDigitEquals3AndBuzzWhizzIfDigitEquals5(Integer digit, String expected) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"2", "7", "11", "13", "17", "19", "23", "29", "31", "37", "41", "43", "47", "52"})
    void testShouldReturnFizzWhizzIfDigitEquals3AndBuzzWhizzIfDigitEquals5(Integer digit) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        assertEquals("Whizz", result);
    }

}