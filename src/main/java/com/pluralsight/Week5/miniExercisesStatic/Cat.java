package com.pluralsight.Week5.miniExercisesStatic;

/**
 * Goal: See how static makes a variable shared across all objects.
 *
 * Steps:
 *
 * Create a class Cat with:
 *
 * A non-static field name
 * A static field catCount
 * In the constructor, increment catCount every time a new Cat is created.

 */

public class Cat {
    //A non-static field name
    private String name;
    // A static field catCount
    public static int catCount;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }
}
