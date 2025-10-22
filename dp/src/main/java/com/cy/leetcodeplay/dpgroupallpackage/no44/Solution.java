package com.cy.leetcodeplay.dpgroupallpackage.no44;

/**
 * @Author: Lil-K
 * @Date: 2025/9/26
 * @Description: no.44. Wildcard Matching
 * link: https://leetcode.com/problems/wildcard-matching/
 *
 * todo: 未录入Anki
 * this question seams like no.10, but this question is more easy
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param str
	 * @param pat
	 * @return
	 */
	public boolean isMatch(String str, String pat) {
		char[] s = str.toCharArray();
		char[] p = pat.toCharArray();

		return f1(s, p, 0, 0);
	}

	private boolean f1(char[] s, char[] p, int i, int j) {
		if (i == s.length) {
			if (j == p.length) {
				return true;
			} else {
				/**
				 * 当 p[j] 之后还有剩余字符, 并且保证 p[j + 1] == '*'
				 *  1. s = '', p = '**' --> true
				 */
				return p[j] == '*' && f1(s, p, i, j + 1);
			}
		} else if (j == p.length) {
			/**
			 * 当 s[i] 还有剩余, 且 p[j] 已经扫描完毕, 必定 return false
			 */
			return false;
		} else {
			/**
			 * 当 s[i] 和 p[j] 都有剩余字符时
			 *  1. s[i] == p[j]
			 */
			if (p[j] != '*') {
				return (s[i] == p[j] || p[j] == '?') && f1(s, p, i + 1, j + 1);
			} else {
				return f1(s, p, i, j + 1) || f1(s, p, i + 1, j);
			}
		}
	}

	/**
	 * solution2: memory search
	 * @param str
	 * @param pat
	 * @return
	 */
	public boolean isMatch2(String str, String pat) {
		char[] s = str.toCharArray();
		char[] p = pat.toCharArray();
		int n = s.length, m = p.length;
		/**
		 * dp[i][0] = 0, 表示未计算过
		 * dp[i][1] = 1, 表示计算过, 结果为 true
		 * dp[i][2] = 2, 表示计算过, 结果为 false
		 */
		int[][] dp = new int[n + 1][m + 1];
		return f2(s, p, 0, 0, dp);
	}

	private boolean f2(char[] s, char[] p, int i, int j, int[][] dp) {
		if (dp[i][j] != 0) {
			return dp[i][j] == 1;
		}
		boolean ans;
		if (i == s.length) {
			if (j == p.length) {
				ans = true;
			} else {
				/**
				 * 当 p[j] 之后还有剩余字符, 并且保证 p[j + 1] == '*'
				 *  1. s = '', p = '**' --> true
				 */
				ans = p[j] == '*' && f2(s, p, i, j + 1, dp);
			}
		} else if (j == p.length) {
			/**
			 * 当 s[i] 还有剩余, 且 p[j] 已经扫描完毕, 必定 return false
			 */
			ans = false;
		} else {
			/**
			 * 当 s[i] 和 p[j] 都有剩余字符时
			 *  1. p[j] != '*', p[j] 有可能为 '?', '任意字母'
			 */
			if (p[j] != '*') {
				ans = (s[i] == p[j] || p[j] == '?') && f2(s, p, i + 1, j + 1, dp);
			} else {
				/**
				 * 当 s[i] == 'abcd', p[j] == '*'
				 * 当 s[i] == 'abcd', p[j] == '*a*d'
				 */
				ans = f1(s, p, i, j + 1) || f1(s, p, i + 1, j);
			}
		}
		dp[i][j] = ans ? 1 : 2;
		return ans;
	}

	/**
	 * solution3: dp
	 * @param str
	 * @param pat
	 * @return
	 */
	public boolean isMatch3(String str, String pat) {
		char[] s = str.toCharArray();
		char[] p = pat.toCharArray();
		int n = s.length, m = p.length;

		boolean[][] dp = new boolean[n + 1][m + 1];
		dp[n][m] = true;
		for (int j = m - 1; j >= 0; j --) {
			dp[n][j] = p[j] == '*' && dp[n][j + 1];
		}

		for (int i = n - 1; i >= 0; i --) {
			for (int j = m - 1; j >= 0; j --) {
				if (p[j] != '*') {
					dp[i][j] = (s[i] == p[j] || p[j] == '?') && dp[i + 1][j + 1];
				} else {
					dp[i][j] = dp[i][j + 1] || dp[i + 1][j];
				}
			}
		}
		return dp[0][0];
	}

	/**
	 * solution4: dp + space compression
	 * @param str
	 * @param pat
	 * @return
	 */
	public boolean isMatch4(String str, String pat) {
		char[] s = str.toCharArray();
		char[] p = pat.toCharArray();
		int n = s.length, m = p.length;

		boolean[][] dp = new boolean[n + 1][m + 1];
		dp[n][m] = true;

		return dp[0][0];
	}
}