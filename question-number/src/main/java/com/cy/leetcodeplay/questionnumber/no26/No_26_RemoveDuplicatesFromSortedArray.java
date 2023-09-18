package com.cy.leetcodeplay.questionnumber.no26;

/**
 * @Author: Lil-K
 * @Date: 2023/9/18
 * @Description: 在一个有序的数组中去重, 返回去重之后的元素个数
 * No-26 Remove Duplicates from Sorted Array
 */
public class No_26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
    }

    public static int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0)
            return 0;

        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k] = nums[i+1];
                k++;
            }
        }
        return k;
    }
}