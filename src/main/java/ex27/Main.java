package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String agrs[]){
        //declare variable, scanner, and class function
        String firstName, lastName, ZIP, eID;
        Scanner sc = new Scanner(System.in);
        Validate v = new Validate();

        //prompt user and scan inputs
        System.out.println("Enter the first name:");
        firstName = sc.nextLine();
        System.out.println("Enter the last name:");
        lastName = sc.nextLine();
        System.out.println("Enter the ZIP code:");
        ZIP = sc.nextLine();
        System.out.println("Enter the employee ID:");
        eID = sc.nextLine();

        //call validate function
        v.validateInput(firstName, lastName, ZIP, eID);

        sc.close();
    }
}
