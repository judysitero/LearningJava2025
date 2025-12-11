package com.pluralsight.Week1;

public class DoubleTrouble {
//    This can be found in: https://github.com/BrightBoost/learningjava/blob/main/exercises/week1/recapTuesday.md
//    CHALLENGE A:

    public static void main(String[] args) {
        double floatNum = 2.64;
        double floatNum2 = floatNum* 2;
        System.out.println("original:" +  floatNum);
        System.out.println("double value:" + floatNum2);

// CHALLENGE B:

        String myName = "Judy";
        int myNumber = 15;
        System.out.println("My name is " + myName + " and my favorite number is " + myNumber );

//CHALLENGE C:

//        int randomNr = (int) Math.round(Math.random() * 10); this is another way

        long randomNr = Math.round(Math.random() * 10);
        System.out.println(randomNr);

        randomNr = randomNr + 5;
        System.out.println(randomNr);

//   BONUS 1:Take a number of hours (e.g. 27) and calculate what hour that would be on a 24-hour clock. Use % 24.


    int hours = 27;
    int hoursIn24 = hours % 24;
    System.out.println("27 hours later: " + hoursIn24 + " o'clock");

/*  BONUS 2:Take a number of minutes (e.g. 130) and figure out how many full hours and leftover minutes that is.
Ex: 130 minutes = 2 hours and 10 minutes
 */
        int minutes = 130;

        int hour = minutes / 60;

        int minutesLeftOver = minutes % 60;

        System.out.println(hour);
        System.out.println(minutesLeftOver);
        System.out.println(minutes + " minutes = " + hour + " hours and " + minutesLeftOver + " minutes");





/* BONUS 3:  Here’s how you could turn that into a step-by-step exercise for your students. It starts very basic and
nudges them towards the final solution with nrhours, nrminutes, and minutestoadd.
You are given a starting time and some extra minutes to add. Write a program that calculates the final time on a 24-hour clock.

 */
//        Step 1: Start with variables
        int nrHours = 3;
        int nrMinutes =23;
        int minutesToAdd = 183;

        System.out.println("Starting time: " + nrHours + ":" + nrMinutes);
        System.out.println("Minutes to add: " + minutesToAdd);

//        Step 3: Find leftover minutes
        int totalMinutes = nrMinutes + minutesToAdd; // 23 + 183

        int newMinutes = totalMinutes % 60; //206 % 60 =26

        int hoursGained = totalMinutes / 60; // 206 / 60 =3

        int rawNewHour = nrHours + hoursGained; // 3 + 3 = 6

//        Step 2 find the new hours

        int newHours = rawNewHour % 24; // 6 % 24 = 6

//        Step 4: print the final time


        String formattedMinutes = String.format("%02d", newMinutes); //"%02d" forces the integer value of newMinutes
        // to always be two digits long, padding it with a leading zero if it is a single digi

        System.out.println("Final time: " + newHours + ":" + formattedMinutes);













//        long randomNr = Math.round(Math.random() * 100);
//        System.out.println(randomNr);
//        randomNr = randomNr - 10;
//        System.out.println(randomNr);

//        int hours = 29;
//        int hoursOn24Clock = 29 %









    }
}
