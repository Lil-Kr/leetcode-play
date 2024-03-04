package com.cy.leetcodeplay.questionnumber.no27;


import com.cy.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2023/9/16
 * @Description: Remove Element
 *
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 *  Input: nums = [0,1,2,2,3,0,4,2], val = 2
 *  Output: 5, nums = [0,1,4,0,3,_,_,_]
 */
public class No_27_RemoveElement {

    /**
     * 定义2个指针, k 和 i 起始位置都是从0开始, 遍历一遍数组
     * 确保: [k...i) 之间的数据都是指定的元素 val
     * @param nums
     * @param val
     * @return k --> k的索引位置就是 [0 ...k] 不等于 val的元素个数
     */
    public static int removeElement(int[] nums, int val) {
        if (null == nums)
            return 0;

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                if (k != i){
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