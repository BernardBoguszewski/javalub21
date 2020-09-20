package com.example.demo;

public class Brackets {
    public boolean closedBrackets(String brackets) {
        char[] listOfBracket = brackets.toCharArray();
        int counterForBracketsToClose = 0;
        for (char bracket : listOfBracket) {
            if (bracket == '[') counterForBracketsToClose++;
            else counterForBracketsToClose--;
            if (counterForBracketsToClose < 0) break;
        }
        return counterForBracketsToClose == 0;
    }
}
