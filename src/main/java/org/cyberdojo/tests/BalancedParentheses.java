package org.cyberdojo.tests;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * BalancedParentheses
 *
 * @author f0rb on 2018-08-07.
 */
public class BalancedParentheses {
    private BalancedParentheses() {
    }

    public static boolean isBalanced(String input) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ((c == ')' || c == ']' || c == '}') && (stack.isEmpty() || !isPair(stack.pop(), c))) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isPair(char left, char right) {
        switch (left) {
            case '(':
                return right == ')';
            case '[':
                return right == ']';
            case '{':
            default:
                return right == '}';
        }
    }
}
