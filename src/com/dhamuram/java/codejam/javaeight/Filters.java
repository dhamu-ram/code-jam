package com.dhamuram.java.codejam.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5);

        List<Integer> collect = num.stream().map(n -> n * 2).collect(Collectors.toList());

        System.out.println(collect); //[2, 4, 6, 8, 10]

    }
}
