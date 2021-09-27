package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class Validate {

    //function that calls all other validate functions and prints out the validations
    public static void validateInput(String firstName, String lastName, String ZIP, String emID){
            if(validateFirstName(firstName) == 1 && validateLastName(lastName) == 1 && validateZIP(ZIP) == 1 && validate_emID(emID) == 1)
                System.out.println("There were no errors found.");
            else {
                if (validateFirstName(firstName) == -1){
                    System.out.println("The first name must be at least 2 characters long.");
                    System.out.println("The first name must be filled in.");
                }
                if(validateFirstName(firstName) == 0)
                    System.out.println("The first name must be at least 2 characters long.");

                if (validateLastName(lastName) == -1){
                    System.out.println("The last name must be at least 2 characters long.");
                    System.out.println("The last name must be filled in.");
                }
                if(validateFirstName(lastName) == 0)
                    System.out.println("The last name must be filled in.");

                if (validate_emID(emID) == 0)
                    System.out.println("The employee ID must be in the format of AA-1234.");
                if (validateZIP(ZIP) == 0)
                    System.out.println("The zipcode must be a 5 digit number");
            }
    }

    //function to validate first name
    public static int validateFirstName(String firstName){
        if(firstName.length() == 0)
            return -1;
        else if(firstName.length() < 2)
            return 0;
        return 1;
    }

    //function to validate last name
    public static int validateLastName(String lastName){
        if((lastName.length() == 0))
            return -1;
        else if(lastName.length() < 2)
            return 0;
        return 1;
    }

    //function to validate ZIP
    public static int validateZIP(String ZIP){
        if(ZIP.length() != 5)
            return 0;
        int flag = 0;
        for(int i = 0; i < ZIP.length(); i++){
            if((ZIP.charAt(i) >= 'a' && ZIP.charAt(i) <= 'z') || (ZIP.charAt(i) >= 'A' && ZIP.charAt(i) <= 'Z'))
                return 0;
        }
        return 1;
    }

    //function to validate employee ID
    public static int validate_emID(String emID){
        if(emID.length() < 7 || emID.length() > 7)
            return 0;

        if(!(emID.charAt(0) >= 'A' && emID.charAt(0) <= 'Z'))
            return 0;
        else if(!(emID.charAt(1) >= 'A' && emID.charAt(1) <= 'Z'))
            return 0;
        else if(!(emID.charAt(2) >= '-'))
            return 0;
        else if(!(emID.charAt(3) >= '0' && emID.charAt(4) <= '9'))
            return 0;
        else if(!(emID.charAt(4) >= '0' && emID.charAt(4) <= '9'))
            return 0;
        else if(!(emID.charAt(5) >= '0' && emID.charAt(5) <= '9'))
            return 0;
        else if(!(emID.charAt(6) >= '0' && emID.charAt(6) <= '9'))
            return 0;
        return 1;
    }

}
