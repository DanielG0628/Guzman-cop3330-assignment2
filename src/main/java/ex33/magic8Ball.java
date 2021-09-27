package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class magic8Ball {

    //function to answer user's input
    public static void magicAnswer(int rand){
        if (rand == 1)
            System.out.println("Yes.");
        else if (rand == 2)
            System.out.println("No.");
        else if (rand == 3)
            System.out.println("Maybe.");
        else
            System.out.println("Ask again later.");
    }

}
