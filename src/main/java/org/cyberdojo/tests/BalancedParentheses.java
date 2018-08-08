package org.cyberdojo.tests;

import java.util.Stack;

/**
 * BalancedParentheses
 *
 * @author f0rb on 2018-08-07.
 */
public class BalancedParentheses {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty() || !isPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private static boolean isPair(char left, char right) {
        if (left == '(') {
            return right == ')';
        }
        if (left == '[') {
            return right == ']';
        }
        if (left == '{') {
            return right == '}';
        }
        return false;
    }
}
