package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {

    @Test
    void validateFirstName() {
        assertEquals(1, Validate.validateFirstName("John"));
        assertEquals(0, Validate.validateFirstName("J"));
        assertEquals(-1, Validate.validateFirstName(""));
    }

    @Test
    void validateLastName() {
        assertEquals(1, Validate.validateLastName("Johnson"));
        assertEquals(0, Validate.validateLastName("J"));
        assertEquals(-1, Validate.validateLastName(""));
    }

    @Test
    void validateZIP() {
        assertEquals(1, Validate.validateZIP("12345"));
        assertEquals(0, Validate.validateZIP("abcde"));
    }

    @Test
    void validate_emID() {
        assertEquals(1, Validate.validate_emID("AA-1234"));
        assertEquals(0, Validate.validate_emID("AAB-124"));
    }
}