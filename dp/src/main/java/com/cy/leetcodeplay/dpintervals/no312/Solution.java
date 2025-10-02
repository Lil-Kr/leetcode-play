package com.cy.leetcodeplay.dpintervals.no312;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/2
 * @Description: no.312. Burst Balloons
 * link: https://leetcode.com/problems/burst-balloons/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param nums
	 * @return
	 */
	public int maxCoins(int[] nums) {
		int n = nums.length;
		int[] arr = new int[n + 2];
		arr[0] = 1;
		arr[n + 1] = 1;
		for (int i = 1; i <= n; i ++) {
			arr[i] = nums[i - 1];
		}

		int[][] dp = new int[n + 2][n + 2];
		for (int i = 0; i < arr.length; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(arr, 1, n, dp);
	}

	private int f1(int[] arr, int l, int r, int[][] dp) {
		if (dp[l][r] != -1) {
			return dp[l][r];
		}

		int ans;
		if (l == r) {
			ans = arr[l - 1] * arr[l] * arr[r + 1];
		} else {
			/**
			 * 1 step: get result for end point, last to burst
			 * [l ... r]  --> get nums[l] and nums[r] value
			 * res = Math.max(value[l], value[r]);
			 */
			ans = Math.max(
				arr[l - 1] * arr[l] * arr[r + 1] + f1(arr, l + 1, r, dp),
				arr[l - 1] * arr[r] * arr[r + 1] + f1(arr, l, r - 1, dp));

			/**
			 * 2 step: [l + 1 ... r - 1]
			 * each nums to try and recursive for last to burst one by one
			 */
			for (int k = l + 1; k < r; k ++) {
				ans = Math.max(ans,
					arr[l - 1] * arr[k] * arr[r + 1] + f1(arr, l, k - 1, dp) + f1(arr, k + 1, r, dp));
			}
		}
		dp[l][r] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * O(n^3)
	 * @param nums
	 * @return
	 */
	public int maxCoins2(int[] nums) {
		int n = nums.length;
		int[] arr = new int[n + 2];
		arr[0] = 1;
		arr[n + 1] = 1;
		for (int i = 1; i <= n; i ++) {
			arr[i] = nums[i - 1];
		}

		int[][] dp = new int[n + 2][n + 2];
		for (int i = 1; i <= n; i ++) {
			dp[i][i] = arr[i - 1] * arr[i] * arr[i + 1];
		}

		for (int l = n, ans; l >= 1; l --) {
			for (int r = l + 1; r <= n; r ++) {
				ans = Math.max(
					arr[l - 1] * arr[l] * arr[r + 1] + dp[l + 1][r],
					arr[l - 1] * arr[r] * arr[r + 1] + dp[l][r - 1]);
				for (int k = l + 1; k < r; k ++) {
					ans = Math.max(ans,
						arr[l - 1] * arr[k] * arr[r + 1] + dp[l][k - 1] + dp[k + 1][r]);
				}
				dp[l][r] = ans;
			}
		}
		return dp[1][n];
	}
}