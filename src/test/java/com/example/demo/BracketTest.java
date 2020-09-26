package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketTest {

    @Test
    void TestShouldCheckBrackets(){
        //Given
        Bracket bracket = new Bracket();
        String brackets = "[]";
        //When
        boolean result = bracket.checker(brackets);
        //Then
        assertEquals(true, result);
    }

}