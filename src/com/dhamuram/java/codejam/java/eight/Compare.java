package com.dhamuram.java.codejam.java.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Compare {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 34, 11,45,88, 34, 1, 10, 99);

        //Collections.sort(integers, (i, j) -> i.compareTo(j));

        System.out.println( integers.toString());
    }
}
