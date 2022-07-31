package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test void main() {

        Main classUnderTest = new Main();
        assertNotNull(classUnderTest.helloWorld(), "app should have a greeting");

    }
}