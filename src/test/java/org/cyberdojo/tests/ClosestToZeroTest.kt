package org.cyberdojo.tests

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

public class ClosestToZeroTest {
    @Test
    public fun test_closest_number() {
        assertEquals(1, ClosestToZero.pick(intArrayOf(1, 3, -2, 4)))
        assertEquals(2, ClosestToZero.pick(intArrayOf(-2, 3, 2)))
        assertEquals(-2, ClosestToZero.pick(intArrayOf(5, 3, -2)))
    }
}