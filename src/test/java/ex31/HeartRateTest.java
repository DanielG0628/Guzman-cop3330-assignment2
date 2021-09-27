package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

    @Test
    void targetHeartRate() {
        assertEquals(138.15, HeartRate.targetHeartRate(22, 65, 55));
    }
}