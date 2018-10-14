package org.cyberdojo.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * FibonacciTest
 *
 * @author f0rb on 2018-09-01.
 */
public class FibonacciTest {
    @Test
    void testFibonacci() {
        System.out.println(Fibonacci.calc(21));

        assertEquals(1, Fibonacci.calc(0));
        assertEquals(1, Fibonacci.calc(1));
        assertEquals(2, Fibonacci.calc(2));
        assertEquals(3, Fibonacci.calc(3));
        assertEquals(5, Fibonacci.calc(4));

        System.out.println(Fibonacci.calc(20));
        System.out.println(Fibonacci.calc(10));

    }

}
