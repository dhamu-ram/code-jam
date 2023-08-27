package com.dhamuram.java.codejam.macode;

import java.util.HashMap;

public class NextGreatest {

    public static void main(String[] args) {
        int[] array1 = {4, 1, 2};
        int[] array2 = {1, 3, 4, 2};
        int[] ints = nextGreatest(array1, array2);
        for (int a : ints) {
            System.out.print(a + "," );
        }
    }

    private static int[] nextGreatest(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextGreatest = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            for (int j = i; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    nextGreatest.put(nums2[i], nums2[j]);
                    break;
                }
                if (j == i) {
                    nextGreatest.put(nums2[i], -1);
                }
            }
        }

        for (int k = 0; k < nums1.length; k++) {
            int val = nums1[k];
            int great = nextGreatest.get(val);
            nums1[k] = great;
        }
        return nums1;
    }
}
