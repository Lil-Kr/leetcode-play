package com.cy.leetcodeplay.array.no27;

import com.cy.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2024/3/5
 * @Description:
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 *
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 *
 */
public class Solution {

    /**
     * 当遍历到第i个元素时 nums[0...i]包含所有非 val 的元素,
     * 并且 nums[0...k)中是按照顺序排列好的非 val 元素
     * 同时 nums[k...i]中包含所有的val元素
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i != k) {
                    CommonUtil.swap(nums, i, k);
                    k++;
                }else {
                    k++;
                }
            }
        }

        return k;
    }

}
