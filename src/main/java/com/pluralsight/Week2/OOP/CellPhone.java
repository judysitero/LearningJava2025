package com.pluralsight.Week2.OOP;

public class CellPhone {

    //This is Encapsulation. Making them private hides the internal data from outside code. The data can only be
    // accessed or changed through the public methods (getters/setters), which allows for controlled access and data validation.
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;



    //Create the Parameterless Constructor: Define a public constructor that accepts all five values and no arguments.
    // This constructor should set the specified default values:
    public CellPhone(){
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
        //This provides one way to instantiate an object. It allows developers to create a new, empty CellPhone object
        // (new CellPhone()) and sets all the initial values to safe, default states (0 for the number, "" for the strings).
    }

//    //Defined a second constructor (our overloaded constructor) that accepts all five values as parameters.(Exercise 3)
//    //To do this faster right-click> Generate > Constructor> Ctrl-A to populate all>ok
    public CellPhone(long serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        //This is Constructor Overloading. It provides a second, more convenient way to create a fully initialized
        // CellPhone object in a single line of code.
    }

    //Create Getters and Setters: For each of the five private data members, create a pair of public methods:
    //Shortcut: right-click> Generate > Getter and Setter > Ctrl-A to populate all>ok
    //Defined the Getters (Accessors) and Setters (Mutators) for every private variable.

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
        //These public methods are the controlled interface to the private data, satisfying the principle of Encapsulation.
        // Getters allow reading data, and setters allow writing data.
    }

    public void dial(String targetNumber) {
        System.out.println(this.getOwner() + "'s phone is calling " + targetNumber);

    }
    /**
     * Overloaded dial method: accepts a CellPhone object as an argument.
     * It calls the original dial(String) method using the target phone's getter.
     */
    public void dial(CellPhone targetPhone) {
        // Get the phone number from the target object using its public getter.
        String targetNumber = targetPhone.getPhoneNumber();

        // Now call the original dial(String) method to reuse the core logic.
        this.dial(targetNumber);
    }


}
