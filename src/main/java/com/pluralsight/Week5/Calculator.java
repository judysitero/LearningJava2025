package com.pluralsight.Week5;

public class Calculator {
    public double add(double nr1, double nr2) {
        return nr1 +nr2;
    }

    public double subtract(double nr1, double nr2) {
        return nr1 - nr2;
    }

    public double multiply(double nr1, double nr2) {
        return nr1 * nr2;
    }

    public double divide(double nr1, double nr2) {
       if(nr2 == 0){
           throw new ArithmeticException("Sorry, can't divided by 0. ");
       }
       return nr1/ nr2;
    }
}
