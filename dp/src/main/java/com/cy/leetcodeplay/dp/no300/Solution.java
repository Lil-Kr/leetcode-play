package com.cy.leetcodeplay.dp.no300;

/**
 * @Author: Lil-K
 * @Date: 2025/9/12
 * @Description: no.300. Longest Increasing Subsequence
 * link: https://leetcode.com/problems/longest-increasing-subsequence/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param nums
	 * @return
	 */
	public int lengthOfLIS(int[] nums) {
		return f1(nums);
	}

	private int f1(int[] nums) {
		int n = nums.length;
		int ans = 0;
		for (int i = 0; i < n; i ++) {
			ans = Math.max(ans, f1(nums, i));
		}
		return ans;
	}

	private int f1(int[] nums, int i) {
		int best = 1;
		for (int j = 0; j < i; j++) {
			if (nums[j] < nums[i]) {
				best = Math.max(best, 1 + f1(nums, j));
			}
		}
		return best;
	}

	/**
	 * solution2: recursive + memory search
	 * @param nums
	 * @return
	 */
	public int lengthOfLIS2(int[] nums) {
		return f2(nums);
	}

	private int f2(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = 1;

		int ans = 0;
		for (int i = 0; i < n; i ++) {
			ans = Math.max(ans, f2(nums, i, dp));
		}
		return ans;
	}

	private int f2(int[] nums, int i, int[] dp) {
		if (dp[i] != 0) return dp[i];
		dp[i] = 1;
		for (int j = 0; j < i; j++) {
			if (nums[j] < nums[i]) {
				dp[i] = Math.max(dp[i], 1 + f2(nums, j, dp));
			}
		}
		return dp[i];
	}

	/**
	 * solution3: dp
	 * @param nums
	 * @return
	 */
	public int lengthOfLIS3(int[] nums) {

		return 0;
	}
}