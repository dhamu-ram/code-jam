package com.dhamuram.leetcode;

public class GoalString {
    public static void main(String[] args) {
        GoalString solution = new GoalString();
        System.out.println(solution.interpret("(al)G(al)()()G"));
    }

    public String interpret(String command) {

        char[] commandArray = command.toCharArray();

        int i = 0;

        StringBuilder sb = new StringBuilder();

        while (i < (commandArray.length)) {

            if (commandArray[i] == 'G') {
                sb.append("G");
                System.out.println("G");
                i = i + 1;
            } else if (commandArray[i + 1] == ')') {
                sb.append("o");
                System.out.println("o");
                i = i + 2;
            } else {
                sb.append("al");
                System.out.println("al");
                i = i + 4;
            }
        }

        return sb.toString();
    }
}
