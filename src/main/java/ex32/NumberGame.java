package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class NumberGame {

    public static int level1(){
        int number = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        String temp;
        int userGuess = 0, guessCounter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("I have my number. What's your guess?");
        while(userGuess != number){
            if(sc.hasNextInt()){
                userGuess = sc.nextInt();
                guessCounter++;
                if(userGuess > number)
                    System.out.println("Too high. Guess again:");
                else if(userGuess < number)
                    System.out.println("Too low. Guess again:");
            }
            else{
                System.out.println("Enter a valid input:");
                guessCounter++;
                temp = sc.nextLine();
            }
        }

        return guessCounter;
    }

    public static int level2(){
        int number = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
        int userGuess = 0, guessCounter = 0;
        String temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("I have my number. What's your guess?");
        while(userGuess != number){
            if(sc.hasNextInt()){
                userGuess = sc.nextInt();
                guessCounter++;
                if(userGuess > number)
                    System.out.println("Too high. Guess again:");
                else if(userGuess < number)
                    System.out.println("Too low. Guess again:");
            }
            else{
                System.out.println("Enter a valid input:");
                guessCounter++;
                temp = sc.nextLine();
            }
        }

        return guessCounter;
    }

    public static int level3(){
        int number = (int) Math.floor(Math.random() * (1000 - 1 + 1) + 1);
        int userGuess = 0, guessCounter = 0;
        String temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("I have my number. What's your guess?");
        while(userGuess != number){
            if(sc.hasNextInt()){
                userGuess = sc.nextInt();
                guessCounter++;
                if(userGuess > number)
                    System.out.println("Too high. Guess again:");
                else if(userGuess < number)
                    System.out.println("Too low. Guess again:");
            }
            else{
                System.out.println("Enter a valid input:");
                guessCounter++;
                temp = sc.nextLine();
            }
        }

        return guessCounter;
    }

}
