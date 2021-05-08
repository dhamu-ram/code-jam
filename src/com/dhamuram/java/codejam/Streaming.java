package com.dhamuram.java.codejam;

import java.util.ArrayList;
import java.util.List;

public class Streaming {
    public static void main(String[] args) {

        // Add the item to the list.
        List<Integer> strings = new ArrayList<>();
        strings.add(1);
        strings.add(2);
        strings.add(3);
        strings.add(4);
        strings.add(5);
        strings.add(6);
        strings.add(7);
        strings.add(8);

        // Stream, filter and foreach
        strings.stream().filter(i -> (i % 2 == 0)).forEach(i -> System.out.println(i));
    }
}
