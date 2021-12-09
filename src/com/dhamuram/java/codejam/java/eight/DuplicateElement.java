package com.dhamuram.java.codejam.java.eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElement {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 5,6, 12, 6,5, 1, 22, 66, 33, 33);
        HashSet<Integer> set = new HashSet<>();
        myList.stream().filter(integer -> !set.add(integer)).forEach(System.out::println);
    }
}
