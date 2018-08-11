package org.cyberdojo.tests;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * CountCoinsTest
 *
 * @author f0rb on 2018-07-20.
 */
public class CountCoinsTest {

    @Test
    public void test_1_cent() {
        // given 1
        int i = 1;

        // then 1 combinations
        assertEquals(1, CountCoins.count(i).size());
    }

    //@Test
    //public void test_2_cents() {
    //    // given 1
    //    int i = 2;
    //
    //    // then 1 combinations
    //    assertEquals(1, CountCoins.count(i).size());
    //}
    //
    @Test
    public void test_6_9_cents() {
        int input = 8;
        assertEquals(2, CountCoins.count(input).size());
        for (int[] solution : CountCoins.count(input)) {
            checkSolution(input, solution);
        }
    }

    @Test
    public void test_10_24_cents() {
        int input = 15;
        for (int[] solution : CountCoins.count(input)) {
            checkSolution(input, solution);
        }
        assertEquals(6, CountCoins.count(input).size());
    }

    @Test
    public void test_100_cents() {
        int input = 100;
        for (int[] solution : CountCoins.count(input)) {
            checkSolution(input, solution);
        }
        assertEquals(242, CountCoins.count(input).size());
    }

    private void checkSolution(int input, int[] solution) {
        System.out.println(Arrays.toString(solution));
        int count = solution[3] * 25 + solution[2] * 10 + solution[1] * 5 + solution[0];
        assertEquals(input, count);
    }
}