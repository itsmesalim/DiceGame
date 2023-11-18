package com.company;
import java.util.Scanner;
public class TimeToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("convert time to seconds ");

        int time, hours, minutes, seconds;
        System.out.println("enter time ");
        time = scanner.nextInt();

        hours = 24*time;
        minutes = 60*hours;
        seconds = 60*minutes;

        System.out.println("hours = "+ hours);
        System.out.println("minutes = "+ minutes);
        System.out.println("seconds = "+ seconds);
    }
}
