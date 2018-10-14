package org.cyberdojo.tests;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * KmpMatcherTest
 *
 * @author f0rb on 2018-09-14.
 */
public class KmpMatcherTest {
    @Test
    public void testIndexOf() {
        assertEquals(2, KmpMatcher.indexOf("23234235678234567", "23423"));
        assertEquals(-1, KmpMatcher.indexOf("23234235678234567", "dfghj"));
        assertEquals(3, KmpMatcher.indexOf("sssssssss34", "ssssss3"));
        assertEquals(6, KmpMatcher.indexOf("sssssssss34ss", "sss34s"));
        assertEquals(8, KmpMatcher.indexOf("sssss23a234234234ssss34ss", "234234234"));
    }

    @Test
    public void testComputeNext() {
        assertArrayEquals(new int[] {-1, 0, 0}, KmpMatcher.computeNext( "234"));
        //assertArrayEquals(new int[] {-1, 0, 0, 1}, KmpMatcher.computeNext( "2342"));
        assertArrayEquals(new int[] {-1, 0, 0, 0}, KmpMatcher.computeNext( "2342"));
        assertArrayEquals(new int[] {-1, 0, 0, 0, 1}, KmpMatcher.computeNext( "23423"));
        assertArrayEquals(new int[] {-1, 0, 0, 0, 1, 2}, KmpMatcher.computeNext( "234234"));
        //ssssss1
        // ssssss1
        assertArrayEquals(new int[] {-1, 0, 1, 2, 3, 4, 5}, KmpMatcher.computeNext( "ssssss1"));
        //assertArrayEquals(new int[] {-1, 0, 1, 2, 3, 4, 5}, KmpMatcher.computeNext( "ssssss1ss"));
        System.out.println(Arrays.toString(KmpMatcher.computeNext("ssssss1ss")));
        System.out.println(Arrays.toString(KmpMatcher.getNext("ssssss1ss")));
        System.out.println(Arrays.toString(KmpMatcher.getNext2("ssssss1ss")));
        System.out.println();
        System.out.println(Arrays.toString(KmpMatcher.computeNext("234234234")));
        System.out.println(Arrays.toString(KmpMatcher.getNext("234234234")));
        System.out.println(Arrays.toString(KmpMatcher.getNext2("234234234")));
        System.out.println();
        System.out.println(Arrays.toString(KmpMatcher.computeNext("asdfas234")));
        System.out.println(Arrays.toString(KmpMatcher.getNext("asdfas234")));
        System.out.println(Arrays.toString(KmpMatcher.getNext2("asdfas234")));


    }
}