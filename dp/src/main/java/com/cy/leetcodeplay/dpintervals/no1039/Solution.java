package com.cy.leetcodeplay.dpintervals.no1039;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/1
 * @Description: no.1039. Minimum Score Triangulation of Polygon
 * link: https://leetcode.com/problems/minimum-score-triangulation-of-polygon/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param values
	 * @return
	 */
	public int minScoreTriangulation(int[] values) {
		int n = values.length;
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(values, 0,n - 1, dp);
	}

	private int f1(int[] values, int l, int r, int[][] dp) {
		if (dp[l][r] != -1) {
			return dp[l][r];
		}

		int ans = Integer.MAX_VALUE;
		if (l == r || l + 1 == r) {
			ans = 0;
		} else {
			for (int mid = l + 1; mid < r; mid ++) {
				ans = Math.min(ans, values[l] * values[mid] * values[r] + f1(values, l, mid, dp) + f1(values, mid, r, dp));
			}
		}
		dp[l][r] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * O(n^3) -- > the optimization is slowly then solution1
	 * @param values
	 * @return
	 */
	public int minScoreTriangulation2(int[] values) {
		int n = values.length;
		int[][] dp = new int[n][n];
		for (int l = n - 3; l >= 0; l --) {
			for (int r = l + 2; r < n; r ++) {
				dp[l][r] = Integer.MAX_VALUE;
				for (int mid = l + 1; mid < r; mid ++) {
					dp[l][r] = Math.min(dp[l][r], values[l] * values[mid] * values[r] + dp[l][mid] + dp[mid][r]);
				}
			}
		}
		return dp[0][n - 1];
	}
}