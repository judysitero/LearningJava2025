package com.pluralsight;

public class LiteralValues {
    public static void main(String[] args) {
        int i = 101;
        long j = 123456789012L;
        System.out.println(j);
        long newLong = 123;
        double d = 5.56;
        float f = 5.56f;

        long nr = 123_456_789_012L;
        int otherNr = (int) nr; // casting from long int
        System.out.println(otherNr);

        int x = 5;
        int y;
        x++;
        ++x;
        y = ++x;

        System.out.println(y);





    }
}
