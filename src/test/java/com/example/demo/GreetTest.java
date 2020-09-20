package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void testShouldReturnGreetingWithoutName() {
        //given
        Greet greet = new Greet();
        String name = null;

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu.", result);
    }

    @Test
    void testShouldReturnGreetingForNameBigLetters() {
        //given
        Greet greet = new Greet();
        String name = "ADAM";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("WITAJ, ADAM!", result);
    }

    @Test
    void testShouldReturnGreetingForTwoNames() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    void testShouldReturnNumberOfCommas() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza";

        //when
        int result = greet.numberOfCommas(name);

        //then
        assertEquals(1, result);
    }

    @Test
    void testShouldReturnFirstNameBeforeComma() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza";

        //when
        String result = greet.returnFirstName(name);

        //then
        assertEquals("Adam", result);
    }

    @Test
    void testShouldReturnSecondName() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza";

        //when
        String result = greet.returnSecondName(name);

        //then
        assertEquals("Iza", result);
    }
}