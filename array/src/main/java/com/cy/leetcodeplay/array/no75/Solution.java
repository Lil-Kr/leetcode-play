package com.cy.leetcodeplay.array.no75;

import com.cy.leetcodeplay.matrix.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2024/3/7
 * @Description: Sort Colors
 *
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 *
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] is either 0, 1, or 2.
 *
 * 数量范围非常有限的情况下, 可以使用计数排序
 * 更好的实现方式是三路快排
 */
public class Solution {

    /**
     * 时间复杂度: O(n)
     * 空间复杂度: O(1)
     * 遍历整个数组一遍
     * @param nums
     */
    public void sortColors(int[] nums) {
        int zero = -1; // nums[0...zero] == 0
        int two = nums.length; // nums[two ... n-1] == 2

        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                CommonUtil.swap(nums, two-1, i);
                two--;
            } else { // nums[i] == 0
                assert nums[i] == 0;
                CommonUtil.swap(nums, zero+1, i);
                i++;
                zero++;
            }
        }
    }
}