package com.pluralsight.Week2;

import java.util.Random;

public class Dice {
    // We use Random to generate random numbers.
    private Random random = new Random();

    /**
     * Generates a random number between 1 and 6 (inclusive).
     * Algorithm: (random() * maxValue) + minValue
     */

    public int roll() {
        int minValue = 1;
        int maxValue = 6;

        // This is the calculation: random.nextInt(max - min + 1) + min
        // which gives a number from 1 to 6.
        return random.nextInt(maxValue) + minValue;
    }

}
