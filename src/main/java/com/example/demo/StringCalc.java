package com.example.demo;


import java.util.LinkedList;
import java.util.List;

public class StringCalc {

    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }

        String[] divided = new String[0];
        int sum = 0;

        if (!numbers.contains("\n")) {
            divided = numbers.split(",");
        }

        if (numbers.contains("\n")) {
            String newNumbers = "";
            if (numbers.startsWith("//")) {
                newNumbers = changeDelimiter(numbers);
            }
            if (!numbers.startsWith("//")) {
                newNumbers = numbers.replaceAll("\n", ",");
            }
            divided = newNumbers.split(",");
        }

        for (int i = 0; i < divided.length; i++) {
            if (Integer.parseInt(divided[i]) < 0) {
                throw new IllegalArgumentException("Liczby ujemne nie sąobsługiwane");
            }
            if (Integer.parseInt(divided[i]) > 1000) {
                String newI = divided[i].substring(divided[i].length() - 1);
                divided[i] = newI;
            }
            sum += Integer.parseInt(divided[i]);
        }
        return sum;
    }

    private String changeDelimiter(String numbers) {
        String newNumbers = "";
        String newDelimiter = "";
        String result = "";

        if (numbers.charAt(2) == '[') {
            //checking number of brackets
            char[] characters = new char[numbers.length() - 1];
            int numberOfOpenBrackets = 0;
            List<Integer> bracketInStringIndexes = new LinkedList<>();

            for (int i = 0; i < numbers.length() - 1; i++) {
                characters[i] = numbers.charAt(i);
                if (numbers.charAt(i) == '[') {
                    numberOfOpenBrackets++;
                    bracketInStringIndexes.add(i);
                }
                if (numbers.charAt(i) == ']') {
                    bracketInStringIndexes.add(i);
                }
            }

            if (numberOfOpenBrackets == 2) {
                String newDelimiter1 = "";
                String newDelimiter2 = "";

                if (bracketInStringIndexes.get(1) - bracketInStringIndexes.get(0) > 1
                        || bracketInStringIndexes.get(3) - bracketInStringIndexes.get(2) > 1) {
                    if (bracketInStringIndexes.get(1) - bracketInStringIndexes.get(0) > 1) {
                        newDelimiter1 = numbers.substring(bracketInStringIndexes.get(0)+1, bracketInStringIndexes.get(1));
                    }
                    if (bracketInStringIndexes.get(1) - bracketInStringIndexes.get(0) == 1) {
                        newDelimiter1 = String.valueOf(numbers.charAt(bracketInStringIndexes.get(0) + 1));
                    }
                    if (bracketInStringIndexes.get(3) - bracketInStringIndexes.get(2) > 1) {
                        newDelimiter2 = numbers.substring(bracketInStringIndexes.get(2) + 1, bracketInStringIndexes.get(3));
                    }
                    if (bracketInStringIndexes.get(3) - bracketInStringIndexes.get(2) == 1) {
                        newDelimiter2 = String.valueOf(numbers.charAt(bracketInStringIndexes.get(2) + 1));
                    }
                    newNumbers = numbers.substring(bracketInStringIndexes.get(3)+2);
                    String numbersStage1 = newNumbers.replaceAll(newDelimiter1, ",");
                    result = numbersStage1.replaceAll(newDelimiter2, ",");
                }
                if (bracketInStringIndexes.get(1) - bracketInStringIndexes.get(0) == 1
                        && bracketInStringIndexes.get(3) - bracketInStringIndexes.get(2) == 1) {
                    newNumbers = numbers.substring(10);
                    newDelimiter1 = String.valueOf(characters[3]);
                    newDelimiter2 = String.valueOf(characters[7]);

                    String numbersStage1 = newNumbers.replaceAll(newDelimiter1, ",");
                    result = numbersStage1.replaceAll(newDelimiter2, ",");
                }
            }
            if (numberOfOpenBrackets == 1) {
                int delimiterEnd = numbers.indexOf(']');
                newNumbers = numbers.substring(delimiterEnd + 2);
                newDelimiter = numbers.substring(3, delimiterEnd);

                //tutaj próbowałem zmianić by kod działał z meta znakami = *

                if (newDelimiter.contains("*") || newDelimiter.contains(".") || newDelimiter.contains("^")) {
                    String delimiterTwo = "";
                    for (int i = 0; i < newDelimiter.length(); i++) {
                        if (newDelimiter.charAt(i) == '*' || newDelimiter.charAt(i) == '.' || newDelimiter.charAt(i) == '^')
                            delimiterTwo += "//";
                        delimiterTwo += newDelimiter.charAt(i);
                    }
                    newDelimiter = delimiterTwo;
                }
                result = newNumbers.replaceAll(newDelimiter, ",");
            }
        }
            if (numbers.charAt(2) != '[') {
                newNumbers = numbers.substring(4);
                newDelimiter = String.valueOf(numbers.charAt(2));
                result = newNumbers.replaceAll(newDelimiter, ",");
            }

        return result;
    }
}

