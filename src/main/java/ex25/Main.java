package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //declare variables, scanner, and a class variable
        String userPassword;
        Scanner sc = new Scanner(System.in);
        password p = new password();

        //prompt user and scan inputs
        System.out.println("Enter a password:");
        userPassword = sc.nextLine();

        //take return value from the password class function and output
        if(p.passwordValidator(userPassword) == 1)
            System.out.println("The password '" + userPassword + "' is a very weak password.");
        else if(p.passwordValidator(userPassword) == 2)
            System.out.println("The password '" + userPassword + "' is a weak password.");
        else if(p.passwordValidator(userPassword) == 3)
            System.out.println("The password '" + userPassword + "' is a strong password.");
        else if(p.passwordValidator(userPassword) == 4)
            System.out.println("The password '" + userPassword + "' is a very strong password");

        sc.close();
    }
}
