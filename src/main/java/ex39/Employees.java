package ex39;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.ArrayList;
import java.util.HashMap;


public class Employees {

    //function to print out record
    public static void printEmployees(ArrayList<HashMap> list){

        System.out.println("Name\t\t\t\t| Position\t\t\t| Seperation Date");
        System.out.println("--------------------|-------------------|----------------");

        System.out.println(list.get(0).get(5) + " " + list.get(1).get(5) + "\t|" + list.get(2).get(5) + "\t\t\t\t|" + list.get(3).get(5));
        System.out.println(list.get(0).get(4) + " " + list.get(1).get(4) + "\t\t|" + list.get(2).get(4) + "\t\t\t|" + list.get(3).get(4));
        System.out.println(list.get(0).get(1) + " " + list.get(1).get(1) + "\t\t|" + list.get(2).get(1) + "\t\t\t|" + list.get(3).get(1));
        System.out.println(list.get(0).get(3) + " " + list.get(1).get(3) + "\t|" + list.get(2).get(3) + "\t|" + list.get(3).get(3));
        System.out.println(list.get(0).get(6) + " " + list.get(1).get(6) + "\t\t|" + list.get(2).get(6) + "\t\t|" + list.get(3).get(6));
        System.out.println(list.get(0).get(2) + " " + list.get(1).get(2) + "\t\t\t|" + list.get(2).get(2) + "\t|" + list.get(3).get(2));

    }
}
