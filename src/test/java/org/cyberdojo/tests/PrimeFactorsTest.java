package org.cyberdojo.tests;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * PrimeFactorsTest
 *
 * @author f0rb on 2018-07-23.
 */
public class PrimeFactorsTest {
    @Test
    public void test_prime_factorize() {
        assertEquals(Arrays.asList(2), PrimeFactors.process(2));
        assertEquals(Arrays.asList(3), PrimeFactors.process(3));
        assertEquals(Arrays.asList(2, 2), PrimeFactors.process(4));
        assertEquals(Arrays.asList(2, 3), PrimeFactors.process(6));
        assertEquals(Arrays.asList(2, 2, 3), PrimeFactors.process(12));
        assertEquals(Arrays.asList(3, 5), PrimeFactors.process(15));

        assertEquals(Arrays.asList(2, 2, 5, 5), PrimeFactors.process(100));

        assertEquals(Arrays.asList(), PrimeFactors.process(1));
        assertEquals(Arrays.asList(), PrimeFactors.process(0));
        assertEquals(Arrays.asList(-1), PrimeFactors.process(-1));
        assertEquals(Arrays.asList(-1, 2, 3), PrimeFactors.process(-6));

        assertEquals(Arrays.asList(19, 19), PrimeFactors.process(361));

    }



    @Test
    public void test_is_prime() {
        assertFalse(PrimeFactors.isPrime(361));

        assertTrue(PrimeFactors.isPrime(2));
        assertTrue(PrimeFactors.isPrime(-2));
        assertTrue(PrimeFactors.isPrime(3));
        assertTrue(PrimeFactors.isPrime(5));
        assertTrue(PrimeFactors.isPrime(11));
        assertTrue(PrimeFactors.isPrime(37));

        assertFalse(PrimeFactors.isPrime(4));
        assertFalse(PrimeFactors.isPrime(15));

        for (int i = 2; i < 100; i++) {
            System.out.println(i + " is " + (PrimeFactors.isPrime(i) ? "" : "not " ) + "a prime number!");
        }
    }
}
