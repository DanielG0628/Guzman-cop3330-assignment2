package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addInputTest {

    @Test
    void sum() {
        assertEquals(5, addInput.sum(2, 3));
    }
}