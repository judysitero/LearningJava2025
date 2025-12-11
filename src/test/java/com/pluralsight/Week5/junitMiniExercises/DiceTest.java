package com.pluralsight.Week5.junitMiniExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Requirements:
 *
 * Test that a new dice has getLastRoll() returning 0
 * Test that after calling roll(), getLastRoll() returns a number between 1 and 6
 * Use assertTrue() to verify the rolled number is within range
 */

class DiceTest {
    private Dice dice;

    @BeforeEach
    void init() {
        dice = new Dice();
    }

    @Test
    void getLastRoll_newDice() {
        // arrange
        int expectedRoll = 0;

        // act
        int lastRoll = dice.getLastRoll();

        // assert
        assertEquals(expectedRoll, lastRoll);
    }

    @Test
    void roll_returnsValidNumber() {
        // arrange
        // (no arrangement needed)

        // act
        int rolled = dice.roll();

        // assert
        assertTrue(rolled >= 1 && rolled <= 6);
    }

    @Test
    void getLastRoll_afterRoll() {
        // arrange
        dice.roll();

        // act
        int lastRoll = dice.getLastRoll();

        // assert
        assertTrue(lastRoll >= 1 && lastRoll <= 6);
    }
}