package com.example.fizzbuzz;

/**
 * Created by Nate on 5/11/15.
 *
 * This class implements the FizzBuzz algorithm.
 */
public class FizzBuzz {
    private static boolean divisibleBy(int dividend, int divisor) {
        return ((dividend % divisor) == 0);
    }

    public static String fizzBuzz(int value) {
        if (divisibleBy(value, 3) && divisibleBy(value, 5)) {
            return "FizzBuzz";
        } else if (divisibleBy(value, 3)) {
            return "Fizz";
        } else if (divisibleBy(value, 5)) {
            return "Buzz";
        } else {
            return String.valueOf(value);
        }
    }

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(fizzBuzz(Integer.parseInt(arg)));
        }
    }
}
