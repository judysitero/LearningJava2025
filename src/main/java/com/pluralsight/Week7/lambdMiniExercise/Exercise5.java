package com.pluralsight.Week7.lambdMiniExercise;

public class Exercise5 {
    public static void main(String[] args) {
        SquareCalculator squareCalculator = x -> {
            System.out.println("calculating....");
            return x * x;
        };

        int result = squareCalculator.square(5);
        System.out.println(result);

        // # 15

        String[] names = {"name1", "name2", "name3"};
        NamePrinter namePrinter = s  -> System.out.println("Name: " + s);
        for(String name : names) {
            namePrinter.print(name);

        }



    }
}
