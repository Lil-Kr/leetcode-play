package com.cy.leetcodeplay.greedy.no334;

/**
 * @Author: Lil-K
 * @Date: 2025/10/25
 * @Description: no.334. Increasing Triplet Subsequence
 * link: https://leetcode.com/problems/increasing-triplet-subsequence/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: greedy
	 * @param nums
	 * @return
	 */
	public boolean increasingTriplet(int[] nums) {
		int n = nums.length;
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		for (int i = 0; i < n; i ++) {
			if (nums[i] <= first) {
				first = nums[i];
			} else if (nums[i] <= second) {
				second = nums[i];
			} else {
				return true;
			}
		}
		return false;
	}
}