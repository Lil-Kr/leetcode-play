package com.cy.leetcodeplay.array1.no167;

/**
 * @Author: Lil-K
 * @Date: 2024/4/11
 * @Description: Two Sum II - Input Array Is Sorted
 */
public class Solution {

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) return new int[]{0, 0};

        int j = numbers.length - 1;
        int i = 0;

        while (true) {
            if (i >= j) {
                return new int[]{0, 0};
            }

            if ((numbers[i] + numbers[j]) == target) {
                return new int[]{i+1, j+1};
            }else if ((numbers[i]+ numbers[j]) < target) {
                i++;
            }else {
                j--;
            }
        }
    }
}