package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        int t = 0, j;
        addInput a = new addInput();
        Scanner sc = new Scanner(System.in);

        //for loop to ask user for integers and add them up
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            j = sc.nextInt();
            t = a.sum(j, t);
        }

        //output
        System.out.println("The total is " + t + ".");

        sc.close();
    }
}
