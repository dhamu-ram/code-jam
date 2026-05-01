package com.dhamuram.java.codejam.backerbank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();

        arr.add(11);
        arr.add(10);
        arr.add(-13);
        arr.add(-15);
        arr.add(0);

        PlusMinus.plusMinus(arr);

    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double size = arr.size();

        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (Integer number : arr) {
            if (number > 0) {
                positive = positive + 1;
            } else if (number < 0) {
                negative = negative + 1;
            } else if (number == 0) {
                zero = zero + 1;
            }
        }

        System.out.println(positive / size);
        System.out.println(negative / size);
        System.out.println(zero / size);
    }
}



