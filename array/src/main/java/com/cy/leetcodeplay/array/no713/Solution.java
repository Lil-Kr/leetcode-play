package com.cy.leetcodeplay.array.no713;

/**
 * @Author: Lil-K
 * @Date: 2024/4/16
 * @Description: 713. Subarray Product Less Than K
 * Given an array of integers nums and an integer k,
 * return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
 * 给定一个大于0的整型数组和 整型k, 找出 所有连续的子数组, 乘积小于k, 最后返回这些子数组的数量(有多少个这样的子数组)
 */
public class Solution {

  /**
   *
   * @param nums
   * @param k
   * @return
   */
  public int numSubarrayProductLessThanK(int[] nums, int k) {
    if (nums.length == 0 || k == 0) {
      return 0;
    }

    int l = 0, r = 0;
    int count = 0, sum = 1;

    while (r < nums.length) {
      sum *= nums[r];

      /**
       * 只需要过滤
       */
      while (l <= r && sum >= k) {
        sum /= nums[l];
        l++;
      }

      count += r - l + 1; // 这里 r - l + 1  包括了 [l ... r]所有组合
      r++;
    }

    return count;
  }
}
