package com.company;

public class UsingSwitch {
    public static void main(String[] args) {
        String command = "Withdraw";
        int balance = 1000;
        int amount = 100;

        switch (command) {
            case "Withdraw":
                balance -= amount;
                System.out.println("Your balance used to be 1000, and now it is " + balance + ".");
                break;
            case "Deposit":
                balance += amount;
                System.out.println("Your balance used to be 1000, and now it is " + balance + ".");
                break;
            default:
                System.out.println("Invalid command.");
        }
    }
}
