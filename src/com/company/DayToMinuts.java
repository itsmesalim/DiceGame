package com.company;
import java.util.Scanner;

public class DayToMinuts {
    public static void main(String[] args) {
        System.out.println("hello new class convert day to minutes");
        int days, hours, minutes, seconds;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the time in days ");
        days = scanner.nextInt();

        hours = 24*days;
        minutes = 60*hours;
        seconds = 60*minutes;

        System.out.println("time in hours = "+ hours);
        System.out.println("time in minutes = "+ minutes);
        System.out.println("time in seconds = "+ seconds);
    }
}
