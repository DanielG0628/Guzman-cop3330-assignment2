package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class HeartRate {

    //function to find target heart rate
    public static double targetHeartRate(int age, int rHR, double intensity) {
        return (((220 - age) - rHR) * (intensity / 100)) + rHR;
    }

}
