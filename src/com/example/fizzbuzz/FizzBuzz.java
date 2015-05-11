package com.example.fizzbuzz;

/**
 * Created by mengen on 5/11/15.
 */
public class FizzBuzz {
    public static boolean divisibleBy(int dividend, int divisor) {
       return ((dividend % divisor) == 0);
    }

    public static String fizzbuzz(String value) {
        if (divisibleBy(value, 3) && divisibleBy(value, 5)) {
            return "FizzBuzz";
        } else if (divisibleBy(value, 3)) {
            return "Fizz";
        } else if (divisibleBy(value, 5)) {
            return "Buzz";
        } else
            return String.valueOf(value);
    }

    public static void main(String[] args) {

    }
}
