package com.pluralsight.Week5.junitMiniExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Requirements:
 *
 * Test that a new coin has getLastFlip() returning null
 * Test that after flipping, getLastFlip() is either "HEADS" or "TAILS"
 * Test using assertTrue() with OR condition
 */
class CoinTest {
    private Coin coin;

    @BeforeEach
    void init() {
        coin = new Coin();
    }

    @Test
    void getLastFlip() {
        // arrange

        // act
        String actualResult = coin.getLastFlip();

        // assert
        assertNull(actualResult);
    }

    @Test
    void flip() {
        String expectedHeads = "HEADS";
        String expectedTails = "TAILS";

        coin.flip();

        String actualResult = coin.getLastFlip();

        assertTrue(actualResult.equals(expectedHeads) || actualResult.equals(expectedTails), actualResult);
    }
}