package com.dhamuram.java.codejam.gforg;

// { Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long[] a = new long[(int) (n)];
            // long getAnswer[] = new long[(int)(n)];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Compute obj = new Compute();
            pair product = Compute.getMinMax(a, n);
            System.out.println(product.first + " " + product.second);

        }
    }
}

// } Driver Code Ends

class Compute {
    static pair getMinMax(long[] a, long n) {
        //Write your code here
        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;

        for (int i = 0; i <= (n - 1); i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }
        return (new pair(min, max));
    }
}
