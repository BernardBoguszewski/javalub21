package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Greet4Test {

    @Test
    void testShouldReturnGreetingForName() {
        //given
        Greet4 greet4 = new Greet4();
        String name = "Adam,Iza";

        //when
        String result = greet4.greet4(name);

        //then
        assertEquals("Adam i Iza", result);
    }
    @Test
    void testShouldReturnGreetingForAllName() {
        //given
        Greet4 greet4 = new Greet4();
        String name = "Adam,Iza,Robert";

        //when
        String result = greet4.greet4(name);

        //then
        assertEquals("Adam, Iza i Robert", result);
    }
}