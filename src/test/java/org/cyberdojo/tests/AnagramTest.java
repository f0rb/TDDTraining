package org.cyberdojo.tests;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * AnagramTest
 *
 * @author f0rb on 2018-07-20.
 */
public class AnagramTest {
    @Test
    public void test_one_char() {
        String input = "a";
        assertEquals(Arrays.asList("a"), Anagram.of(input));
    }
    @Test
    public void test_two_chars() {
        String input = "ab";
        assertEquals(Arrays.asList("ab", "ba"), Anagram.of(input));
    }
    @Test
    public void test_three_chars() {
        String input = "abc";
        assertEquals(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"), Anagram.of(input));
    }

    @Test
    public void test_four_chars() {
        String input = "abcd";
        assertEquals(24, Anagram.of(input).size());
        assertEquals("abcd", Anagram.of(input).get(0));
        System.out.println(Anagram.of(input));
    }
}
