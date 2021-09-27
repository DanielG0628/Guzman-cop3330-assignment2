package ex40;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //declare variables, create scanner, and declare class variable
        ArrayList<HashMap> list = new ArrayList<>();
        Employees e = new Employees();
        Scanner sc = new Scanner(System.in);


        //create hashmaps
        HashMap<Integer,String> firstNameMap = new HashMap<Integer,String>();
        HashMap<Integer,String> lastNameMap = new HashMap<Integer,String>();
        HashMap<Integer,String> pMap = new HashMap<Integer,String>();
        HashMap<Integer,String> sepMap = new HashMap<Integer,String>();

        //fill hashmaps with data
        firstNameMap.put(1, "John");
        firstNameMap.put(2, "Tou");
        firstNameMap.put(3, "Michaela");
        firstNameMap.put(4, "Jake");
        firstNameMap.put(5, "Jacquelyn");
        firstNameMap.put(6, "Sally");

        lastNameMap.put(1, "Johnson");
        lastNameMap.put(2, "Xiong");
        lastNameMap.put(3, "Michaelson");
        lastNameMap.put(4, "Jacobson");
        lastNameMap.put(5, "Jackson");
        lastNameMap.put(6, "Webber");

        pMap.put(1, "Manager");
        pMap.put(2, "Software Engineer");
        pMap.put(3, "District Manager");
        pMap.put(4, "Programmer");
        pMap.put(5, "DBA");
        pMap.put(6, "Web Developer");

        sepMap.put(1, "2016-12-31");
        sepMap.put(2, "2016-10-05");
        sepMap.put(3, "2015-12-19");
        sepMap.put(4, "");
        sepMap.put(5, "");
        sepMap.put(6, "2015-12-18");

        //add hasp maps to list of maps
        list.add(firstNameMap);
        list.add(lastNameMap);
        list.add(pMap);
        list.add(sepMap);

        //prompt user and scan inputs
        System.out.println("Enter a search string: ");
        String searchString = sc.nextLine();

        //call print function
        e.searchList(list, searchString);
    }
}
