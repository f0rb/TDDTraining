package org.cyberdojo.tests;

import java.util.ArrayList;
import java.util.List;

/**
 * Diversion
 * <p>
 * Think of binary numbers: sequences of 0's and 1's.
 * How many n-digit binary numbers are there that
 * don't have two adjacent 1 bits?
 * <p>
 * For example, for three-digit numbers, Five of the
 * possible eight combinations meet the criteria:
 * <p>
 * 000, 001, 010, 011, 100, 101, 110, 111.
 * <p>
 * What is the number for sequences of length 4, 5, 10, n?
 * <p>
 * Having worked out the pattern, there's a second part to
 * the question: can you prove why that relationship exists?
 * <p>
 * (Source http://codekata.pragprog.com,
 * Code Kata Fifteen -- A Diversion)
 *
 * @author f0rb on 2018-07-20.
 */
public class Diversion {
    public static int execute(int n) {

        //根据n得到 [0 - 2^n-1] 共2^n个数字
        //将这2^n个数字转为n位的2进制字符串
        //数字中含有两个相邻的1时计数加一
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            numberList.add(i);
        }
        return (int) numberList
                .stream()
                .map(t -> convertNumberToBinaryString(t, n))
                .filter(Diversion::hasNoTwoAdjacentOnes)
                .count();
    }

    private static boolean hasNoTwoAdjacentOnes(String s) {
        return !Diversion.hasTwoAdjacentOnes(s);
    }

    public static boolean hasTwoAdjacentOnes(String s) {
        return s.contains("11");
    }

    public static String convertNumberToBinaryString(int number, int len) {
        String binaryString = Integer.toBinaryString(number);

        StringBuilder left = new StringBuilder();
        while (left.length() < len - binaryString.length()) {
            left.append('0');
        }
        return left.toString() + binaryString;
    }
}
