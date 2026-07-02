package com.dhamuram.codejam.hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> compareTriplets = new ArrayList<>();

        Object[] aa = a.toArray();
        Object[] bb = b.toArray();

        int a_count = 0;
        int b_count = 0;

        for(int i = 0; i <= 2; i++){
            if ((int) aa[i] > (int) bb[i]) {
                a_count ++;
            } else if ((int) aa[i] < (int) bb[i]) {
                b_count ++;
            }
        }

        compareTriplets.add(a_count);
        compareTriplets.add(b_count);

        return compareTriplets;
    }
}

public class CompareTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

