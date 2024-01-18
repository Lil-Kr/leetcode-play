package com.cy.leetcodeplay.questionnumber.no80;

/**
 * @Author: Lil-K
 * @Date: 2023/9/18
 * @Description: Remove Duplicates from Sorted Array II
 *
 *  在排好序的数组中移除元素, 每个唯一的元素最多出现2次
 *  Input: nums = [1,1,1,2,2,3]
 *  Output: 5, nums = [1,1,2,2,3,_]
 *
 *  Input: nums = [0,0,1,1,1,1,2,3,3]
 *  Output: 7, nums = [0,0,1,1,2,3,3,_,_]
 */
public class No_80_RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
//        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 2, 2};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    /**
     * 1. k 与 i 起始位置一样
     * 2. 前2个元素可以是任意值 --> k < 2 的情况下让 k++ 就行
     * 3. k-2 的位置 与 当前i访问的元素不相等, 说明 到了下一个阶段, 并且将k的值替换为i的值, 这样 [k-2 ... k) 是符合要求最多只出现2次
     * 4. 当 k-2 的位置 与 当前i访问的元素相等时, 让 i 继续访问下一个元 --> i++
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (null == nums)
            return 0;

        if (nums.length < 3)
            return nums.length;

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k < 2 || nums[k - 2] != nums[i]) {
                if(nums[k] != nums[i]) {
                    nums[k] = nums[i];
                    k++;
                }else {
                    k++;
                }
            }
        }
        return k;
    }

}