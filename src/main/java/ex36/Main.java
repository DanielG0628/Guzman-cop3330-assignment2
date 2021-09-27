package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //declare variables, create scanner, and declare class variable
        Scanner sc = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        Calculations c = new Calculations();
        String temp = " ";

        //prompt user and scan inputs
        System.out.println("Enter a number: ");
        while(!temp.equals("done")){
            if(sc.hasNextInt()){
                System.out.println("Enter a number: ");
                numbers.add(sc.nextLine());
            }
            else{
                temp = sc.nextLine();
            }
        }

        //print out user input
        System.out.println("Numbers: ");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        //output and function calls
        System.out.println("The average is " + c.average(numbers) + ".");
        System.out.println("The minimum is " + c.min(numbers) + ".");
        System.out.println("The maximum is " + c.max(numbers) + ".");
        System.out.println("The standard deviation is " + Math.round((c.std(numbers)*100)/100) + ".");

        sc.close();
    }
}
