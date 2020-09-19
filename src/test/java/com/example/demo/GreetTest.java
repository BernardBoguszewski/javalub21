package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetTest {

    @Test
    void testShouldReturnGreetingForName() {
        //given
        Greet greet = new Greet();
        String name = "Adam";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Witaj, Adam", result);
    }

    @Test
    void testShouldProtectAgainstNull() {
        //given
        Greet greet = new Greet();
        String name = "";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Name needed", result);

    }

}