package org.cyberdojo.tests;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * OneHundredDoorsTest
 *
 * 100 doors in a row are all initially closed. You make
 * 100 passes by the doors. The first time through, you
 * visit every door and toggle the door (if the door is
 * closed, you open it; if it is open, you close it).
 * The second time you only visit every 2nd door (door
 * #2, #4, #6, ...). The third time, every 3rd door
 * (door #3, #6, #9, ...), etc, until you only visit
 * the 100th door.
 *
 * Question: What state are the doors in after the last
 * pass? Which are open, which are closed?
 *
 * [Source http://rosettacode.org]
 *
 * @author f0rb on 2018-08-07.
 */
public class OneHundredDoorsTest {

    @Test
    public void test_() {
        boolean[] pass1 = OneHundredDoors.pass(1);
        System.out.println(Arrays.toString(pass1));
        assertTrue(pass1[0]);
        assertTrue(pass1[99]);


        boolean[] pass2 = OneHundredDoors.pass(2);
        System.out.println(Arrays.toString(pass2));

        assertTrue(pass2[2]);
        assertFalse(pass2[3]);


        boolean[] pass100 = OneHundredDoors.pass(100);
        System.out.println(Arrays.toString(pass100));

        assertTrue(pass100[0]);
        assertTrue(pass100[3]);
        assertTrue(pass100[8]);
        assertTrue(pass100[80]);
    }

}
