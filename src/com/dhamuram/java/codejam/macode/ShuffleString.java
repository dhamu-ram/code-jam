package com.dhamuram.leetcode;

public class ShuffleString {

    public static void main(String[] args) {
        ShuffleString solution = new ShuffleString();

       int[] indices =  {4,5,6,7,0,2,1,3};
        System.out.println(solution.restoreString("codeleet", indices));
    }

    public String restoreString(String s, int[] indices) {

        char[] ca = s.toCharArray();
        char[] fa = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            System.out.println(i  + " " + indices[i] + " " + ca[indices[i]]);
                fa[indices[i]] = ca[i];
        }

        return String.valueOf(fa);
    }
}
