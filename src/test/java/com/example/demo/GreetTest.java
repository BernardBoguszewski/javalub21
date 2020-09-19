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
    void testShouldDoHelloIfNull() {
        //given
        Greet greet = new Greet();
        String name = null;

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Witaj mój przyjacielu", result);
    }
    @Test
    void testShouldDoUpperCaseName() {
        //given
        Greet greet = new Greet();
        String name = "ADAM";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("WITAJ, ADAM", result);
    }
    @Test
    void testShouldAddNamesAfterComma() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam i Iza witajcie!", result);
    }

}