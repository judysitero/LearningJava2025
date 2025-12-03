package com.pluralsight.Week7.Portfolio;//package com.pluralsight.Week7;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance += amount;
    }

    @Override
    public  double getValue() {
        return balance;
    }
}

