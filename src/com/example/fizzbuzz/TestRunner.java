package com.example.fizzbuzz;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Nate on 5/12/15.
 *
 * This class exists to run the unit tests.
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(FizzBuzzTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
