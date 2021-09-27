package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class password {
    public static int passwordValidator(String password){
        //loop through string to see if there is numbers, letters or special characters
        int count = 0, l = 0, n = 0, s = 0;
        for(int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') || (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'))
                l++;
            else if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
                n++;
            else
                s++;
            count++;
        }

        //return depending on the values of the counters
        if(count < 8) {
            if(l == 0)
                return 1;
            else
                return 2;
        }
        else {
            if((l >= 1) && (n >=1) && (s == 0))
                return 3;
        }
        return 4;
    }
}

