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



}