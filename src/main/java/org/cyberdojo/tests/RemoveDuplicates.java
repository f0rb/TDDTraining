package org.cyberdojo.tests;

import java.util.HashSet;
import java.util.Set;

/**
 * RemoveDuplicates
 *
 * @author f0rb on 2018-07-23.
 */
public class RemoveDuplicates {
    public static Integer[] remove(int[] ints) {
        Set<Integer> numberSet = new HashSet<>();
        for (int number : ints) {
            numberSet.add(number);
        }

        return numberSet.toArray(new Integer[0]);
    }
}
