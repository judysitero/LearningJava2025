package com.pluralsight.Week7.lambdMiniExercise;

public class Exercise3 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a - b;
        System.out.println(add.add(5, 3));
    }
}
