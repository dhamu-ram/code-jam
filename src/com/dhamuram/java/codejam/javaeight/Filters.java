package com.dhamuram.java.codejam.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = num.stream().map(n -> n * 2).collect(Collectors.toList());

        System.out.println(collect); //[2, 4, 6, 8, 10]

        List<Integer> FilterCollect = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(FilterCollect); //[2, 4]
    }
}
