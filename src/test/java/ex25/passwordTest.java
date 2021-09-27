package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordTest {

    @Test
    void passwordValidator() {
        assertEquals(1, password.passwordValidator("12345"));
        assertEquals(2, password.passwordValidator("asdfg"));
        assertEquals(3, password.passwordValidator("abc123xyz"));
        assertEquals(4, password.passwordValidator("1337h@xor!"));
    }
}