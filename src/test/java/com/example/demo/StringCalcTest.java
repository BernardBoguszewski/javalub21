package com.example.demo;

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



}