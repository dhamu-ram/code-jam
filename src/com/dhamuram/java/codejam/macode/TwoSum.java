package com.dhamuram.java.codejam.macode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ints = TwoSum.twoSum(nums, 7);

        for (int num : ints) {
            System.out.println(num);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        Map twoSum = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int diff = target - num;

            if (twoSum.containsKey(num)) {
                return new int[]{i, (Integer) twoSum.get(num)};
            } else {
                twoSum.put(diff, i);
            }
        }
        return new int[]{0, 0};
    }
}
