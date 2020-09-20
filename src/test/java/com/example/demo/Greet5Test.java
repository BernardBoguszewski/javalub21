package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Greet5Test {

    @Test
    void testShouldReturnGreetingForAllName() {
        //given
        Greet5 greet5 = new Greet5();
        String name = "Adam,Iza,Robert";

        //when
        String result = greet5.greet5(name);

        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }
}