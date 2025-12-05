package com.pluralsight.Week5.miniExercisesStatic;

public class CatApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Clawdia");
        System.out.println(Cat.catCount);
        Cat cat2 = new Cat("Cleocatra");
        System.out.println(Cat.catCount);
        Cat cat3 = new Cat("Dolly Purrton");
        System.out.println(Cat.catCount);

    }
}
