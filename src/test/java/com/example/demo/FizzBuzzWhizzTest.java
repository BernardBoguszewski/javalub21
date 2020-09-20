package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

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
    void testShouldReturnFizzForInputDivisibleBy3(){
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int given = 6;
        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(given);
        //then
        assertEquals("Fizz", result);
    }
}