package org.cyberdojo.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * EightQueensTest
 *
 * @author f0rb on 2018-07-21.
 */
public class EightQueensTest {
    @Test
    public void test_first_result() {
        //assertArrayEquals(new int[]{1, 3, 5, 7, 2, 4, 8, 6}, EightQueens.execute().get(0));
        List<int[]> results = EightQueens.execute();
        assertArrayEquals(new int[]{0, 4, 7, 5, 2, 6, 1, 3}, results.get(0));
        assertEquals(92, results.size());
        results.stream().map(Arrays::toString).forEach(System.out::println);
    }
}
