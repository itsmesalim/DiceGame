package com.company;
import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main(String args[])
    {
        System.out.print("Enter the number of Dice to be rolled: ");
        // Initializing Scanner object to read input from user
        Scanner scan = new Scanner(System.in);
        // Reading the number of Dices to be rolled
        int numberOfDice = scan.nextInt();
      /* Creating Random class object to generate
      random numbers */
        Random randomNumber = new Random();
        for(int i=0;i < numberOfDice; i++)
        {
            System.out.print(randomNumber.nextInt(4)+1);
            System.out.print(" \n");
        }


    }
}
