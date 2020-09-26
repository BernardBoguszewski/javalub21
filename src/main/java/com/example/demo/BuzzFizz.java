package com.example.demo;

public class BuzzFizz {

    public String fizzBuzzWhizz(Integer digit){
        if(digit == null){
            return "Nie dla null!";
        }
        if(digit%3 == 0){
            if(digit == 3){
                return "FizzWhizz";
            }
            if(digit%5 == 0){
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if(digit%5 == 0){
            if(digit == 5){
                return "BuzzWhizz";
            }
            if(digit % 3 == 0){
                return "FizzBuzz";
            }
            return "Buzz";
        }
        if(isPrime(digit)){
            return "Whizz";
        }

        return null;
    }

    private boolean isPrime(Integer digit) {
        boolean isPrime = true;
        for (int i = 2; i < digit; i++) {
            if(digit % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
