package com.cy.leetcodeplay.dp.no32;

/**
 * @Author: Lil-K
 * @Date: 2024/11/8
 * @Description: no.32. Longest Valid Parentheses
 * link: https://leetcode.com/problems/longest-valid-parentheses/description/
 *
 * todo: 未录入题库
 *
 * 以左括号 ( 结尾的情况下, 都是不正确的, 所以从右往左推
 */
public class Solution {

	/**
	 * dp[i] 的含义: 存放必须以i结尾的子串中, 合法字符串的长度
	 * 最后求出 dp 中的最大值
	 *
	 * dp[0 ... n-1]
	 * dp[i]: 子串必须以i位置的字符结尾的情况, 往左最多推多远能整体有效
	 * @param s
	 * @return
	 */
	public int longestValidParentheses(String s) {
		if (s.length() <= 1) return 0;
		char[] chs = s.toCharArray();
		int[] dp = new int[chs.length];
		int ans = 0;

		for (int i = 1, p; i < s.length(); i++) {
			if (chs[i] == ')') {
				p = i - dp[i - 1] - 1;
				if (p >= 0 && chs[p] == '(') {
					dp[i] = dp[i - 1] + 2 + (p > 0 ? dp[p - 1] : 0);
				}
			}
			ans = Math.max(ans, dp[i]);
		}

		return ans;
	}
}