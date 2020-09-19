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
    void testShouldReturnDefaultGreetingForNullName() {
        //given
        Greet greet = new Greet();

        //when
        String result = greet.greet(null);

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    void testShouldReturnCapitalLetterGreetingIfNameIsCapital() {
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
        String name = "Adam,Iza";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    void testShouldGreetThreeNames() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza,Robert";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    void testShouldReturnThirdCapitalName() {
        //given
        Greet greet = new Greet();
        String name = "Adam,Iza,ROBERT";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    void testShouldReturnSecondCapitalName() {
        //given
        Greet greet = new Greet();
        String name = "Adam,IZA,Robert";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Adam i Robert, witajcie! WITAJ IZA!", result);
    }

    @Test
    void testShouldReturnFirstCapitalName() {
        //given
        Greet greet = new Greet();
        String name = "ADAM,Iza,Robert";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Iza i Robert, witajcie! WITAJ ADAM!", result);
    }

    @Test
    void testShouldReturnDefaultTextIfNameContainsDigits() {
        //given
        Greet greet = new Greet();
        String name = "AD1AM,Iza,Robert";

        //when
        String result = greet.greet(name);

        //then
        assertEquals("Z liczbami się nie witam.", result);
    }
}