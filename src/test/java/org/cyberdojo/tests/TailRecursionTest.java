package org.cyberdojo.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TailRecursionTest
 *
 * @author f0rb on 2018-09-01.
 */
public class TailRecursionTest {

    @Test
    public void test_fibonacciWithCache() {
        assertEquals(89, TailRecursion.fibonacciWithCache(10));
        assertEquals(34, TailRecursion.fibonacciWithCache(8));
        assertEquals(10946, TailRecursion.fibonacciWithCache(20));
    }
    @Test
    public void testFibonacci() {

        assertEquals(1, TailRecursion.fibonacci(0));
        assertEquals(1, TailRecursion.fibonacci(1));
        assertEquals(2, TailRecursion.fibonacci(2));
        assertEquals(3, TailRecursion.fibonacci(3));
        assertEquals(5, TailRecursion.fibonacci(4));
        assertEquals(8, TailRecursion.fibonacci(5));
        assertEquals(10946, TailRecursion.fibonacci(20));
    }

    @Test
    public void testPower() {
        assertEquals(8, TailRecursion.pow(2, 3));
        assertEquals(25, TailRecursion.pow(5, 2));
        assertEquals(10000, TailRecursion.pow(10, 4));
    }


    @Test
    public void testSum() {
        assertEquals(15, TailRecursion.sum(1, 1, 5));
        assertEquals(5050, TailRecursion.sum(1, 1, 100));
        assertEquals(5050, TailRecursion.sum(1, 2, 50) + TailRecursion.sum(2, 2, 50));
    }

    @Test
    public void test_factorial() {
        assertEquals(1, TailRecursion.factorial(1));
        assertEquals(120, TailRecursion.factorial(5));

    }
}
