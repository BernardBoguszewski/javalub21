package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzWhizzTest {

    @Test
    void testShouldReturnDefaultStringForNull() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer givenDigit = null;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(givenDigit);

        assertEquals("Nie dla null!", result);
    }

}