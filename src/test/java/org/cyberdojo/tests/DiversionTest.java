package org.cyberdojo.tests;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * DiversionTest
 *
 * @author f0rb on 2018-07-20.
 */
public class DiversionTest {

    @Test
    public void test_has_two_adjacent_ones() {
        assertTrue(Diversion.hasTwoAdjacentOnes("11"));
        assertFalse(Diversion.hasTwoAdjacentOnes("100101"));
    }

    @Test
    public void test_convert_number_to_binary_strings() {
        assertEquals("101", Diversion.convertNumberToBinaryString(5, 3));
        assertEquals("0101", Diversion.convertNumberToBinaryString(5, 4));
    }

    @Test
    public void test_given_3_then_5() {
        // given 3
        int input = 3;

        // when
        int output = Diversion.execute(input);

        // then 5
        assertEquals(5, output);
    }

    @Test
    public void test_given_4_then_8() {
        // given 3
        int input = 4;

        // when
        int output = Diversion.execute(input);

        // then 5
        assertEquals(8, output);
    }
}