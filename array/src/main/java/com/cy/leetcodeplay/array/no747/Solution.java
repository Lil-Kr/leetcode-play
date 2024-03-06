package com.cy.leetcodeplay.array.no747;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/3/6
 * @Description: Largest Number At Least Twice of Others
 *
 * You are given an integer array nums where the largest integer is unique.
 *
 * Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 *
 * Constraints:
 *
 * 2 <= nums.length <= 50
 * 0 <= nums[i] <= 100
 * The largest element in nums is unique.
 */
public class Solution {


    public int dominantIndex(int[] nums) {
        int[] tempArray = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(nums);

        int maxVal = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) continue;
            if (maxVal / nums[i] < 2) {
                return -1;
            }
        }

        for (int i = 0; i < tempArray.length; i++) {
            if (maxVal == tempArray[i]) return i;
        }
        return -1;
    }

    /**
     * optimization
     * 关键点: 找到第一大的数和第二大的数
     * 如果第二大的元素 * 2 == 最大的元素, 此时最大的元素肯定也是其余元素的 至少2倍
     * @param nums
     * @return
     */
    public int dominantIndex2(int [] nums) {

        int first = -1;
        int second = -1;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }

        return first >= 2 * second ? index : -1;
    }

}
