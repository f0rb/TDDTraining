package org.cyberdojo.tests;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * CountCoins
 * <p>
 * There are four types of common coins in US currency:
 * quarters (25 cents)
 * dimes (10 cents)
 * nickels (5 cents)
 * pennies (1 cent)
 * <p>
 * There are 6 ways to make change for 15 cents:
 * A dime and a nickel;
 * A dime and 5 pennies;
 * 3 nickels;
 * 2 nickels and 5 pennies;
 * A nickel and 10 pennies;
 * 15 pennies.
 * <p>
 * How many ways are there to make change for a dollar
 * using these common coins? (1 dollar = 100 cents).
 * <p>
 * [Source http://rosettacode.org]
 *
 * @author f0rb on 2018-07-20.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CountCoins {

    public static List<int[]> count(int total) {
        List<int[]> result = new ArrayList<>();
        int quarters;
        int nickles;
        int dimes;
        for (quarters = 0; quarters <= total / 25; quarters++) {
            for (nickles = 0; nickles <= (total - quarters * 25) / 10; nickles++) {
                for (dimes = 0; dimes <= (total - quarters * 25 - nickles * 10) / 5; dimes++) {
                    result.add(new int[]{total - quarters * 25 - nickles * 10 - dimes * 5, dimes, nickles, quarters});
                }
            }
        }

        return result;
    }
}
