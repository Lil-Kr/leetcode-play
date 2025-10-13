package com.cy.leetcodeplay.dpoptimizeenumeration.no629;

/**
 * @Author: Lil-K
 * @Date: 2025/10/13
 * @Description: no.629. K Inverse Pairs Array
 * link: https://leetcode.com/problems/k-inverse-pairs-array/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private static int mod = (int)Math.pow(10, 9) + 7;

	/**
	 * solution1: brute-force approach
	 * O(n * k^2)
	 * @param n
	 * @param k
	 * @return
	 */
	public int kInversePairs(int n, int k) {
		/**
		 * dp[i][j]: 1, 2, 3 ... i 这些数字, 形成的排列一定要有j个逆序对,
		 * 有多少种这样的排列
		 */
		int[][] dp = new int[n + 1][k + 1];
		dp[0][0] = 1;

		for (int i = 1; i <= n; i ++) {
			dp[i][0] = 1;
			for (int j = 1; j <= k; j ++) {
				if (i > j) {
					for (int p = 0; p <= j; p ++) {
						dp[i][j] = (dp[i][j] + dp[i - 1][p]) % mod;
					}
				} else {
					for (int p = j - i + 1; p <= j; p ++) {
						dp[i][j] = (dp[i][j] + dp[i - 1][p]) % mod;
					}
				}
			}
		}
		return dp[n][k];
	}

	/**
	 * solution2: optimize brute-farce
	 * O(n * k)
	 * @param n
	 * @param k
	 * @return
	 */
	public int kInversePairs2(int n, int k) {
		int[][] dp = new int[n + 1][k + 1];
		dp[0][0] = 1;

		for (int i = 1, window; i <= n; i ++) {
			dp[i][0] = 1;
			window = 1;
			for (int j = 1; j <= k; j ++) {
				if (i > j) {
					window = (window + dp[i - 1][j]) % mod;
				} else {
					window = ((window + dp[i - 1][j]) % mod - dp[i - 1][j - i] + mod) % mod;
				}
				dp[i][j] = window;
			}
		}
		return dp[n][k];
	}
}