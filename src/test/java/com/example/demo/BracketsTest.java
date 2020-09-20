package com.example.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {
    @ParameterizedTest
    @ValueSource(strings = {"[]", "[][]", "[[][]]"})
    void testShouldCheckIfAllBracketsAreClosed(String given) {
        //given
        Brackets brackets = new Brackets();
        //when
        boolean result = brackets.areClosed(given);
        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"][", "][][", "[]][[]"})
    void testShouldCheckIfAllBracketsAreClosed2(String given) {
        //given
        Brackets brackets = new Brackets();
        //when
        boolean result = brackets.areClosed(given);
        //then
        assertFalse(result);
    }
}