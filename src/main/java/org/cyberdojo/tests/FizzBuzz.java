package org.cyberdojo.tests;

/**
 * FizzBuzz
 *
 * @author f0rb on 2018-08-01.
 */
public class FizzBuzz {

    private FizzBuzz() {
    }

    public static String of(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return i + "";
    }
}
