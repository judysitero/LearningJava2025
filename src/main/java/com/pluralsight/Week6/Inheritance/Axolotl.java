package com.pluralsight.Week6.Inheritance;

public class Axolotl extends Animal {

    public Axolotl(String name, int age, String color, double weight) {
        super(name, age, color, weight);
    }


//    public Axolotl() {
//        super("axel", 3, "pink", 30);
//    }
//
//    //most common way to do it
//    public Axolotl(String name, int age, String color, double weight) {
//        super(name, age, color, weight);
//    }

    public void blub() {
        System.out.println(getName() + " says: blub");
    }
}
