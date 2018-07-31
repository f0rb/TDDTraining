package org.cyberdojo.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * NumberNamesTest
 *
 * @author f0rb on 2018-07-24.
 */
public class NumberNamesTest {

    public static final String[] enNum = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty"};

    public static final String[] decadeNum = {
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static final String[] enUnit = {"hundred", "thousand", "million",
            "billion", "trillion", "quintillion"};

    @Test
    public void test_translate() {

        assertEquals("one",  NumberNames.translate(1));
        assertEquals("nineteen",  NumberNames.translate(19));

        assertEquals("seventy eight",  NumberNames.translate(78));
        assertEquals("ninety two",  NumberNames.translate(92));

        assertEquals("one hundred and ninety two",  NumberNames.translate(192));

        assertEquals("eight hundred and five",  NumberNames.translate(805));

        assertEquals("nine hundred and ninety nine",  NumberNames.translate(999));

        assertEquals("thirty two thousand, nine hundred and ninety nine",  NumberNames.translate(32999));
        assertEquals("twelve thousand, six hundred and nine",  NumberNames.translate(12609));

        assertEquals("two million, two hundred and twelve thousand, six hundred and nine",  NumberNames.translate(2212609));

        assertEquals("twenty one billion, three hundred and twenty two million, two hundred and twelve thousand, six hundred and nine",
                     NumberNames.translate(21322212609L));


        assertEquals("zero", NumberNames.translate(0));
        assertEquals("one hundred", NumberNames.translate(100));
        assertEquals("one thousand", NumberNames.translate(1000));
        assertEquals("one million, one", NumberNames.translate(1000001));
        assertEquals("fourteen billion, six hundred and sixty six thousand", NumberNames.translate(14000666000L));
        assertEquals("fourteen billion, six hundred and sixty six million", NumberNames.translate(14666000000L));

        //assertEquals("twenty one billion, three hundred and twenty two million, two hundred and twelve thousand, six hundred and nine",
        //             NumberNames.translate(2139000000022212609L));
    }
}
