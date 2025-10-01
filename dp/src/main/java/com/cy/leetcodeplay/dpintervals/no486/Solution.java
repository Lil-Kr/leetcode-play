package com.cy.leetcodeplay.dpintervals.no486;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/30
 * @Description: no.486. Predict the Winner
 * link: https://leetcode.com/problems/predict-the-winner/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param nums
	 * @return
	 */
	public boolean predictTheWinner(int[] nums) {
		int n = nums.length;
		int sum = Arrays.stream(nums).sum();

		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		int p1 = f1(nums, 0, n - 1, dp);
		int p2 = sum - p1;
		return p1 >= p2;
	}

	/**
	 * @return p1 final point
	 */
	private int f1(int[] nums, int l, int r, int[][] dp) {
		if (dp[l][r] != -1) {
			return dp[l][r];
		}

		if (l == r) return nums[l];
		if (l + 1 == r) return Math.max(nums[l], nums[r]);

		// [l .. r] have more two numbers
		int sum1 = nums[l] + Math.min(f1(nums, l + 2, r, dp), f1(nums, l + 1, r - 1, dp));
		int sum2 = nums[r] + Math.min(f1(nums, l + 1, r - 1, dp), f1(nums, l, r - 2, dp));

		dp[l][r] = Math.max(sum1, sum2);
		return dp[l][r];
	}

	/**
	 * solution2: dp
	 * @param nums
	 * @return
	 */
	public boolean predictTheWinner2(int[] nums) {
		int n = nums.length;
		if (n == 1) return true;

		int sum = Arrays.stream(nums).sum();

		int[][] dp = new int[n][n];
		for (int l = 0; l < n - 1; l ++) {
			dp[l][l] = nums[l];
			dp[l][l + 1] = Math.max(nums[l], nums[l + 1]);
		}

		for (int l = n - 3; l >= 0; l --) {
			for (int r = l + 2; r < n; r ++) {
				dp[l][r] = Math.max(nums[l] + Math.min(dp[l + 2][r], dp[l + 1][r - 1]), nums[r] + Math.min(dp[l + 1][r - 1], dp[l][r - 2]));
			}
		}

		int p1 = dp[0][n - 1];
		int p2 = sum - p1;
		return p1 >= p2;
	}

}