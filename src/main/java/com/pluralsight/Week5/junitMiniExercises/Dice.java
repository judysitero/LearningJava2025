package com.pluralsight.Week5.junitMiniExercises;

import java.util.Random;

public class Dice {
    private int lastRoll;
    private Random random;

    //A constructor that takes no parameters
    public Dice() {
        this.lastRoll = 0;
        this.random = new Random();
    }

    //A method getLastRoll() that returns the last rolled number (initially 0)
    public int getLastRoll() {
        return this.lastRoll;
    }
    //A method roll() that returns a random number between 1-6 and stores it
    public int roll() {
        int result = random.nextInt(6) + 1;
        this.lastRoll = result;
        return result;

    }

}
