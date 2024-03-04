package com.cy.leetcodeplay.questionnumber.no283;

import com.cy.common.util.CommonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2023/8/24
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
 */
public class No_283_MoveZeroes {

    /**
     * 解法一: 通过三个循环
     * @param nums
     */
    public void moveZeroes_1(int[] nums) {
        if (nums == null) {
            return;
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        for (int i = list.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /**
     * 解法二: 双指针
     * 往前覆盖, 第二个k指针到数组结结束都赋值为 0
     * @param nums
     */
    public void moveZeroes_2(int[] nums) {
        if (nums == null) {
            return;
        }

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /**
     * 解法三: 原地操作, 只是用一个循环
     * 遍历到第i个元素后,保证[0...i]中所有非0元素, 都按照顺序排列在 [0...k) 中
     * 同时, [k...i] 为 0
     * @param nums
     */
    public void moveZeroes_3(int[] nums) {
        if (nums == null) {
            return;
        }

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != k) {// 如果整个数组全都是非0元素时, 不需要自己与自己交换, i 和 k 保持同步, k 需要单独 ++
                    CommonUtil.swap(nums, i, k);
                    k++;
                }else {
                    k++;
                }
            }
        }
    }

}