package com.pluralsight.Week7.lambdMiniExercise;

public class Exercise2 {
    public static void main(String[] args) {
        Greeter greeter = name -> System.out.println("Hi " + name + ", have a great day!");
        greeter.greet("Alice");
    }
}
