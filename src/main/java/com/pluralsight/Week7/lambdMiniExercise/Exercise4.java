package com.pluralsight.Week7.lambdMiniExercise;

public class Exercise4 {
    public static void main(String[] args) {
        Multiplier multiply = (a, b) -> a * b;
        System.out.println(multiply.multiply(5, 3));
    }
}
