package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LasagnaTest {

    private final Lasagna classUnderTest = new Lasagna();

    @Test
    void expectedMinutesInOven() {
        assertEquals(40, classUnderTest.expectedMinutesInOven());
    }

    @Test
    void remainingMinutesInOven() {
        assertEquals(20, classUnderTest.remainingMinutesInOven(20));
    }

    @Test
    void preparationTimeInMinutes() {
        assertEquals(4, classUnderTest.preparationTimeInMinutes(2));
    }

    @Test
    void totalTimeInMinutes() {
        assertEquals(26, classUnderTest.totalTimeInMinutes(3, 20));
    }
}