package com.cy.leetcodeplay.dpintervals.no1000;

/**
 * @Author: Lil-K
 * @Date: 2025/10/4
 * @Description: no.1000. Minimum Cost to Merge Stones
 * link: https://leetcode.com/problems/minimum-cost-to-merge-stones/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * O(n^3)
	 * @param stones
	 * @param k
	 * @return
	 */
	public int mergeStones(int[] stones, int k) {
		int n = stones.length;
		if ((n - 1) % (k - 1) != 0) return -1;

		int[] preSum = new int[n + 1];
		for (int i = 1; i <= n; i ++) {
			preSum[i] = preSum[i - 1] + stones[i - 1];
		}

		int[][] dp = new int[n][n];
		return f1(stones, 0, n - 1, k, preSum, dp);
	}

	/**
	 * f1: 以[l ... r] 范围内合并直到不能再合并为止
	 */
	private int f1(int[] stones, int l, int r, int k, int[] preSum, int[][] dp) {
		// 不能再拆分的情况
		if (l == r) return 0;

		if (dp[l][r] != 0) {
			return dp[l][r];
		}

		int ans = Integer.MAX_VALUE;
		for (int mid = l; mid < r; mid += k - 1) {
			ans = Math.min(ans, f1(stones, l, mid, k, preSum, dp) + f1(stones, mid + 1, r, k, preSum, dp));
		}

		/**
		 * final: add last group
		 */
		if ((r - l) % (k - 1) == 0) {
			ans += preSum[r + 1] - preSum[l];
		}
		dp[l][r] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * O(n^3)  --> the performance optimization is slowly than solution1
	 * @param stones
	 * @param k
	 * @return
	 */
	public static int mergeStones2(int[] stones, int k) {
		int n = stones.length;
		if ((n - 1) % (k - 1) != 0) {
			return -1;
		}
		int[] presum = new int[n + 1];
		// 多补了一个0位置，l...r累加和 : presum[r+1] - presum[l]
		for (int i = 0, j = 1, sum = 0; i < n; i++, j++) {
			sum += stones[i];
			presum[j] = sum;
		}
		// dp[l][r] : l...r范围上的石头，合并到不能再合并（份数是确定的），最小代价是多少
		int[][] dp = new int[n][n];
		for (int l = n - 2, ans; l >= 0; l--) {
			for (int r = l + 1; r < n; r++) {
				ans = Integer.MAX_VALUE;
				for (int m = l; m < r; m += k - 1) {
					ans = Math.min(ans, dp[l][m] + dp[m + 1][r]);
				}
				if ((r - l) % (k - 1) == 0) {
					// 最终一定能划分成一份，那么就再加合并代价
					ans += presum[r + 1] - presum[l];
				}
				dp[l][r] = ans;
			}
		}
		return dp[0][n - 1];
	}
}