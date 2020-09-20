package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {
    @Test
    void testShouldReturnTrueForProperlyString() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[]";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(true, result);
    }

    @Test
    void testShouldReturnTrueForProperlyStringWithTwoPairs() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[][]";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(true, result);
    }

    @Test
    void testShouldReturnTrueForProperlyStringWithThreePairs() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[[][]]";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(true, result);
    }

    @Test
    void testShouldReturnFalseForUnproperlyStringWithTwoBrackets() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "][";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(false, result);
    }

    @Test
    void testShouldReturnFalseForUnproperlyStringWithTwoPairs() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "][][";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(false, result);
    }

    @Test
    void testShouldReturnFalseForUnproperlyStringWithThreePairs() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[]][[]";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(false, result);
    }

    @Test
    void testShouldReturnFalseForStringWithEvenBrakcets() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[][[][]";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(false, result);
    }

    @Test
    void testShouldReturnTrueForProperlyClosedBrackets() {
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
    void testShouldReturnFalseForUnpropertlyClosedBracketsSecondTest() {
        //given
        Brackets brackets = new Brackets();
        String bracket = "[[[]][";
        //when
        Boolean result = brackets.closedBrackets(bracket);
        //then
        assertEquals(false, result);
    }
}