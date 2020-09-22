package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }
        if (numbers.contains("-")) {
            throw new IllegalArgumentException("Liczby ujemne nie sa obslugiwane");
        }
        if (numbers.startsWith("//")) {
            Pattern pattern = Pattern.compile("\\[[\\S]{1,5}\\]+");
            Matcher matcher = pattern.matcher(numbers);
            String[] separate = numbers.split("\n");
            String delimiter = separate[0].replaceAll("//", "");
            String[] splitNumbers;
            if (matcher.find()) {
                String[] delimiters = delimiter
                        .replaceAll("\\[", "")
                        .replaceAll("\\]", ",")
                        .replaceAll(".$", "")
                        .split(",");
                String cache = separate[1];
                for (String s : delimiters) {
                    cache = cache.replaceAll("(" + s + ")", ",");
                }
                String[] splitResult = cache.split(",");
                return addNumbers(moreThanThousand(splitResult));
            }
            splitNumbers = separate[1].split(delimiter);
            return addNumbers(moreThanThousand(splitNumbers));
        }
        String[] split = numbers.split(",|\n");
        return addNumbers(moreThanThousand(split));
    }

    private int addNumbers(String[] split) {
        int result = 0;
        for (String number : split) {
            result += Integer.parseInt(number);
        }
        return result;
    }

    private String[] moreThanThousand(String[] numbers) {
        String[] result = new String[numbers.length];
        int i = 0;
        for (String number : numbers) {
            if (Integer.parseInt(number) > 1000) {
                int n = Integer.parseInt(number);
                result[i] = String.valueOf(n % 1000);
            } else {
                result[i] = number;
            }
            i++;
        }
        return result;
    }
}
