package com.cy.leetcodeplay.array.no283;

import com.cy.leetcodeplay.matrix.common.util.CommonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/3/5
 * @Description:
 * No-283
 *  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *  Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 *  Input: nums = [0,1,0,3,12]
 *  Output: [1,3,12,0,0]
 *
 * Example 2:
 *  Input: nums = [0]
 *  Output: [0]
 *
 *  移动之后保持非0元素的相对位置不变
 *
 *
 */
public class Solution
{

    /**
     * solution 1
     * 使用了3个循环
     * @param nums
     */
    public static void moveZeroes1(int[] nums) {
        if (nums.length == 0) return;

        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                tempList.add(nums[i]);
            }
        }

        for (int i = 0; i < tempList.size(); i++) {
            nums[i] = tempList.get(i);
        }

        for (int i = tempList.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /**
     * solution 2
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        if (nums.length == 0) return;

        int j = 0; // nums[0...k)的元素均为非0元素

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /**
     * solution 3
     * 遍历到第i个元素后, 保证[0...i]中包含了所有非0元素
     * 并都按照顺序排列在[0...k)中
     * 同时, [k...i]为0
     * @param nums
     */
    public static void moveZeroes3(int[] nums) {
        if (nums.length == 0) return;

        int j = 0; // nums[0...k)的元素均为非0元素

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                CommonUtil.swap(nums, i, j);
                j++;
            }
        }
    }

    /**
     * solution 4
     * 遍历到第i个元素后, 保证[0...i]中包含了所有非0元素
     * 并都按照顺序排列在[0...k)中
     * 同时, [k...i]为0
     *
     * case: 如果整个数组都是非0元素, 就不需要swap操作
     * @param nums
     */
    public static void moveZeroes4(int[] nums) {
        if (nums.length == 0) return;

        int j = 0; // nums[0...j)的元素均为非0元素

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (j != i) {
                    CommonUtil.swap(nums, i, j);
                    j++;
                }else { // i == j
                    j++;
                }
            }
        }
    }

}
