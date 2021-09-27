package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class Main {
    public static void main(String args[]){
        //declare variables
        int i, j;

        //create loop to create multiplication table
        for (i = 1; i <= 12; ++i) {
            for (j = 1; j <= 12; ++j) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}

