package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.ArrayList;

public class Calculations {

    //function to calculate average
    public static double average(ArrayList<String> list){
        double average = 0, temp;

        for(int i = 0; i < list.size(); i++){
            temp = Double.parseDouble(list.get(i));
            average = average + temp;
        }

        average = average / list.size();

        return Math.round(average*100.0)/100;
    }

    //function to calculate minimum
    public static int min(ArrayList<String> list){
        int min = Integer.parseInt(list.get(0));
        int temp;

        for(int i = 0; i < list.size(); i++){
            temp = Integer.parseInt(list.get(i));
            if(min > temp)
                min = temp;
        }

        return min;
    }

    //function to calculate the maximum
    public static int max(ArrayList<String> list){
        int max = Integer.parseInt(list.get(0));
        int temp;

        for(int i = 0; i < list.size(); i++){
            temp = Integer.parseInt(list.get(i));
            if(max < temp)
                max = temp;
        }

        return max;
    }

    //function to calculate the standard deviation
    public static double std(ArrayList<String> list){
        double s = 0.0, std = 0.0;
        int length = list.size();
        int numArray[];
        numArray = new int[length];

        for(int i = 0; i < length; i++){
            numArray[i] = Integer.parseInt(list.get(i));
        }


        for(double num : numArray) {
            s += num;
        }

        double mean = s/length;

        for(double num: numArray) {
            std += Math.pow(num - mean, 2);
        }

        return (Math.sqrt(std/length));
    }
}
