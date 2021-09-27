package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class filter {

    //function to filter out even numbers
    public static int[] filterEvenNumbers(int[] numbers, int size) {

        int[] evens = new int[size];

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[count] = numbers[i];
                count++;
            }
        }

        return evens;
    }

}

