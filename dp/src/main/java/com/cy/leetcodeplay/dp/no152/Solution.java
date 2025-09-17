package com.cy.leetcodeplay.dp.no152;

/**
 * @Author: Lil-K
 * @Date: 2025/9/16
 * @Description: no.152. Maximum Product Subarray
 * link: https://leetcode.com/problems/maximum-product-subarray/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param nums
	 * @return
	 */
	public int maxProduct(int[] nums) {
		int n = nums.length;
		int[][] dp = new int[n][2];
		int ans = nums[0];
		for (int i = 0; i < n; i ++) {
			int[] val = f1(nums, i, dp);
			ans = Math.max(ans, val[0]);
		}

		return ans;
	}

	private int[] f1(int[] nums, int i, int[][] dp) {
		if (i == 0) {
			dp[0][0] = nums[0];
			dp[0][1] = nums[0];
			return dp[0];
		}

		if (dp[i][0] != 0 || dp[i][1] != 0) {
			return dp[i];
		}

		int[] prev = f1(nums, i - 1, dp);
		int cur = nums[i];
		int maxVal = Math.max(cur, Math.max(cur * prev[0], cur * prev[1]));
		int minVal = Math.min(cur, Math.min(cur * prev[0], cur * prev[1]));

		dp[i][0] = maxVal;
		dp[i][1] = minVal;
		return dp[i];
	}
}