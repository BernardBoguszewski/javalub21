package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalcTest {

    @Test
    void testShouldCalculateWorkTimeWithoutBreaks() {
        //given
        TimeCalc timeCalc = new TimeCalc();
        String startTime = "08:42";
        String endTime = "16:20";
        String breakTime = "00:30";
        //when
        String result = timeCalc.calcWorkTime(startTime, endTime, breakTime);
        //then
        assertEquals("07:08", result);
    }
}