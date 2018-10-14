package org.cyberdojo.tests;

import java.util.HashMap;
import java.util.Map;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Fibonacci
 *
 * @author f0rb on 2018-09-01.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Fibonacci {

    private static final Map<Integer, Integer> memos = new HashMap<>(32);

    private static int doCalc(int i) {
        if (i <= 1) {
            return 1;
        }
        return calc(i - 1) + calc(i - 2);
    }

    public static int calc(int i) {
        return memos.computeIfAbsent(i, Fibonacci::doCalc);
    }

}
