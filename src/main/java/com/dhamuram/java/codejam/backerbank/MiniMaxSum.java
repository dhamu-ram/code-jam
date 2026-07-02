package com.dhamuram.java.codejam.backerbank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1);

        MiniMaxSum.miniMaxSum(arr);
    }

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {

        // Write your code here
        Collections.sort(arr);

        BigInteger sum = BigInteger.valueOf(arr.get(1)).add(BigInteger.valueOf(arr.get(2))).add(BigInteger.valueOf(arr.get(3)));

        BigInteger min = sum.add(BigInteger.valueOf(arr.get(0)));
        BigInteger max = sum.add(BigInteger.valueOf(arr.get(4)));

        System.out.println(min + " "+ max);
    }
}
