package com.example.demo;

import java.time.LocalTime;

public class TimeCalc {
    public String calcWorkTime(String startTime, String endTime, String breakTime) {
        LocalTime endLocalTime = LocalTime.parse(endTime);

        String[] splitStartTime = startTime.split(":");
        long startHour = Long.parseLong(splitStartTime[0]);
        long startMinutes = Long.parseLong(splitStartTime[1]);

        String[] splitBreakTime = breakTime.split(":");
        long breakHour = Long.parseLong(splitBreakTime[0]);
        long breakMinutes = Long.parseLong(splitBreakTime[1]);

        return endLocalTime
                .minusHours(startHour)
                .minusMinutes(startMinutes)
                .minusHours(breakHour)
                .minusMinutes(breakMinutes)
                .toString();
    }
}
