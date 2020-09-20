package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    @Test
    void shouldReturn0WhenGivenStringIsNull() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add(null);

        assertEquals(0, result);
    }

    @Test
    void shouldReturn0WhenGivenStringIsEmpty() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("");

        assertEquals(0, result);
    }

    @Test
    void shouldAddTwoNumbersSeparatedByComma() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("3,5");

        assertEquals(8, result);
    }

    @Test
    void shouldAddThreeNumbersSeparatedByComma() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("2,3,5");

        assertEquals(10, result);
    }
}