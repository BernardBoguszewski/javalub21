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
    void testShouldReturnMessageForNull(){
        Greet greet= new Greet();
        String name= null;

        String result= greet.greet(name);

        assertEquals("Witaj, mój przyjacielu", result);
    }
    @Test
    void testShouldReturnGreetingWithUpperCase(){
        Greet greet= new Greet();
        String name= "ADAM";

        String result= greet.greet(name);

        assertEquals("WITAJ, ADAM", result);

    }
}