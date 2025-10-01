package com.cy.leetcodeplay.dpintervals.no1547;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/1
 * @Description: no.1547. Minimum Cost to Cut a Stick
 * link: https://leetcode.com/problems/minimum-cost-to-cut-a-stick/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param n
	 * @param cuts
	 * @return
	 */
	public int minCost(int n, int[] cuts) {
		int m = cuts.length;
		Arrays.sort(cuts);

		int[] newCuts = new int[m + 2];
		for (int i = 0; i < m; i ++) {
			newCuts[i + 1] = cuts[i];
		}
		newCuts[0] = 0;
		newCuts[m + 1] = n;

		int[][] dp = new int[m + 2][m + 2];
		for (int i = 0; i < m + 2; i ++) {
			Arrays.fill(dp[i], -1);
		}

		return f1(newCuts, 1, m, dp);
	}

	/**
	 * 切点 [l ... r], 决定一个顺序
	 * 让切点都切完, 总代价最小
	 * @param cuts
	 * @param l
	 * @param r
	 * @return
	 */
	private int f1(int[] cuts, int l, int r, int[][] dp) {
		if (l > r) {
			return 0;
		}

		if (l == r) {
			return cuts[r + 1] - cuts[l - 1];
		}

		if (dp[l][r] != -1) {
			return dp[l][r];
		}

		int ans = Integer.MAX_VALUE;
		for (int mid = l; mid <= r; mid ++) {
			ans = Math.min(ans, f1(cuts, l, mid - 1, dp) + f1(cuts, mid + 1, r, dp));
		}
		ans += cuts[r + 1] - cuts[l - 1];
		dp[l][r] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param n
	 * @param cuts
	 * @return
	 */
	public int minCost2(int n, int[] cuts) {
		int m = cuts.length;
		Arrays.sort(cuts);

		int[] newCuts = new int[m + 2];
		for (int i = 0; i < m; i ++) {
			newCuts[i + 1] = cuts[i];
		}
		newCuts[0] = 0;
		newCuts[m + 1] = n;

		int[][] dp = new int[m + 2][m + 2];
		for (int l = 1; l <= m; l ++) {
			dp[l][l] = newCuts[l + 1] - newCuts[l - 1];
		}

		for (int l = m - 1, next; l >= 1; l --) {
			for (int r = l + 1; r <= m; r ++) {
				next = Integer.MAX_VALUE;
				for (int mid = l; mid <= r; mid ++) {
					next = Math.min(next, dp[l][mid - 1] + dp[mid + 1][r]);
				}
				dp[l][r] = newCuts[r + 1] - newCuts[l - 1] + next;
			}
		}
		return dp[1][m];
	}
}