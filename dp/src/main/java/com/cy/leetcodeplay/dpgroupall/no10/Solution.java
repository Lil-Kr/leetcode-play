package com.cy.leetcodeplay.dpgroupall.no10;

/**
 * @Author: Lil-K
 * @Date: 2025/9/26
 * @Description: no.10. Regular Expression Matching
 * link: https://leetcode.com/problems/regular-expression-matching/description/
 *
 * todo: 未录入Anki
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

	/**
	 * s[i ... n-1] matched p[j ... m - 1] or not?
	 * p[j] 一定不会指向 '*'
	 * @param s
	 * @param p
	 * @param i
	 * @param j
	 * @return
	 */
	private boolean f1(char[] s, char[] p, int i, int j) {
		// 当s[i]已经扫描完毕
		if (i == s.length) {
			// 当p[j]也扫描完毕
			if (j == p.length) {
				return true;
			} else {
				/**
				 * 当 p[j] 之后还有剩余字符, 并且保证 p[j + 1] == '*', 将 * 纳入考虑范围, 是有可能匹配成功的
				 *  1. s: "", p: "a*b*c*" --> true
				 *  2. s: "", p: "*" --> 不会出现该case
				 */
				return j + 1 < p.length && p[j + 1] == '*' && f1(s, p, i, j + 2);
			}
		} else if (j == p.length) {
			// 当 s[i] 还有剩余, 且 p[j] 已经扫描完毕, 必定 return false
			return false;
		} else {
			/**
			 * 当 s[i] 和 p[j] 都有剩余的时
			 * j + 1 == p.length  --> 含义: p[j] 位置 不是 '*'
			 */
			if (j + 1 == p.length || p[j + 1] != '*') {
				return (s[i] == p[j] || p[j] == '.') && f1(s, p, i + 1, j + 1);
			} else {
				/**
				 * p[j + 1] == '*'
				 * 到这里, 就是 完全背包 的特性, p[j] 可以一直停留, 去匹配 s[i + 1 ... n - 1]
				 * res1: s = 'abcd', p = 'a*abcd', 往后要让 s[i] 与 p[j + 2] 进行比较
				 * res2: s = 'abcd', p = '.bcd'
				 */
				boolean res1 = f1(s, p, i, j + 2);
				boolean res2 = (s[i] == p[j] || p[j] == '.') && f1(s, p, i + 1, j);
				return res1 || res2;
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
		 * dp[i][0] == 0, 表示没计算过
		 * dp[i][1] == 1, 表示计算过, 答案是 true
		 * dp[i][2] == 2, 表示计算过, 答案是 false
		 */
		int[][] dp = new int[n + 1][m + 1];
		return f2(s, p, 0, 0, dp);
	}

	private boolean f2(char[] s, char[] p, int i, int j, int[][] dp) {
		if (dp[i][j] != 0) {
			return dp[i][j] == 1;
		}
		boolean ans;
		// 当s[i]已经扫描完毕
		if (i == s.length) {
			// 当p[j]也扫描完毕
			if (j == p.length) {
				ans = true;
			} else {
				/**
				 * 当 p[j] 之后还有剩余字符, 并且保证 p[j + 1] == '*', 将 * 纳入考虑范围, 是有可能匹配成功的
				 *  1. s: "", p: "a*b*c*" --> true
				 *  2. s: "", p: "*" --> 不会出现该case
				 */
				ans = j + 1 < p.length && p[j + 1] == '*' && f2(s, p, i, j + 2, dp);
			}
		} else if (j == p.length) {
			// 当 s[i] 还有剩余, 且 p[j] 已经扫描完毕, 必定 return false
			ans = false;
		} else {
			/**
			 * 当 s[i] 和 p[j] 都有剩余的时
			 * j + 1 == p.length  --> 含义: p[j] 位置 不是 '*'
			 */
			if (j + 1 == p.length || p[j + 1] != '*') {
				ans = (s[i] == p[j] || p[j] == '.') && f2(s, p, i + 1, j + 1, dp);
			} else {
				/**
				 * p[j + 1] == '*'
				 * 到这里, 就是 完全背包 的特性, p[j] 可以一直停留, 去匹配 s[i + 1 ... n - 1]
				 * res1: s = 'abcd', p = 'a*abcd', 往后要让 s[i] 与 p[j + 2] 进行比较
				 * res2: s = 'abcd', p = '.bcd'
				 */
				boolean res1 = f2(s, p, i, j + 2, dp);
				boolean res2 = (s[i] == p[j] || p[j] == '.') && f2(s, p, i + 1, j, dp);
				ans = res1 || res2;
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
		/**
		 * dp[i][0] == 0, 表示没计算过
		 * dp[i][1] == 1, 表示计算过, 答案是 true
		 * dp[i][2] == 2, 表示计算过, 答案是 false
		 */
		boolean[][] dp = new boolean[n + 1][m + 1];
		dp[n][m] = true;
		for (int j = m - 1; j >= 0; j --) {
			dp[n][j] = j + 1 < m && p[j + 1] == '*' && dp[n][j + 2];
		}
		for (int i = n - 1; i >= 0; i --) {
			for (int j = m - 1; j >= 0; j --) {
				if (j + 1 == m || p[j + 1] != '*') {
					dp[i][j] = (s[i] == p[j] || p[j] == '.') && dp[i + 1][j + 1];
				} else {
					/**
					 *
					 boolean res1 = f2(s, p, i, j + 2, dp);
					 boolean res2 = (s[i] == p[j] || p[j] == '.') && f2(s, p, i + 1, j, dp);
					 */
					dp[i][j] = dp[i][j + 2] || ((s[i] == p[j] || p[j] == '.') && dp[i + 1][j]);
				}
			}
		}
		return dp[0][0];
	}
}