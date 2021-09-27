package ex24;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Arrays;

public class Anagram {
        public static int isAnagram(String w1, String w2){
                int s1Length = w1.length();
                int s2Length = w2.length();

                if(s1Length == s2Length) {
                        char[] ArrayS1 = w1.toLowerCase().toCharArray();
                        char[] ArrayS2 = w2.toLowerCase().toCharArray();
                        Arrays.sort(ArrayS1);
                        Arrays.sort(ArrayS2);

                        if(Arrays.equals(ArrayS1, ArrayS2))
                                return 1;
                        else
                                return 0;
                }
                else {
                        return 0;
                }
        }
}
