package com.javaguru.lessons.lesson3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberServiceTest {

    private NumberService victim = new NumberService();

    @Test
    public void shouldSumInRange() {
        int actualResult = victim.sumInRange(2, 5);
        int expectedResult = 14;

        assertEquals(expectedResult, actualResult);
    }

}