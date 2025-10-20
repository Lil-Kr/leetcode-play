package com.cy.leetcodeplay.dpmaxsubarraysum.no213;

/**
 * @Author: Lil-K
 * @Date: 2024/11/3
 * @Description: no.213. House Robber II
 * link: https://leetcode.com/problems/house-robber-ii/description/
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		if (nums.length == 1) return nums[0];
		int n = nums.length;

		return Math.max(best(nums, 1, n - 1), nums[0] + best(nums, 2, n - 2));
	}

	/**
	 * nums[l ... r] 范围上, 没有环形的概念
	 * @param nums
	 * @param l
	 * @param r
	 * @return 可以随意选择, 但不能选择响铃数字的情况下, 最大累加和
	 */
	private int best(int[] nums, int l, int r) {
		if (l > r) {
			return 0;
		}
		if (l == r) {
			return nums[l];
		}

		if (l + 1 == r) {
			return Math.max(nums[l], nums[r]);
		}

		int prepre = nums[l];
		int pre = Math.max(nums[l], nums[l + 1]);
		for (int i = l + 2, cur; i <= r; i++) {
			cur = Math.max(pre, nums[i] + Math.max(0, prepre));
			prepre = pre;
			pre = cur;
		}
		return pre;
	}

}