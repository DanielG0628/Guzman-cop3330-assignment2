package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Guzman
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class CalculationsTest {

    @Test
    void average() {
        Calculations s = new Calculations();
        ArrayList<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");
        assertEquals(400.0, Calculations.average(num));
    }

    @Test
    void min() {
        Calculations s = new Calculations();
        ArrayList<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");
        assertEquals(100, Calculations.min(num));
    }

    @Test
    void max() {
        Calculations s = new Calculations();
        ArrayList<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");
        assertEquals(1000, Calculations.max(num));
    }

    @Test
    void std() {
        Calculations s = new Calculations();
        ArrayList<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");
        assertEquals(353.5533905932738, Calculations.std(num));
    }
}