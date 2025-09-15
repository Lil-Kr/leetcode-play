package com.cy.leetcodeplay.self.no2;

/**
 * @Author: Lil-K
 * @Date: 2025/9/15
 * @Description:
 * 题目:
 *  删除至少几个字符可以变为另一个字符串的子串
 *  给定两个字符串s1 和 s2
 *  返回s1至少删除多少字符可以成为s2的字串
 *
 */
public class Solution {

	/**
	 *
	 * @param str1
	 * @param str2
	 * @return
	 */
	public int minDelete(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		int n = s1.length, m = s2.length;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i ++) {
			dp[i][0] = i;
			for (int j = 1; j <= m; j ++) {
				if (s1[i - 1] == s2[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = dp[i - 1][j] + 1;
				}
			}
		}
		int ans = Integer.MAX_VALUE;
		for (int j = 0; j <= m; j ++) {
			ans = Math.min(ans, dp[n][j]);
		}
		return ans;
	}
}