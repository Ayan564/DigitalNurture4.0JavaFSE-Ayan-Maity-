package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void testAddition() {
        int result = 2 + 3;
        System.out.println("Running testAddition: 2 + 3 = " + result);
        assertEquals(5, result);
    }
}
