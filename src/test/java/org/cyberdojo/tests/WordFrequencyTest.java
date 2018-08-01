package org.cyberdojo.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * WordFrequencyTest
 *
 * @author f0rb on 2018-07-31.
 */
public class WordFrequencyTest {
    //input:
    //
    //the day is sunny the the day
    //the sunny day
    //
    //output:
    //
    //the 4
    //day 3
    //sunny 2
    //is 1


    @Test
    public void test_word_frequency() {
        assertEquals("the 4\nday 3\nsunny 2\nis 1",
                WordFrequency.process("the day is sunny the the day\nthe sunny day"));
    }
}
