package org.cyberdojo.tests;

import java.util.*;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * PrimeFactors
 *
 * @author f0rb on 2018-07-23.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PrimeFactors {
    private static Set<Integer> primeSet = new TreeSet<>(Arrays.asList(2, 3, 5, 7));

    public static List<Integer> process(int input) {
        if (input < 0) {
            List<Integer> results = new LinkedList<>();
            results.add(-1);
            results.addAll(process(-input));
            return results;
        } else if (input == 0 || input == 1) {
            return Arrays.asList();
        } else if (isPrime(input)) {
            return Arrays.asList(input);
        }

        int firstFactor;
        for (firstFactor = 2; firstFactor < input; firstFactor++) {
            if (isPrime(firstFactor) && isFactor(input, firstFactor)) {
                break;
            }
        }

        List<Integer> results = new LinkedList<>();
        results.add(firstFactor);
        results.addAll(process(input / firstFactor));
        return results;
    }

    private static boolean isFactor(int number, int factor) {
        return number % factor == 0;
    }

    public static boolean isPrime(int number) {
        if (number < 0) {
            number = -number;
        }

        addMissingPrime(number);

        if (!primeSet.contains(number)) {
            for (Integer prime : primeSet) {
                if (isFactor(number, prime)) {
                    return false;
                }
            }

        }
        return true;
    }

    private static void addMissingPrime(int number) {
        int biggestPrimeForNow = (int) primeSet.toArray()[primeSet.size() - 1];
        double sqrt = Math.sqrt(number);
        for (int i = biggestPrimeForNow + 1; i <= sqrt; i++) {
            if (isPrime(i)) {
                primeSet.add(i);
            }
        }
    }
}
