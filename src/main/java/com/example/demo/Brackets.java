package com.example.demo;

public class Brackets {
    public boolean closedBrackets(String brackets) {
        char[] listOfBracket = brackets.toCharArray();
        if (listOfBracket[0] == ']') {
            return false;
        }
        if (listOfBracket.length % 2 != 0) {
            return false;
        } else {
            int counterForBracketsToClose = 0;
            for (int i = 0; i < listOfBracket.length; i++) {
                if (listOfBracket[i] == '[') counterForBracketsToClose++;
                else counterForBracketsToClose--;
            }
            if (counterForBracketsToClose == 0) return true;
            else return false;
        }
    }
}
