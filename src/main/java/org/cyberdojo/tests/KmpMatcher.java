package org.cyberdojo.tests;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * KmpMatcher
 *
 * @author f0rb on 2018-09-14.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class KmpMatcher {

    public static int indexOf(String origin, String match) {
        int i = 0;
        int j = 0;

        int[] next = getNext2(match);

        int len = origin.length();
        int matchLength = match.length();
        while (i - j < len - matchLength) {
            if (j == -1 || origin.charAt(i) == match.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }

            if (j >= matchLength) {
                return i - matchLength;
            }

        }

        return -1;
    }

    static int[] computeNext(String match) {
        int[] next = new int[match.length()];
        next[0] = -1;
        boolean matching = false;
        for (int i = 1; i < next.length; i++) {
            if (matching) {
                if (match.charAt(i) != match.charAt(next[i - 1] + 1)) {
                    matching = false;
                }
                next[i] = next[i - 1] + 1;
            } else if (match.charAt(i) == match.charAt(0)) {
                matching = true;
            }

        }

        return next;
    }

    static int[] getNext(String match) {
        char[] p = match.toCharArray();
        int[] next = new int[match.length()];

        next[0] = -1;

        int i = 0;
        int j = -1;

        while (i != match.length() - 1) {
            //这里注意，i==0的时候实际上求的是next[1]的值，以此类推
            if (j == -1 || p[i] == p[j]) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }

        }

        return next;
    }

    static int[] getNext2(String match) {

        char[] pattern = match.toCharArray();
        int[] next = new int[match.length()];

        next[0] = -1;


        int k = -1;
        int j = 0;

        while (j < pattern.length - 1) {
            while (k != -1 && pattern[k] != pattern[j]) {
                k = next[k];
            }
            ++j;
            ++k;
            if (pattern[k] == pattern[j]) {
                next[j] = next[k];
            } else {
                next[j] = k;
            }

        }

        return next;

    }

}
