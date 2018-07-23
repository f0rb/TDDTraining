package org.cyberdojo.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Anagram
 * <p>
 * Write a program to generate all potential
 * anagrams of an input string.
 * <p>
 * For example, the potential anagrams of "biro" are
 * <p>
 * biro bior brio broi boir bori
 * ibro ibor irbo irob iobr iorb
 * rbio rboi ribo riob roib robi
 * obir obri oibr oirb orbi orib
 *
 * @author f0rb on 2018-07-20.
 */
public class Anagram {
    public static List<String> of(String input) {
        if (input.length() >= 2) {
            List<String> resultList = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                List<String> of = Anagram.of(deleteCharAt(input, i));
                for (String s : of) {
                    resultList.add(input.charAt(i) + s);
                }
            }
            return resultList;
        }
        return Collections.singletonList(input);
    }

    private static String deleteCharAt(String input, int i) {
        return new StringBuilder(input).deleteCharAt(i).toString();
    }
}
