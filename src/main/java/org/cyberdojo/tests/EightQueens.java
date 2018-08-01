package org.cyberdojo.tests;

import java.util.*;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static java.lang.Math.abs;

/**
 * EightQueens
 * <p>
 * Place eight chess queens on an 8x8 chessboard so that
 * no two queens threaten each other. Thus, a solution
 * requires that no two queens share the same row,
 * column, or diagonal.
 * <p>
 * [source: http://en.wikipedia.org/wiki/Eight_queens_puzzle]
 *
 * @author f0rb on 2018-07-22.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EightQueens {


    public static final int QUEENS_COUNT = 8;

    public static List<int[]> execute() {

        int[] result = new int[QUEENS_COUNT];

        List<int[]> results = new ArrayList<>();
        executeNext(results, result, 0, new LinkedHashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7)));
        return results;

    }

    private static void executeNext(List<int[]> results, int[] result, int index, Set<Integer> candidateNumberSet) {
        if (index == result.length) {
            results.add(Arrays.copyOf(result, result.length));
        } else {
            for (Integer i : candidateNumberSet) {
                if (isPositionAvailable(result, index, i)) {
                    result[index] = i;
                    Set<Integer> leftSet = new LinkedHashSet<>(candidateNumberSet);
                    leftSet.remove(i);
                    executeNext(results, result, index + 1, leftSet);
                }
            }
        }
    }

    private static boolean isPositionAvailable(int[] result, int index, int position) {
        for (int i = 0; i < index; i++) {
            if (index - i == abs(position - result[i])) {
                return false;
            }
        }
        return true;
    }
}
