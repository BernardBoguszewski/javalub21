package com.example.demo;


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
            int delimiterEnd = numbers.indexOf(']');
            newNumbers = numbers.substring(delimiterEnd + 2);
            newDelimiter = numbers.substring(3, delimiterEnd);

            //tutaj próbowałem zmianić by kod działał z meta znakami = *

            if(newDelimiter.contains("*") || newDelimiter.contains(".") || newDelimiter.contains("^")){
                String delimiterTwo = "";
                for (int i = 0; i < newDelimiter.length(); i++) {
                    if(newDelimiter.charAt(i) == '*'|| newDelimiter.charAt(i) == '.' || newDelimiter.charAt(i) == '^')
                    delimiterTwo += "//";
                delimiterTwo += newDelimiter.charAt(i);
                }
                newDelimiter = delimiterTwo;
            }


            result = newNumbers.replaceAll(newDelimiter, ",");

        }
        if(numbers.charAt(2) != '[') {
            newNumbers = numbers.substring(4);
            newDelimiter = String.valueOf(numbers.charAt(2));
            result = newNumbers.replaceAll(newDelimiter, ",");
        }

        return result;
    }
}
