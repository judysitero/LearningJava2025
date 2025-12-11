package com.pluralsight.Week7.lambdMiniExercise;

public class Exercise1 {
    public static void main(String[] args) {
        Hello hello = () -> System.out.println(" Hi, from Java! ");
        hello.sayHello();
    }
}
