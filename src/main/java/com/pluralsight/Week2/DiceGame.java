package com.pluralsight.Week2;

public class DiceGame {
    public static void main(String[] args) {
        // Instantiate the Dice object (applying OOP/Classes)
       Dice dice = new Dice();

        // Variables for the outcome of each roll
        int roll1, roll2;

        // Counters for tracking specific sums (Applying Variables/Data Types)
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // Roll each die by calling the object's method
        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            // Display the result for the current iteration
            System.out.printf("Roll %d: %d + %d = %d\n", (i + 1), roll1, roll2, sum );

            // --- Conditionals (The core counting logic) ---
            // Use if/else if to determine the sum and increment the corresponding counter.
            
            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
            System.out.println("\n--- Simulation Complete ---");
            System.out.printf("Total rolls of 2: %d\n", twoCounter);
            System.out.printf("Total rolls of 4: %d\n", fourCounter);
            System.out.printf("Total rolls of 6: %d\n", sixCounter);
            System.out.printf("Total rolls of 7: %d\n", sevenCounter);
        }

    }
}
