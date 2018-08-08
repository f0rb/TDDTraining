package org.cyberdojo.tests;

/**
 * OneHundredDoors
 *
 * @author f0rb on 2018-08-07.
 */
public class OneHundredDoors {
    public static boolean[] pass(int pass) {
        boolean[] booleans = new boolean[100];

        for (int i = 1; i <= pass ; i++) {
            pass(i, booleans);
        }

        return booleans;
    }

    private static void pass(int pass, boolean[] booleans) {
        for (int i = pass - 1; i < booleans.length; i = i + pass) {
            booleans[i] = !booleans[i];
        }
    }
}
