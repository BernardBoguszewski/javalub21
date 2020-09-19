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
    void testShouldReturnGreetingForNull() {
        //given
        Greet greet = new Greet();
        String name = null;

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    void testShouldReturnGreetingForUpperCase() {
        //given
        Greet greet = new Greet();
        String name = "ADAM";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("WITAJ ADAM", result);
    }

    @Test
    void testShouldReturnGreetingForTwoPersons() {
        //given
        Greet greet = new Greet();
        String name = "Adam";
        String name2 = "Iza";

        //when
        String result = greet.greet(name,name2);

        //then
        assertEquals(name + " i " + name2 + " witajcie!", result);
    }
}