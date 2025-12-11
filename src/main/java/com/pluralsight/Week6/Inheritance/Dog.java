package com.pluralsight.Week6.Inheritance;

public class Dog extends Animal {

    public Dog(String name, int age, String color, double weight) {
        super(name, age, color, weight);
    }

    public void bark() {
        System.out.println(getName() + " says: WOOF");
    }
}
