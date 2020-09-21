package com.example.demo;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }

        if (numbers.contains("-")) {
            throw new IllegalArgumentException("Liczby ujemne nie sa obslugiwane");
        }
        if (numbers.startsWith("//")) {
            String[] separate = numbers.split("\n");
            String delimiter = separate[0].replaceAll("//", "");
            String[] splitNumbers = separate[1].split(delimiter);
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
                i++;
            } else {
                result[i] = number;
                i++;
            }
        }
        return result;
    }
}
