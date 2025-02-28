package com.cy.leetcodeplay.matrix.dp.no91;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/5
 * @Description: 91. Decode Ways
 * link: https://leetcode.com/problems/decode-ways/description/
 *
 * todo: 未录入题库
 */
public class Solution {

	/**
	 * 解法一: 暴力递归
	 * s[i ... s.length() - 1] 有多少种有效的方案
	 * @param s
	 * @return
	 */
	public int numDecodings(String s) {
		return f1(s.toCharArray(), 0);
	}

	private int f1(char[] s, int i) {
		/**
		 * i == s.length 表示: 越界的时候 返回空字符串, 也是一种情况
		 */
		if (i == s.length) return 1;

		int ans;
		if (s[i] == '0') {
			ans = 0;
		} else { // s[i] == '0'
			ans = f1(s, i + 1);
			if (i + 1 < s.length && ((s[i] - '0') * 10 + (s[i + 1] - '0')) <= 26) {
				ans += f1(s, i + 2);
			}
		}
		return ans;
	}

	/**
	 * 解法二: 递归 + 记忆化查询
	 * @param s
	 * @return
	 */
	public int numDecodings2(String s) {
		int[] dp = new int[s.length()];
		Arrays.fill(dp, -1);

		return f2(s.toCharArray(), 0, dp);
	}

	private int f2(char[] s, int i, int[] dp) {
		/**
		 * i == s.length 表示: 越界的时候 返回空字符串, 也是一种情况
		 */
		if (i == s.length) return 1;

		if (dp[i] != -1) return dp[i];

		int ans;
		if (s[i] == '0') {
			ans = 0;
		} else { // s[i] == '0'
			ans = f2(s, i + 1, dp);
			if (i + 1 < s.length && ((s[i] - '0') * 10 + (s[i + 1] - '0')) <= 26) {
				ans += f2(s, i + 2, dp);
			}
		}
		dp[i] = ans;
		return dp[i];
	}

	/**
	 * 解法三: 带dp表的动态规划
	 * @param s
	 * @return
	 */
	public int numDecodings3(String s) {
		int n = s.length();
		int[] dp = new int[n + 1];
		dp[n] = 1;

		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == '0') {
				dp[i] = 0;
			} else { // s[i] == '0'
				dp[i] = dp[i + 1];

				if (i + 1 < s.length() && ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0')) <= 26) {
					dp[i] += dp[i + 2];
				}
			}
		}
		return dp[0];
	}

	/**
	 * 解法四: 优化带有dp表的动态规划, 省去 dp 表
	 * int next = i+1 的值,  int nextNext = i + 2 的值, int cur = next + nextNext
	 * @param s
	 * @return
	 */
	public int numDecodings4(String s) {
		int n = s.length();

		/**
		 * next = dp[i+ 1]
		 * nextNext = 不存在的值
		 */
		int next = 1, nextNext = 0;
		int cur = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == '0') {
				cur = 0;
			} else { // s[i] == '0'
				cur = next;

				if (i + 1 < s.length() && ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0')) <= 26) {
					cur += nextNext;
				}
			}
			/**
			 * cur next nextNext
			 * ?   cur  next
			 */
			nextNext = next;
			next = cur;
		}
		return next;
	}
}