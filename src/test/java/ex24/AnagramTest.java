package ex24;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import  org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    @DisplayName("Find if two words are Anagrams")
    void isAnagram() {
        assertEquals(1, Anagram.isAnagram("note", "tone"));
        assertEquals(1, Anagram.isAnagram("tar", "rat"));
        assertEquals(0, Anagram.isAnagram("low", "note"));
    }

}