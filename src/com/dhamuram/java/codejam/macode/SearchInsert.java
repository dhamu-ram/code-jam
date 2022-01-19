package com.dhamuram.java.codejam.macode;

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = {1,2,5,6,};
        int index = SearchInsert.searchInsert(nums, 4);
        System.out.println("Index: " + index);
    }

    public static int searchInsert(int[] nums, int target) {

        if (target < nums[0]) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = nums[mid];

            if (midVal == target) {
                return mid;
            } else {
                if (midVal > target) {
                    high = high - 1;
                } else {
                    low = low + 1;
                }
            }
        }
        return low;
    }
}
