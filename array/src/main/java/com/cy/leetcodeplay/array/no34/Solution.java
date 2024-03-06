package com.cy.leetcodeplay.array.no34;

/**
 * @Author: Lil-K
 * @Date: 2024/3/6
 * @Description: no.34
 * title: Find First and Last Position of Element in Sorted Array
 *
 *
 */
public class Solution {

    /**
     * 对撞指针
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int[] t_not = {-1, -1};

        if (nums.length == 0) return t_not;
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            }else {
                return t_not;
            }
        }

        int startPoint = 0;
        int endPoint = nums.length - 1;

        while (nums[startPoint] != nums[endPoint] && startPoint <= endPoint) {
            if (nums[startPoint] != target) {
                startPoint++;
            }

            if (nums[endPoint] != target) {
                endPoint--;
            }
        }

        if (startPoint > endPoint || nums[startPoint] != target || nums[endPoint] != target) return t_not;

        return new int[]{startPoint, endPoint};
    }

}
