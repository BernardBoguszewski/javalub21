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
        String name = null;

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);

    }

    @Test
    void testShouldBeCaseSensitive() {
        //given
        Greet greet = new Greet();
        String name = "ADAM";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("WITAJ ADAM!", result);

    }

    @Test
    void testShouldAddAndWhen2Names() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie!", result);

    }

    @Test
    void testShouldAddCommaAndWithMoreNames() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza,Robert";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);

    }

    @Test
    void testShouldReturn3NamesCaseSensitive() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza,ROBERT";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);

    }

    @Test
    void testShouldWorkWithNumbers() {
        //given
        Greet greet = new Greet();
        String name = "Adam123";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Z liczbami się nie witam.", result);

    }


}