package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String agrs[]){
        //declare variables, create scanner
        Scanner sc = new Scanner(System.in);
        String userInput = " ";
        int contestantCount = 0;
        ArrayList<String> contestants = new ArrayList<String>();

        //loop to create constant array
        while(!userInput.equals("")) {
            System.out.println("Enter a name: ");
            userInput = sc.nextLine();
            contestants.add(userInput);
            contestantCount++;
        }

        //find random winner
        int winner = (int) Math.floor(Math.random() * (contestantCount - 1 + 1) + 1);

        //output
        System.out.println("The winner is... " + contestants.get(winner) + ".");

        sc.close();
    }
}
