package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        //Declare variables, create scanner, and declare class variable
        String[] employeeNames = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String removeEmployee;
        int temp = 10;
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        //print list of employees before removal
        System.out.println("There are 5 employees:");
        e.printList(employeeNames);

        //prompt user and scan inputs
        System.out.println("Enter an employee name to remove:");
        removeEmployee = sc.nextLine();

        //remove employee
        for(int i = 0; i < 5; i++) {
            if(removeEmployee.equals(employeeNames[i]))
                temp = i;
        }

        //print new list
        System.out.println("There are 4 employees:");
        for(int i = 0; i < 5; i++) {
            if(i != temp)
                System.out.println(employeeNames[i]);
        }

        sc.close();
    }
}
