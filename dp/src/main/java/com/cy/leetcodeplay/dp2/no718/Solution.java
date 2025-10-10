package com.cy.leetcodeplay.dp2.no718;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/10
 * @Description: no.718. Maximum Length of Repeated Subarray
 * link: https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int findLength(int[] nums1, int[] nums2) {
		int n = nums1.length, m = nums2.length;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}

		int ans = 0;
		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= m; j ++) {
				ans = Math.max(ans, f1(nums1, nums2, i, j, dp));
			}
		}

		return ans;
	}

	// f(i, j) = nums1[i]位置 与 nums2[j]位置 开始寻找最长公共子数组
	private int f1(int[] nums1, int[] nums2, int i, int j, int[][] dp) {
		if (i == 0 || j == 0) {
			return 0;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int ans;
		if (nums1[i - 1] == nums2[j - 1]) {
			ans = 1 + f1(nums1, nums2, i - 1, j - 1, dp);
		} else {
			// 不相等时需要断开, 因为是求子数组, 非子序列
			ans = 0;
		}
		dp[i][j] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int findLength2(int[] nums1, int[] nums2) {
		int n = nums1.length, m = nums2.length;

		int[][] dp = new int[n + 1][m + 1];

		int ans = 0;
		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= m; j ++) {
				if (nums1[i - 1] == nums2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
					ans = Math.max(ans, dp[i][j]);
				}
			}
		}

		return ans;
	}
}