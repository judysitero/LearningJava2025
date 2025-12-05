package com.pluralsight.Week5.junitMiniExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Requirements:
 *
 * Test that a new character has full HP
 * Test that isAlive() returns true for a new character
 * Test that getName() returns the correct name
 */
class CharacterTest {
    private Character character;
    @BeforeEach
    void init() {
        character = new Character("judy", 100);

    }

    @Test
    void isALive() {
        // arrange

        // act
        boolean isAliveStatus = character.isAlive();

        // assert
        assertTrue(isAliveStatus);
    }

    @Test
    void getName() {
        // arrange
        String expectedName = "judy";

        // act
        String actualName = character.getName();

        // assert
        assertEquals(expectedName, actualName);
    }
}