package org.cyberdojo.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * RemoveDuplicatesTest
 *
 * @author f0rb on 2018-07-23.
 */
public class RemoveDuplicatesTest {
    @Test
    public void test_remove() {
        assertArrayEquals(new Integer[]{}, RemoveDuplicates.remove(new int[]{}));
        assertArrayEquals(new Integer[]{1, 2}, RemoveDuplicates.remove(new int[]{1, 2}));
        assertArrayEquals(new Integer[]{1, 2, 3, 5}, RemoveDuplicates.remove(new int[]{1, 1, 2, 3, 3, 3, 5}));
    }
}
