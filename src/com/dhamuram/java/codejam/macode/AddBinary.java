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

        StringBuilder stringBuilder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0) {

            int sum = carry;

            if(i > 0) {
                sum += a.charAt(i) - '0';
            }

            if (j > 0) {
                sum += b.charAt(j) - '0';
            }

           if (sum == 0 || sum == 1) {
               stringBuilder.append("0");
               carry = 0;
           } else if (sum  == 2) {
               stringBuilder.append("0");
               carry = 1;
           } else {
               stringBuilder.append("1");
               carry = 1;
           }

            i--;
            j--;
        }

        if (carry == 1) {
            stringBuilder.append("1");
        }

        return stringBuilder.reverse().toString();
    }
}
