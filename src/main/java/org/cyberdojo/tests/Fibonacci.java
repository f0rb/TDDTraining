package org.cyberdojo.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Fibonacci
 *
 * @author f0rb on 2018-09-01.
 */
public class Fibonacci {

    private static final Map<Integer, Integer> memos = new HashMap<>(32);

    private static int doCalc(int i) {
        System.out.println("calc for " + i);
        if (i <= 1) {
            return 1;
        }
        return calc(i - 1) + calc(i - 2);
    }

    public static int calc(int i) {
        return memos.computeIfAbsent(i, Fibonacci::doCalc);
    }


    //public static int calc(int i) {
    //    if (i <= 1) {
    //        return 1;
    //    }
    //    return result(i, 1);
    //}
    //
    //public static void main(String[] args) {
    //    //System.out.println(result(2, 1, 1));
    //    //System.out.println(result(20, 1, 1));
    //    //System.out.println(pow(2, 10));
    //    //System.out.println(pow(2, 5));
    //    //System.out.println(pow(10, 5));
    //
    //
    //    System.out.println(fib(10));
    //}
    //
    //private static int fib(int n) {
    //    return fib(n, 1, 1);
    //}
    //
    //private static int pow(int base, int component) {
    //    return pow(component, 1, base);
    //}
    //
    //public static int result(int i, int result, int lastResult) {
    //    if (i == 1) {
    //        return result;
    //    }
    //    return result(i - 1, result + lastResult, result);
    //}
    //
    //public static int pow(int i, int result, int arg) {
    //    if (i == 1) {
    //        return multiply(result, arg);
    //    }
    //    System.out.println(result);
    //    return pow(i - 1, multiply(result, arg), arg);
    //}
    //
    //private static int multiply(int result, int arg) {
    //    return result * arg;
    //}
    //
    //private static int fib(int n, int a1, int a2) {
    //    if (n == 1) {
    //        return a1 + a2;
    //    }
    //    return fib(n - 1, a1 + a2, a2);
    //}
    //
    //public int calc(int... args) {
    //    return
    //}
    //
    //private static int result(int i, int result1) {
    //    int result;
    //
    //    if (i == 0) {
    //        result = result1;
    //    } else if (i == 1) {
    //        result = result1;
    //    } else if (i == 2) {
    //        result = result(1,  result1 + result(1, 1));
    //    } else if (i == 3) {
    //        int a = result(1, 1);
    //        int b = result(2, 1);
    //        result = result(1, a + b);
    //    } else {
    //        result = calc(i - 1) + calc(i - 2);
    //    }
    //
    //
    //    return result;
    //}


    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));


        System.out.println(pow(2, 5));
        System.out.println(pow(10, 3));


        System.out.println(fac(5));



    }

    private static int fac(int i) {
        return recursive(i - 1, args -> new int[] {args[0] * args[1], args[1] + 1}, 1, 1);
    }

    private static int pow(int base, int exponent) {
        return recursive(exponent, args -> new int[] {args[0] * args[1], args[1]}, 1, base);
    }

    private static Object fib(int n) {
        return recursive(n, args -> new int[]{args[0] + args[1], args[0]}, 1, 1);
    }

    private static int[] calc(Function<int[], int[]> func, int[] args) {
        return func.apply(args);
    }

    private static int recursive(int n, Function<int[], int[]> func, int... args) {
        if (n == 0) {
            return args[0];
        }
        return recursive(n - 1, func, calc(func, args));
    }

    public static int[] doFib(int[] args) {
        return new int[]{args[0] + args[1], args[0]};
    }

    private static Object fib(int[] args) {
        return null;
    }
}
