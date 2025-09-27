package com.cy.leetcodeplay.dp1.no152;

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
		int curMax = Math.max(cur, Math.max(cur * prev[0], cur * prev[1]));
		int curMin = Math.min(cur, Math.min(cur * prev[0], cur * prev[1]));

		dp[i][0] = curMax;
		dp[i][1] = curMin;
		return dp[i];
	}

	/**
	 * solution2: dp
	 * this solution support both of double and int
	 * @param nums
	 * @return
	 */
	public int maxProduct2(int[] nums) {
		int n = nums.length;
		int ans = nums[0];
		for (int i = 1, min = nums[0], max = nums[0], curMin, curMax; i < n; i ++) {
			curMin = Math.min(nums[i], Math.min(min * nums[i], max * nums[i]));
			curMax = Math.max(nums[i], Math.max(min * nums[i], max * nums[i]));
			min = curMin;
			max = curMax;
			ans = Math.max(ans, max);
		}
		return ans;
	}

}