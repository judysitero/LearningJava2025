package com.pluralsight.Week7.lambdaexplained;

import com.pluralsight.Week7.lambdMiniExercise.RandomPrinter;

public class App {
    public static void main(String[] args) {
        RandomPrinter randomPrinter = () -> System.out.println(Math.round(Math.random() * 10));
        randomPrinter.printRandom();

    }
}
