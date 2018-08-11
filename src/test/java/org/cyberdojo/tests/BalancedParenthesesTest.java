package org.cyberdojo.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * BalancedParenthesesTest
 *
 * Write a program to determine if the the parentheses (),
 * the brackets [], and the braces {}, in a string are balanced.
 *
 * For example:
 *
 * {{)(}} is not balanced because ) comes before (
 *
 * ({)} is not balanced because ) is not balanced between {}
 *      and similarly the { is not balanced between ()
 *
 * [({})] is balanced
 *
 * {}([]) is balanced
 *
 * {()}[[{}]] is balanced
 *
 * @author f0rb on 2018-08-07.
 */
public class BalancedParenthesesTest {
    @Test
    public void test_succeed() {
        assertTrue(BalancedParentheses.isBalanced("{}"));
        assertTrue(BalancedParentheses.isBalanced("()"));
        assertTrue(BalancedParentheses.isBalanced("[]"));
        assertTrue(BalancedParentheses.isBalanced("{{a}}"));
        assertTrue(BalancedParentheses.isBalanced("[({})]"));
        assertTrue(BalancedParentheses.isBalanced("{()}[[{}]]"));
    }

    @Test
    public void test_not_balanced() {
        assertFalse(BalancedParentheses.isBalanced("{"));
        assertFalse(BalancedParentheses.isBalanced("{{[}}"));
        assertFalse(BalancedParentheses.isBalanced("{{]}}"));
        assertFalse(BalancedParentheses.isBalanced("{{)(}}"));
        assertFalse(BalancedParentheses.isBalanced("({)}"));
        assertFalse(BalancedParentheses.isBalanced("(]"));
        assertFalse(BalancedParentheses.isBalanced("]"));
    }
}
