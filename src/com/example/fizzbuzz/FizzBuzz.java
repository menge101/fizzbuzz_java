package com.example.fizzbuzz;

import java.util.ArrayList;

/**
 * Created by mengen on 5/11/15.
 */
public class FizzBuzz {
    public static boolean divisibleBy(int dividend, int divisor) {
        return ((dividend % divisor) == 0);
    }

    public static String fizzBuzzMapping(int value) {
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

    public static ArrayList<String> fizzbuzz(ArrayList<Integer> args) {
        int min = 0;
        int max;
        ArrayList<String> results = new ArrayList<>();

        if (args.size() == 1) {
            max = args.get(0);
            for (int i = min; i <= max; i++) {
                results.add(fizzBuzzMapping(i));
            }
        }
        else if (args.size() == 2) {
            min = args.get(0);
            max = args.get(1);
            for (int i = min; i <= max; i++) {
                results.add(fizzBuzzMapping(i));
            }
        }
        else {
            for (int arg : args) {
                results.add(fizzBuzzMapping(arg));
            }
        }


        return results;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Program operates in one of three modes.");
            System.out.println("With one argument, the program starts at zero and operates on a range of numbers up to and including the argument.");
            System.out.println("With two arguments, the program runs from the first argument to the second argument, inclusive.");
            System.out.println("More than two arguments, the program will process each value individually.");
            System.out.println("Any value that can that is not an integer will be ignored.");
        }
        else {
            ArrayList<Integer> processedArgs = new ArrayList<>();
            for (String arg : args) {
                processedArgs.add(Integer.parseInt(arg));
            }
            ArrayList<String> results = fizzbuzz(processedArgs);
            for(String result: results) {
                System.out.println(result);
            }
        }
    }
}
