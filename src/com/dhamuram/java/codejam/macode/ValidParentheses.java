package com.dhamuram.java.codejam.macode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses ValidParentheses = new ValidParentheses();
        String s = "]";
        boolean isValid = ValidParentheses.isValid(s);
        System.out.println(isValid);
    }

    private boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        stack.push(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.size() != 0 && stack.peek() == c) {
                stack.pop();
            } else {
                if (c == '{') {
                    stack.push('}');
                } else if (c == '[') {
                    stack.push(']');
                } else if (c == '(') {
                    stack.push(')');
                }
            }
        }
        return stack.size() == 0;
    }
}
