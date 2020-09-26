package com.example.codingBat;

public class missingChar {

    public String missingChar(String str, int n) {
        char[] array = new char[str.length()];
        for(int i=0; i < str.length(); i++){
          array[i] = str.charAt(i);
        }
        String result ="";


        for(int j=0; j < str.length(); j++){
            if(j != n) {
                result += array[j];
            }
        }
        return result;
    }
}
