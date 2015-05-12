package com.example.fizzbuzz;

/**
 * Created by Nate on 5/11/15.
 *
 * This class implements the FizzBuzz algorithm.
 */
public class FizzBuzz {
    private boolean zero_state;

    public FizzBuzz() {
        zero_state = false;
    }
    public FizzBuzz(boolean zs) {
        zero_state = zs;
    }

    public boolean zero_mode() {
        return zero_state;
    }

    public void change_mode() {
        zero_state = !zero_state;
    }

    public void change_mode(boolean zs) {
        zero_state = zs;
    }

    private static boolean divisibleBy(int dividend, int divisor) {
        return ((dividend % divisor) == 0);
    }

    public String fizzBuzz(int value) {
        if (value == 0) {
          if (zero_state) {
              return "0";
          }
          else {
              return "FizzBuzz";
          }
        } else if (divisibleBy(value, 3) && divisibleBy(value, 5)) {
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
        FizzBuzz fb = new FizzBuzz();
        for (String arg : args) {
            System.out.println(fb.fizzBuzz(Integer.parseInt(arg)));
        }
    }
}
