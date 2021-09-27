package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentTest {

    @Test
    void findYear() {
        assertEquals(18, Investment.findYear(4));
    }
}