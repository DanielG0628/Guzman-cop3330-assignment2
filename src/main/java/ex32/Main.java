package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //declare variables, create scanner, and declare class variable
        Scanner sc = new Scanner(System.in);
        int userLevel, userGuess;
        String replay = "y";
        NumberGame game = new NumberGame();

        System.out.println("Let's play Guess the Number!\n");

        while(replay.equals("y")){
            System.out.println("Enter the difficulty level (1, 2, or 3)");
            userLevel = sc.nextInt();

            if(userLevel == 1)
                userGuess = game.level1();
            else if(userLevel == 2)
                userGuess = game.level2();
            else if(userLevel == 3)
                userGuess = game.level3();
            else
                continue;

            System.out.println("You got it in " + userGuess + " guesses!\n");

            System.out.println("Do you wish to play again (y/n)?");
            replay = sc.next();
        }

        sc.close();
    }
}
