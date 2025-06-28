package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Setup method: runs BEFORE each test
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        // Teardown method: runs AFTER each test
        System.out.println("Test finished");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals("Addition should be 5", 5, result);
        System.out.println("Tested addition: 2 + 3 = " + result);
    }
}
