package com.dhamuram.java.codejam.macode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses ValidParentheses = new ValidParentheses();
        String s = "{)){}";
        boolean isValid = ValidParentheses.isValid(s);
        System.out.println(isValid);
    }

    private boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
