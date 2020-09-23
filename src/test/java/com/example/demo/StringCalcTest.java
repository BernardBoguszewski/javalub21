package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalcTest {

    @Test
    void testShouldAddNumbers() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "3,5";

        int result = stringCalc.add(numbers);

        assertEquals(8, result);
    }

    @Test
    void testShouldReturnZero() {
        StringCalc stringCalc = new StringCalc();
        String numbers = null;
        String numbers2 = "";

        int result = stringCalc.add(numbers);
        int result2 = stringCalc.add(numbers2);

        assertEquals(0, result);
        assertEquals(0, result);
    }

    @Test
    void testShouldWorkWith3Numbers() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "2,3,5";

        int result = stringCalc.add(numbers);

        assertEquals(10, result);

    }

    @Test
    void testShouldWorkWithNNumbers() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "2,4,7,10,5";
        String numbers2 = "1,3,5,7";
        String numbers3 = "7,3,4,2,9,5";

        int result = stringCalc.add(numbers);
        int result2 = stringCalc.add(numbers2);
        int result3 = stringCalc.add(numbers3);

        assertEquals(28, result);
        assertEquals(16, result2);
        assertEquals(30, result3);
    }

    @Test
    void testShouldWorkWithNewLine() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "3\n5,3";

        int result = stringCalc.add(numbers);

        assertEquals(11, result);

    }

    @Test
    void testShouldAcceptNewSeparator() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "//;\n3;5;7";

        int result = stringCalc.add(numbers);

        assertEquals(15, result);

    }

    @Test
    void testShouldNotWorkWithNumbersBelowZero() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "3,-5";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    stringCalc.add(numbers);
                });

        assertEquals("Liczby ujemne nie sąobsługiwane", exception.getMessage());
    }

    @Test
    void testShouldIgnoreValuesOverOneThousand() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "1002,5";

        int result = stringCalc.add(numbers);

        assertEquals(7, result);
    }

    @Test
    void testShouldWorkWithDefinedSeparators() {
        StringCalc stringCalc = new StringCalc();
        String numbers= "//[abc]\n5abc2abc3";

        int result1 = stringCalc.add(numbers);

        assertEquals(10, result1);
    }

    @Test
    void testShouldWorkWithDefinedSeparatorsSpecialCharactersStarCheck() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "//[***]\n5***2***3";

        int result = stringCalc.add(numbers);

        assertEquals(10, result);
    }

    @Test
    void testShouldWorkWithMoreThanOneDefinedSeparators() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "//[%],[;]\n8;2%7";

        int result = stringCalc.add(numbers);

        assertEquals(17, result);
    }

    @Test
    void testShouldWorkWithMoreThanOneDefinedMultiCharacterSeparators() {
        StringCalc stringCalc = new StringCalc();
        String numbers = "//[%%],[;]\n8;2%%7";

        int result = stringCalc.add(numbers);

        assertEquals(17, result);
    }
}