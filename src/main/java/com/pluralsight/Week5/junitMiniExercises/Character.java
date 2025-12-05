package com.pluralsight.Week5.junitMiniExercises;

/**
 * Theme: Character health system
 *
 * Task: Create a Character class with:
 *
 * A constructor that takes String name and int maxHp, sets current HP to max
 * A method getName() that returns the character's name
 * A method getCurrentHp() that returns current HP
 * A method getMaxHp() that returns maximum HP
 * A method isAlive() that returns true if HP > 0
 */
public class Character {
    private String name;
    private int maxHp;
    private int currentHp;

    public Character(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentHp() {
        // Fix 2: Return the variable
        return this.currentHp;
    }

    public int getMaxHp() {
        return this.maxHp;
    }

    public boolean isAlive() {
      return this.currentHp > 0;
    }

}


