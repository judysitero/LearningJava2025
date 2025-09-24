package com.pluralsight;

public class ExamplesWithMathClass {
    public static void main(String[] args) {
        int i = 9;
        int j = 7;

        int minValue = Math.min(i, j);
        System.out.println(minValue);

        int maxValue = Math.max(i, j);
        System.out.println(maxValue);

        double d = 7.6; // -7.6;
        System.out.println(Math.floor(d)); // rounds down to the nearest whole number
        System.out.println(Math.ceil(d)); // rounds up to the nearest whole number
        System.out.println(Math.round(d)); // rounds to the nearest whole number based on a common rounding rule: round half up. if decimal part is .5 or greater, it rounds up. If less than .5, it rounds down

        double randomValue = Math.random();
        System.out.println(randomValue);

        // I want a number between 0 and 100
        int randomNr = (int) (Math.random() * 100);
        System.out.println(randomNr);

//        int randomNr = (int) Math.round((Math.random() * 100));
//        System.out.println(randomNr);

    }
}
