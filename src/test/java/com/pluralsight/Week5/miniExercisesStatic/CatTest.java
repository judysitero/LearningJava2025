package com.pluralsight.Week5.miniExercisesStatic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void testCatCounter() {
        // arrange (what am I expecting)
        int expectedCatCount = 2;

        // act (in my act I am creating two cats)
        Cat c1 = new Cat("Leo");
        Cat c2 = new Cat("Mimi");

        // assert
        assertEquals(expectedCatCount, Cat.catCount);

    }

}