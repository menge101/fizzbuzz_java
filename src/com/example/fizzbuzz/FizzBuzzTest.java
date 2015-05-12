package com.example.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mengen on 5/12/15.
 *
 * This class contains unit tests for the FizzBuzz algorithm.
 */
public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        int values[] = new int[] {1,2,4,7,8,11,13,14};
        FizzBuzz fb = new FizzBuzz(false);
        for(int value: values) {
            assertEquals(String.valueOf(value), fb.fizzBuzz(value));
            assertEquals(String.valueOf(value * -1), fb.fizzBuzz(value * -1));
            assertEquals("Fizz", fb.fizzBuzz(value * -3));
            assertEquals("Fizz", fb.fizzBuzz(value * 3));
            assertEquals("Buzz", fb.fizzBuzz(value * 5));
            assertEquals("Buzz", fb.fizzBuzz(value * -5));
            assertEquals("FizzBuzz", fb.fizzBuzz(value * 15));
            assertEquals("FizzBuzz", fb.fizzBuzz(value * -15));
        }
        assertEquals("FizzBuzz", fb.fizzBuzz(0));
        fb.change_mode();
        assertEquals("0", fb.fizzBuzz(0));
    }

    @Test
    public void test_initialize() {
        FizzBuzz fb = new FizzBuzz(true);
        assertTrue(fb.zero_mode());
        fb = new FizzBuzz(false);
        assertFalse(fb.zero_mode());
        fb = new FizzBuzz();
        assertFalse(fb.zero_mode());
    }

    @Test
    public void test_changeMode() {
        FizzBuzz fb = new FizzBuzz();
        assertFalse(fb.zero_mode());
        fb.change_mode();
        assertTrue(fb.zero_mode());
        fb.change_mode();
        assertFalse(fb.zero_mode());
        fb.change_mode(true);
        assertTrue(fb.zero_mode());
        fb.change_mode(false);
        assertFalse(fb.zero_mode());
    }
}