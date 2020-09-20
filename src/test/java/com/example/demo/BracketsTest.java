package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {
    @Test
    void testShouldReturnTrueForPropertlyClosedBrackets() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[[]][]";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(true, result);
    }
    @Test
    void testShouldReturnFalseForUnpropertlyClosedBrackets() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "][[]][";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(false, result);
    }
    @Test
    void testShouldReturnFalseForUncopletedBrackets() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[[]]]";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(false, result);
    }
    @Test
    void testShouldReturnFalseForUnpropertlyClosedBracketsSecoundTest() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[[[]][";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(false, result);
    }
}