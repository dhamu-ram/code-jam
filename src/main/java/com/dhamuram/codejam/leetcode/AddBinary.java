package com.dhamuram.leetcode;

public class AddBinary {

    public static void main(String[] args) {
        AddBinary  addBinary = new AddBinary();

        String x = "011011";
        String y = "1010111";

        String solution = addBinary.sum(x, y);

        System.out.println("Solution : " + solution);
    }
    public String sum(String a, String b) {

        if (a.isEmpty() || b.isEmpty()) {
            return null;
        }

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder stringBuilder = new StringBuilder();

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
