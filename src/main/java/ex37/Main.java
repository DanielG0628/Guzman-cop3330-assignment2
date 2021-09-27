package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        //declare variables and create scanner
        Scanner sc = new Scanner(System.in);
        int specialCharCount, numberCount, minLength, numOfLetters;
        Random r = new Random();
        ArrayList<String> password = new ArrayList<>();
        char[] specialChars = new char[]{'~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '='};

        //prompt user and scan inputs
        System.out.println("What's the minimum length?");
        minLength = sc.nextInt();
        System.out.println("How many special characters?");
        specialCharCount = sc.nextInt();;
        System.out.println("How many numbers? ");
        numberCount= sc.nextInt();
        numOfLetters = minLength - (specialCharCount + numberCount);

        //for loop to create random password\
        for(int i = 0; i < minLength; i++) {
            int rand = (int)Math.floor(Math.random() * (3-1+1)+1);
            if((rand == 1) && (numOfLetters != 0)) { // picking a letter
                char c = (char)(r.nextInt(26) + 'a');
                String s = String.valueOf(c);
                password.add(s);
                numOfLetters--;
            }
            else if((rand == 2) && (specialCharCount != 0)) { // picking a special character
                int randS = (int)Math.floor(Math.random() * (specialChars.length+1)+0);
                String temp = String.valueOf(specialChars[randS]);
                password.add(temp);
                specialCharCount--;
            }
            else {
                int random_int = (int)Math.floor(Math.random() * (9-1+1)+1);
                String temp = String.valueOf(random_int);
                password.add(temp);
                numberCount--;
            }
        }

        //output
        System.out.println("Your password is ");
        for(int i = 0; i < password.size(); i++) {
            System.out.print(password.get(i));
        }

        sc.close();
    }
}
