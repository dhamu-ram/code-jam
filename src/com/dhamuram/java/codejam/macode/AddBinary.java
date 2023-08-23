package com.dhamuram.leetcode;

import java.util.Arrays;

public class AddBinary {

    public static void main(String[] args) {
        AddBinary  addBinary = new AddBinary();

        String solution = addBinary.sum("11", "1");
    }

    public String sum(String a, String b) {


        if (a.isEmpty() || b.isEmpty()) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i <= 0 || j <= 0) {

            if(i > 0) {
                a.charAt(i);
            }

            if (j > 0) {
                b.charAt(j);
            }


            i--;
            j--;
        }

        return sb.toString();
    }
}
