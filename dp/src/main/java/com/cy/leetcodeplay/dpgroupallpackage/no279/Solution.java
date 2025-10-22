package com.cy.leetcodeplay.dpgroupallpackage.no279;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/27
 * @Description: no.279. Perfect Squares
 * link: https://leetcode.com/problems/perfect-squares/description/
 */
public class Solution {


	/**
	 * solution1: recursive
	 * @param n
	 * @return
	 */
	public int numSquares(int n) {
		// 确定平方范围
		int m = (int)Math.sqrt(n);
		// 创建数组
		int[] nums = new int[m];
		for (int i = 1; i <= m; i ++) {
			nums[i - 1] = i * i;
		}

		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return f1(nums, n, dp);
	}

	private int f1(int[] nums, int target, int[] dp) {
		if (target == 0) {
			return 0;
		}

		if (dp[target] != -1) {
			return dp[target];
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i ++) {
			if (target >= nums[i]) {
				int sub = f1(nums, target - nums[i], dp) + 1;
				ans = Math.min(ans, sub);
			}
		}
		dp[target] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param n
	 * @return
	 */
	public int numSquares2(int n) {
		if (n == 1) return 1;
		int m = (int)Math.sqrt(n);

		if (n - (int)Math.pow(m, 2) == 0) return 1;

		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;

		for (int i = 1; i * i <= n; i ++) {
			int squares = i * i;
			for (int j = squares; j <= n; j ++) {
				dp[j] = Math.min(dp[j], dp[j - squares] + 1);
			}
		}
		return dp[n];
	}
}