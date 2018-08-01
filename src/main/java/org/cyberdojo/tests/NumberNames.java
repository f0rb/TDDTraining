package org.cyberdojo.tests;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * NumberNames
 * <p>
 * Spell out a number. For example
 * <p>
 * 99 --> ninety nine
 * 300 --> three hundred
 * 310 --> three hundred and ten
 * 1501 --> one thousand, five hundred and one
 * 12609 --> twelve thousand, six hundred and nine
 * 512607 --> five hundred and twelve thousand,
 * six hundred and seven
 * 43112603 --> forty three million, one hundred and
 * twelve thousand,
 * six hundred and three
 * <p>
 * [Source http://rosettacode.org]
 *
 * @author f0rb on 2018-07-24.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NumberNames {

    public static final String[] enNum = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty"
    };

    public static final String[] decadeNum = {
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static final String[] enUnit = {
            "hundred", "thousand", "million",
            "billion", "trillion", "quintillion"
    };

    public static final int THOUSAND = 1000;
    public static final int HUNDRED = 100;

    public static String translate(long input) {
        if (input == 0) {
            return "zero";
        }
        return translate(input, getLogFor1000(input))
                //.replace(" and zero", "")
                //.replace(", zero million", "")
                //.replace(", zero thousand", "")
                //.replace(", zero", "")
                ;
    }

    public static String translate(long input, int group) {
        if (input < 1000) {
            return translateUnder1000(input);
        }
        int pow = (int) Math.pow(THOUSAND, group);
        String result = translateUnder1000(input / pow);
        result = concatHigh(group, result);
        String leftPart = translate(input % pow, group - 1);
        result = concatLeftPart(result, leftPart);
        return result;
    }

    private static String concatLeftPart(String result, String leftPart) {
        if (!leftPart.equals("")) {
            if (!result.equals("")) {
                result = result + ", ";
            }
            result +=  leftPart;
        }
        return result;
    }

    private static String concatHigh(int group, String result) {
        if (!result.equals("")) {
            result += " " + enUnit[group];
        }
        return result;
    }

    private static String translateUnder1000(long input) {
        String result;
        if (input < 20) {
            result = enNum[(int) input];
        } else if (input < HUNDRED) {
            result = decadeNum[(int) (input / 10 - 2)] + " " + translate(input % 10);
        } else {
            String under100 = translateUnder1000(input % HUNDRED);
            String hundreds = enNum[(int) (input / HUNDRED)] + " hundred";
            if (!under100.equals("")) {
                result = hundreds + " and " + under100;
            } else {
                result = hundreds;
            }
        }
        return result;
    }

    public static int getLogFor1000(long i) {
        int ret = 0;
        while ( (i /= 1000) > 0) {
            ret++;
        }
        return ret;
        //return i < THOUSAND ? 0 : (int) Math.floor(Math.log(i) / Math.log(THOUSAND));
    }


}
