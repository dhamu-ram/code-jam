package com.dhamuram.codejam.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class PlusMinusDecimalResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float count = arr.size();

        float positive = 0.0f;
        float negative = 0.0f;
        float zero = 0.0f;

        for (Integer val : arr) {
            if (val > 0) {
                positive++;
            } else if (val < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.6f%n", positive / count);
        System.out.printf("%.6f%n", negative / count);
        System.out.printf("%.6f%n", zero / count);
    }
}

public class PlusMinusDecimalResult {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinusDecimalResult.plusMinus(arr);

        bufferedReader.close();
    }
}
