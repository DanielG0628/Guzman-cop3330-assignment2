package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double b, double i, double p){
        i = (i/100) / 365;
        double n = -(1/30.0) * Math.log10(1 + (b/p) * (1 - Math.pow((1 + i), 30.0))) / Math.log10(1 + i);
        return Math.ceil(n);
    }
}
