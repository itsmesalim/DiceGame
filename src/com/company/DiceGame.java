package com.company;
import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Dice Game!");

        int diceRoll = rand.nextInt(6) + 1;

        System.out.print("Guess the number between 1 and 6: ");
        int guess = input.nextInt();

        if (guess == diceRoll) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry, you lost. The number was " + diceRoll);
        }
    }
}
