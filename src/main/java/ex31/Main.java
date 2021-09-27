package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables, create scanner, and class variable
        int a, rHR;
        double intensity = 55.0, tHr;
        HeartRate h = new HeartRate();
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("What is your age?");
        a = sc.nextInt();
        System.out.println("What is your resting heart rate?");
        rHR = sc.nextInt();

        //output and function call
        System.out.println("Resting Pulse: " + rHR + "\tAge: " + a);

        System.out.println("Intensity    | Rate\n-------------|--------");
        for(int i=0; i<9; i++) {
            tHr = h.targetHeartRate(a, rHR, intensity);
            System.out.println((int)intensity + "%          | " + (int)tHr + "bpm");
            intensity = intensity + 5;
        }

        sc.close();
    }
}
