package com.cy.leetcodeplay.array.no209;

/**
 * @Author: Lil-K
 * @Date: 2024/4/11
 * @Description: 209. Minimum Size Subarray Sum
 */
public class Solution {

    /**
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     * @param target 目标和
     * @param nums 给定数组
     * @return
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = -1; // nums[l ... r] 为滑动窗口
        int sum = 0; //
        int res = nums.length + 1; // 记录子数组的长度, 初始值为一个不可能达到的长度, 这里为整个数组长度 + 1

        while (l < nums.length) { // l 不会超过右边界
            if (sum < target && r + 1 < nums.length) {
//                r++;
                sum += nums[++r];
            } else {
                sum -= nums[l++];
//                l++;
            }

            if (sum >= target) {
                res = Math.min(res, r - l + 1);
            }
        }

        if (res == nums.length + 1) {
            return 0;
        }else {
            return res;
        }

    }

}