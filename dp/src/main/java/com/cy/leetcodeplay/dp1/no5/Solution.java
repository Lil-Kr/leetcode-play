package com.cy.leetcodeplay.dp1.no5;

/**
 * @Author: Lil-K
 * @Date: 2024/12/6
 * @Description: no.5. Longest Palindromic Substring
 * link: https://leetcode.com/problems/longest-palindromic-substring/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: 中心扩展法
	 * 枚举所有的字符作为中心的情况
	 * @param str
	 * @return
	 */
	public String longestPalindrome(String str) {
		int n = str.length();
		if (n <= 1) return str;

		int start = 0, maxLen = 1;

		for (int i = 0; i < n; i ++) {
			// handle even number string
			int l = i, r = i;
			while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
				l --;
				r ++;
			}

			int len = r - l - 1;

			if (len > maxLen) {
				maxLen = len;
				start = l + 1;
			}

			// handle odd number string
			l = i; r = i + 1;
			while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
				l --;
				r ++;
			}
			len = r - l - 1;
			if (len > maxLen) {
				maxLen = len;
				start = l + 1;
			}
		}
		return str.substring(start, start + maxLen);
	}

	/**
	 * solution2: dp
	 * @param str
	 * @return
	 */
	public String longestPalindrome2(String str) {
		char[] s = str.toCharArray();
		int n = s.length;
		if (n <= 1) return str;
		int start = 0, maxLen = 1;

		boolean[][] dp = new boolean[n][n];
		for (int i = 0; i < n; i ++) {
			dp[i][i] = true;
		}

		for (int len = 2; len <= n; len++) {
			for (int i = 0; i <= n - len; i++) {
				int j = i + len - 1;

				if (str.charAt(i) == str.charAt(j)) {
					if (len == 2) {
						dp[i][j] = true; // 相邻两个字符相等
					} else {
						dp[i][j] = dp[i + 1][j - 1]; // 看内部子串
					}
				} else {
					dp[i][j] = false;
				}

				if (dp[i][j] && len > maxLen) {
					maxLen = len;
					start = i;
				}
			}
		}

		return str.substring(start, start + maxLen);
	}

}
