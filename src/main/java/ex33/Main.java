package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        //declare variables, create scanner, and declare class variable
        String userInput;
        Scanner sc = new Scanner(System.in);
        magic8Ball m = new magic8Ball();

        //create random int
        int rand_int = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);

        //prompt user and scan inputs
        System.out.println("What's your question?");
        userInput = sc.nextLine();

        //call answer function within class
        m.magicAnswer(rand_int);

        sc.close();
    }
}
