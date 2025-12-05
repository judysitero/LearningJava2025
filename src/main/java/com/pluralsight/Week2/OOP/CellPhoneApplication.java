//package com.pluralsight.Week2.OOP;
//
//import java.util.Scanner;
//
//import static jdk.internal.org.jline.keymap.KeyMap.display;
//
//public class CellPhoneApplication {
//    public static void main(String[] args) {
//        //The first thing you need in your main method is a way to get input from the user.
//        Scanner scanner = new Scanner(System.in);
//
//        // Declare a variable of type CellPhone and instantiate the object.
//        // This calls the default constructor (CellPhone()) you wrote in Step 1.
//        CellPhone phone = new CellPhone();
//
//        //Now you'll prompt the user for each piece of information and immediately use a setter method to pass the
//        // input value into the new phone object.
//        System.out.println("What is the serial number?");
//        long serialNum = scanner.nextLong();
//        phone.setSerialNumber(serialNum);
//        scanner.nextLine();
//
//        System.out.println("What model is the phone?");
//        String model = scanner.nextLine();
//        phone.setModel(model);
//
//
//        System.out.println("Who is the carrier?");
//        String carrier = scanner.nextLine();
//        phone.setCarrier(carrier);
//
//        System.out.println("What is the phone number?");
//        String phoneNum = scanner.nextLine();
//        phone.setPhoneNumber(phoneNum);
//
//
//        System.out.println("Who is the owner of the phone?");
//        String owner = scanner.nextLine();
//        phone.setOwner(owner);
//
//        // --- Exercise 2 Requirement: Create a second CellPhone object ---
//        // 2. Create the second object
//
//        CellPhone phone2 = new CellPhone(34234, "s22", "t-mobile", "088234234234", "Maaike");
//
//
//        // 3. Display both objects using the new display method
//        display(phone);
//        display(phone2);
//
//        // --- Exercise 2 Requirement: Inter-Object Communication ---
//        // 4. Have the first phone dial the second one
//        // We call the dial() method on 'phone' and pass 'phone2's number (via its getter).
//        System.out.println("\n--- Testing dial(String targetNumber) ---");
//        phone.dial(phone2.getPhoneNumber());
//
//        // --- Exercise 3 Requirement: Call the Overloaded Method ---
//        // 5. Have phone2 dial phone using the OVERLOADED method
//        // You pass the entire object 'phone' to the dial method.
//        System.out.println("\n--- Testing dial(CellPhone targetPhone) ---");
//        phone2.dial(phone);
//
//        scanner.close();
//    }
//
//    public static void display(CellPhone phone) {
////        System.out.printf("\n--- %s's Phone ---\n", cell.getOwner());
////        System.out.printf("Model: %s\n", cell.getModel());
////        System.out.printf("Carrier: %s\n", cell.getCarrier());
////        System.out.printf("Phone Number: %s\n", cell.getPhoneNumber());
////        System.out.printf("Serial Number: %d\n", cell.getSerialNumber());
//
//        System.out.println("\n----Cell Phone Details---");
//        System.out.println("Serial Number: " + phone.getSerialNumber());
//        System.out.println("Model: " + phone.getModel());
//        System.out.println("Carrier: " + phone.getCarrier());
//        System.out.println("Phone Number: " + phone.getPhoneNumber());
//        System.out.println("Owner: " + phone.getOwner());
//
//
//    }
//
//}
