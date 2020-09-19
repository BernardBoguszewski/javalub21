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
    void testShouldReturnDefaultGreetingForNullName() {
        //given
        Greet greet = new Greet();

        //when
        String result = greet.greet(null);

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    void testShouldCapitalLetterGreetingIfNameIsCapital() {
        //given
        Greet greet = new Greet();
        String name = "ADAM";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("WITAJ ADAM!", result);
    }

    @Test
    void testShouldGreetTwoNames() {
        //given
        Greet greet = new Greet();
        String name1 = "Adam";
        String name2 = "Iza";

        //when
        String result = greet.greet(name1, name2);

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }
}