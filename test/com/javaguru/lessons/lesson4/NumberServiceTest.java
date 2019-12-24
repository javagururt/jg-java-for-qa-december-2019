package com.javaguru.lessons.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    private NumberService victim = new NumberService();

    @Test
    public void shouldBePrimeNumber() {
        boolean actualResult = victim.isPrimeNumber(7);
//        boolean expectedResult = true;
//        assertEquals(expectedResult, actualResult);
        assertTrue(actualResult);
    }

    @Test
    public void shouldBeNotPrimeNumber() {
        boolean actualResult = victim.isPrimeNumber(-1);
        assertFalse(actualResult);
    }
}