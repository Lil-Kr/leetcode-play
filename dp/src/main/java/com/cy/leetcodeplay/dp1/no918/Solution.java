package com.cy.leetcodeplay.dp1.no918;

/**
 * @Author: Lil-K
 * @Date: 2025/9/17
 * @Description: no.918. Maximum Sum Circular Subarray
 * link: https://leetcode.com/problems/maximum-sum-circular-subarray/description/
 * todo: 未录入Anki
 *
 * 本题与 no.53 类似, no.53 要求取数组由子数组组成的最大累加和,
 * 本题思路为: 数组中累加总和 - 由子数组组成的最小累加和, 再处理最小累加和 == 数组总和 的特殊情况
 */
public class Solution {

	/**
	 * solution1: dp
	 * @param nums
	 * @return
	 */
	public int maxSubarraySumCircular(int[] nums) {
		int n = nums.length;
		int all = nums[0], max = nums[0], min = nums[0];

		for (int i = 1, maxpre = nums[0], minpre = nums[0]; i < n; i ++) {
			all += nums[i];
			maxpre = Math.max(nums[i], nums[i] + maxpre);
			max = Math.max(max, maxpre);

			minpre = Math.min(nums[i], nums[i] + minpre);
			min = Math.min(min, minpre);
		}

		return all == min ? max : Math.max(max, all - min);
	}


}