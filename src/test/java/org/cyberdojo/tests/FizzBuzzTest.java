package org.cyberdojo.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * FizzBuzzTest
 *
 * @author f0rb on 2018-08-01.
 */
public class FizzBuzzTest {

    @Test
    public void test_succeed() {
        assertEquals("Fizz", FizzBuzz.of(3));
        assertEquals("FizzBuzz", FizzBuzz.of(30));
        assertEquals("Buzz", FizzBuzz.of(5));
        assertEquals("2", FizzBuzz.of(2));
    }

}
