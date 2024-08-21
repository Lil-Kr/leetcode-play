package com.cy.leetcodeplay.array.no80;

/**
 * @Author: Lil-K
 * @Date: 2024/3/5
 * @Description: Remove Duplicates from Sorted Array II
 *
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3]
 * Output: 5, nums = [1,1,2,2,3,_]
 *
 * Example 2:
 * Input: nums = [0,0,1,1,1,1,2,3,3]
 * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
 *
 * 解法: 双指针
 * 关键点: 数组必须是有序的
 *  1. 如果数组的个数 <= 2, 就直接返回元素个数
 *  2. 第一个元素肯定是固定的, 所以 k 和 i 都从索引[1]的位置开始
 *  3. 要保证去重后每个数字都有2个, 那么每组不同数字的间隔就是2, 设定为 k-2, k-2的间距就意味着 [k-2...k)区间内的元素是相同的
 *  4. i 作为游标遍历每一个元素, 保证 nums[k-2] != nums[i]时, 此时nums[i]与nums[k-2]已经是不同的元素了(进入下一组元素), 此时就可以做 nums[k] = nums[i] 操作,
 *  5. 此时[k-2...k)就保证保留了相同的2个元素, 最终循环结束时 [0...k)中的元素就符合题意
 */
public class Solution {

    /**
     * 解法: 双指针
     * 关键点: 数组必须是有序的
     *  1. 如果数组的个数 <= 2, 就直接返回元素个数
     *  2. 第一个元素肯定是固定的, 所以 k 和 i 都从索引[1]的位置开始, k 作为一个不同元素之间的分界点
     *  3. 要保证去重后每个数字都有2个, 那么每组不同数字的间隔就是2, 设定为 k-2, k-2的间距就意味着 [k-2...k)区间内的元素是相同的
     *  4. i 作为游标遍历每一个元素, 保证 nums[k-2] != nums[i]时, 此时nums[i]与nums[k-2]已经是不同的元素了(进入下一组元素), 此时就可以做 nums[k] = nums[i] 操作
     *  5. 此时[k-2...k)就保证保留了相同的2个元素, 最终循环结束时 [0...k)中的元素就符合题意
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (k == 1 || nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    /**
     * 解法二, 此方法更清晰
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[k - 2] != nums[i]) {
                if (i != k) {
                    nums[k] = nums[i];
                    k++;
                } else {
                    k++;
                }
            }
        }

        return k;
    }

}
