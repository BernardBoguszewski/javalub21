package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuzzFizzTest {

    @Test
    void testShouldChecksNull() {
        BuzzFizz buzzFizz = new BuzzFizz();
        Integer digit = null;

        String result = buzzFizz.fizzBuzzWhizz(digit);

        assertEquals("Nie dla null!", result);

    }

    @Test
    void testShouldCheckFizz() {
        BuzzFizz buzzFizz = new BuzzFizz();
        Integer digit = 9;

        String result = buzzFizz.fizzBuzzWhizz(digit);

        assertEquals("Fizz", result);

    }

    @Test
    void testShouldCheckBuzz() {
        BuzzFizz buzzFizz = new BuzzFizz();
        Integer digit = 10;

        String result = buzzFizz.fizzBuzzWhizz(digit);

        assertEquals("Buzz", result);

    }

    @Test
    void testShouldCheckFizzBuzz() {
        BuzzFizz buzzFizz = new BuzzFizz();
        Integer digit = 15;

        String result = buzzFizz.fizzBuzzWhizz(digit);

        assertEquals("FizzBuzz", result);

    }

    @Test
    void testShouldCheckFizzWhizz() {
        BuzzFizz buzzFizz = new BuzzFizz();
        Integer digit = 3;

        String result = buzzFizz.fizzBuzzWhizz(digit);

        assertEquals("FizzWhizz", result);

    }

    @Test
    void testShouldCheckBuzzWhizz() {
        BuzzFizz buzzFizz = new BuzzFizz();
        Integer digit = 5;

        String result = buzzFizz.fizzBuzzWhizz(digit);

        assertEquals("BuzzWhizz", result);

    }

    @Test
    void testShouldCheckWhizz() {
        BuzzFizz buzzFizz = new BuzzFizz();
        Integer digit = 11;

        String result = buzzFizz.fizzBuzzWhizz(digit);

        assertEquals("Whizz", result);

    }

}