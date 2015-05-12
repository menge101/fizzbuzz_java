package com.example.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by mengen on 5/12/15.
 *
 * This class contains unit tests for the FizzBuzz algorithm.
 */
public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        int values[] = new int[] {1,2,4,7,8,11,13,14};
        for(int value: values) {
            assertEquals(String.valueOf(value), FizzBuzz.fizzBuzz(value));
            assertEquals(String.valueOf(value * -1), FizzBuzz.fizzBuzz(value * -1));
            assertEquals("Fizz", FizzBuzz.fizzBuzz(value * -3));
            assertEquals("Fizz", FizzBuzz.fizzBuzz(value * 3));
            assertEquals("Buzz", FizzBuzz.fizzBuzz(value * 5));
            assertEquals("Buzz", FizzBuzz.fizzBuzz(value * -5));
            assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(value * 15));
            assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(value * -15));
        }
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(0));
    }
}