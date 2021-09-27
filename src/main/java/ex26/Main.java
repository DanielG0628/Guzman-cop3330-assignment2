package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //declare variables, scanner, and class variable
        double n, i, APR, b, p;
        Scanner sc = new Scanner(System.in);
        PaymentCalculator months = new PaymentCalculator();

        //prompt user and scan inputs
        System.out.println("What is your balance?");
        b = sc.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        APR =  sc.nextDouble();
        System.out.println("What is the monthly payment you can make?");
        p = sc.nextDouble();

        //call class function to calculate months
        n = months.calculateMonthsUntilPaidOff(b, APR ,p);

        //output
        System.out.println("It will take you " + (int) n + " months to pay off this card.");

        sc.close();
    }
}
