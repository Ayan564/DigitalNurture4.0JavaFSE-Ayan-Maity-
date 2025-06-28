package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals("Addition failed", 5, 2 + 3);

        // Assert true
        assertTrue("Expected true", 5 > 3);

        // Assert false
        assertFalse("Expected false", 5 < 3);

        // Assert null
        assertNull("Expected null", null);

        // Assert not null
        assertNotNull("Expected not null", new Object());

        System.out.println("All assertions passed in testAssertions");
    }
}
