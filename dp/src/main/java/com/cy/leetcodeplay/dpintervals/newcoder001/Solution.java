package com.cy.leetcodeplay.dpintervals.newcoder001;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/3
 * @Description: 括号区间匹配
 * link: https://www.nowcoder.com/practice/e391767d80d942d29e6095a935a5b96b
 *
 * todo: 未录入Anki
 */
public class Solution {

	public int min(String str) {
		char[] s = str.toCharArray();
		int n = s.length;

		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(s, 0, n - 1, dp);
	}

	private int f1(char[] s, int l, int r, int[][] dp) {
		if (l == r) return 1;

		if (l == r - 1) {
			/**
			 * (), []  --> 0
			 */
			if ((s[l] == '(' && s[r] == ')') || (s[l] == '[' && s[r] == ']')) {
				return 0;
			}
			// (], [), ](, )[
			return 2;
		}

		if (dp[l][r] != -1) {
			return dp[l][r];
		}

		/**
		 * [(]
		 */
		int p1 = Integer.MAX_VALUE;
		if ((s[l] == '(' && s[r] == ')') || (s[l] == '[' && s[r] == ']')) {
			p1 = f1(s, l + 1, r - 1, dp);
		}

		/**
		 * [((
		 * 枚举 每个可能配对的划分点, 做左右划分
		 */
		int p2 = Integer.MAX_VALUE;
		for (int mid = l; mid < r; mid ++) {
			p2 = Math.min(p2, f1(s, l, mid, dp) + f1(s, mid + 1, r, dp));
		}
		int ans = Math.min(p1, p2);
		dp[l][r] = Math.min(p1, p2);
		return ans;
	}
}