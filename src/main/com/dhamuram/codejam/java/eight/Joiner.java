package com.dhamuram.java.codejam.java.eight;

import java.util.StringJoiner;

public class Joiner {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("/");
        joiner.add("user");
        joiner.add("data");
        joiner.add("codeJam");

        System.out.println(joiner);
    }
}
