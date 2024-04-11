package com.cy.leetcodeplay.array1.no209;

/**
 * @Author: Lil-K
 * @Date: 2024/4/11
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = 0;
        int i = 0;
        int j = 1;
        while (i <= j) {
            if (nums[i] + nums[j] < target) {
                j++;
            } else {
                i++;
            }
            minLength = Math.abs(i - j);
        }
        return minLength;
    }

}