package com.pluralsight.Week5.junitMiniExercises;

import java.util.Random;

/**
 * Theme: Flipping a coin
 *
 * Task: Create a Coin class with:
 *
 * A constructor that takes no parameters
 * A method flip() that returns either "HEADS" or "TAILS" randomly
 * A method getLastFlip() that returns the last flip result (initially null)
 */
public class Coin {
    private String lastFlip;
    private Random random;

    public Coin() {
        this.lastFlip = null;
        this.random = new Random();
    }

    public String getLastFlip() {
        return lastFlip;
    }

    public String flip() {
        boolean isHeads = random.nextBoolean();
        if (isHeads) {
            this.lastFlip = "HEADS";
        } else {
            this.lastFlip = "TAILS";
        }
        return this.lastFlip;
    }
}
