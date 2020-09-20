package com.example.demo;

import org.junit.jupiter.api.Test;

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
}