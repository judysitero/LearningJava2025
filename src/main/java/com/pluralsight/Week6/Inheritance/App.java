package com.pluralsight.Week6.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Action", 2, "blue", 50);
        dog.bark();

        Dog dog1 = new Dog("Woody", 2, "blue", 50);
        dog.bark();

        Cat cat = new Cat("Leo", 2, "blue", 50);
        cat.meow();

        Animal animal = new Animal("Axel", 2, "blue", 50);
        animal.setName("Axel");

        Axolotl axolotl = new Axolotl("Axel", 2, "blue", 50);
        axolotl.blub();

        // polymorphism
//
//        Animal a = new Cat("Clawdia", 1, "black", 6);
//        a = new Dog("Action", 5, "beige", 100);

        //instanceof

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(dog1);
        animals.add(cat);
        animals.add(animal);
        animals.add(axolotl);


        // Side Note: a method available on all objects
//        System.out.println(dog.getClass());
        // or this way
        System.out.println(dog.getClass().getSimpleName());


        System.out.println("**************************");

        for(Animal a : animals) {
            if(a instanceof Cat c) {
                c.meow();
            } else if(a instanceof Dog d) {
                d.bark();
            } else if(a instanceof Axolotl ax) {
                ax.blub();
            }
        }


    }
}
