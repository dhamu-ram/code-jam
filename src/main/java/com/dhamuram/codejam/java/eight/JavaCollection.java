package com.dhamuram.codejam.java.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaCollection {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("drgs", "crgs", "brgs", "trgs", "ergs");

        Collections.sort(strings);

        System.out.println(strings);
    }
}
