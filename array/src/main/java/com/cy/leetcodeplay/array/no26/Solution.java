package com.cy.leetcodeplay.array.no26;

/**
 * @Author: Lil-K
 * @Date: 2024/3/5
 * @Description: Remove Duplicates from Sorted Array
 *
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 * 解法: 双指针
 * 前提: 数组是有序的
 * 第一个元素肯定是不重复的, 所以 k 从索引 1 的位置开始记录
 * 用 i 与 i+1 比较, 如果不相等说明进入到了下一个不重复的元素, 并于 k 交换, 此时k的位置就纳入第二个不重复的元素, k++
 * k 的位置始终记录 i 指向的第一个不重复的元素, 直到 i 遍历完整个数组
 */
public class Solution {

    /**
     * 前提: 数组是有序的
     * 第一个元素肯定是不重复的, 所以 k 从索引 1 的位置开始
     * 用 i 与 i+1 比较, 如果不相等说明进入到了下一个不重复的元素, 并于 k 交换, 此时k的位置就纳入第二个不重复的元素, k++
     * k 的位置始终记录 i 指向的第一个不重复的元素
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[k] = nums[i+1];
                k++;
            }
        }
        return k;
    }

    /**
     * 解法2
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
