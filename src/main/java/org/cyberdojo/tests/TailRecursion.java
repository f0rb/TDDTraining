package org.cyberdojo.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * TailRecursion
 *
 * @author f0rb on 2018-09-01.
 */
public class TailRecursion {

    @SafeVarargs
    public static <T> T recursive(int n, Function<T[], T[]> func, T... args) {
        return n <= 0 ? args[0] : recursive(n - 1, func, func.apply(args));
    }
    private static final Map<Integer, Integer> fibMap = new HashMap<>();
    private static int maxKey = 1;
    static {
        fibMap.put(0, 1);
        fibMap.put(1, 1);
    }

    //@SafeVarargs
    //public static <T> T recursive2(int n, Function<T[], T[]> func, T... args) {
    //    return n <= 0 ? args[1] : recursive2(n - 1, func, func.apply(args));
    //}

    public static int fibonacci(int i) {
        if (i < 2) return 1;
        return recursive(i - 1, args -> new Integer[]{args[0] + args[1], args[0]}, 1, 1);
    }

    public static int fibonacciWithCache(final int i) {
        if (fibMap.containsKey(i)) return fibMap.get(i);
        synchronized (fibMap){
            if (fibMap.containsKey(i)) return fibMap.get(i);
            int recursiveTimes = i - maxKey;
            Integer resultFor = maxKey + 1;
            Integer lastResult = fibMap.get(maxKey);
            Integer nextTerm = fibMap.get(maxKey - 1);
            Function<Integer[], Integer[]> function = args -> {
                int thisResult = args[0] + args[1];
                fibMap.put(args[2], thisResult);
                if (args[2] > maxKey) {
                    maxKey = args[2];
                }
                return new Integer[]{thisResult, args[0], args[2] + 1};
            };
            return recursive(recursiveTimes, function, lastResult, nextTerm, resultFor);
        }
    }

    public static int pow(int base, int exp) {
        return recursive(exp, args -> new Integer[]{args[0] * args[1], args[1]}, 1, base);
    }

    public static int sum(int a0, int step, int n) {
        return recursive(n, args -> new Integer[]{args[0] + args[1], args[1] + args[2], args[2]}, 0, a0, step);
    }

    public static int factorial(int i) {
        return recursive(i, args -> new Integer[]{args[0] * args[1], args[1] + 1}, 1, 1);
    }

}
