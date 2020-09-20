package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzWhizzTest {

    @Test
    void testShouldReturnMessageForNullInput() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer given = null;
        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(given);
        //then
        assertEquals("Nie dla null!", result);
    }

    @Test
    void testShouldReturnFizzForInputDivisibleBy3() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int given = 6;
        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(given);
        //then
        assertEquals("Fizz", result);
    }

    @Test
    void testShouldReturnBuzzForInputDivisibleBy5() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int given = 10;
        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(given);
        //then
        assertEquals("Buzz", result);
    }

    @Test
    void testShouldReturnFizzBuzzForInputDivisibleBy5And3() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int given = 15;
        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(given);
        //then
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testShouldReturnWhizzForPrimes() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int given = 7;
        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(given);
        //then
        assertEquals("Whizz", result);
    }

    @Test
    void testShouldReturnFizzWhizzFor3() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int given = 3;
        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(given);
        //then
        assertEquals("FizzWhizz", result);
    }

    @Test
    void testShouldReturnBuzzWhizzFor5() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int given = 5;
        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(given);
        //then
        assertEquals("BuzzWhizz", result);
    }
}