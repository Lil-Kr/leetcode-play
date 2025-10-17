package com.cy.leetcodeplay.dp2.no1143;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/12/6
 * @Description: no.1143. Longest Common Subsequence
 * link: https://leetcode.com/problems/longest-common-subsequence/description/
 *
 * todo: 未录入Anki
 *
 * 解题思路:
 *  1. 定好范围之后, 过结尾作为开始来讨论
 *  2. 这道题还有一个重要的性质, 字符串的范围
 */
public class Solution {

	/**
	 * 解法一: 暴力递归
	 * 缺点: 边界条件比较麻烦
	 * @param text1
	 * @param text2
	 * @return
	 */
	public int longestCommonSubsequence(String text1, String text2) {
		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();

		int n = s1.length;
		int m = s2.length;

		return f1(s1, s2, n - 1, m - 1);
	}

	/**
	 * s1[0 ... i] 与 s2[0 ... j]最长公共子序列长度
	 * @return
	 */
	private int f1(char[] s1, char[] s2, int i, int j) {
		/**
		 * i 和 j 是可能为负数的, 这样 dp 表就越界了
		 */
		if (i < 0 || j < 0) return 0;

		int p1 = f1(s1, s2, i - 1, j - 1);
		int p2 = f1(s1, s2, i, j - 1);
		int p3 = f1(s1, s2, i - 1, j);
		int p4 = s1[i] == s2[j] ? (p1 + 1) : 0;
		return Math.max(Math.max(p1, p2), Math.max(p3, p4));
	}


	/**
	 * 解法二: 暴力递归
	 * 1. 规避复杂的边界条件
	 * 2. 很多时候往往不使用下标来定义尝试, 而是用长度来定义尝试
	 *  因为长度最短是0, 而下标越界的话讨论起来就比较麻烦
	 * @param text1
	 * @param text2
	 * @return
	 */
	public int longestCommonSubsequence2(String text1, String text2) {
		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();

		int n = s1.length;
		int m = s2.length;

		return f2(s1, s2, n, m);
	}

	/**
	 * s1[前缀长度为 len1]
	 * s2[前缀长度为 len2]
	 * @return
	 */
	private int f2(char[] s1, char[] s2, int len1, int len2) {
		if (len1 == 0 || len2 == 0) return 0;

		int ans;
		if (s1[len1 - 1] == s2[len2 - 1]) {
			ans = f2(s1, s2, len1 - 1, len2 - 1) + 1;
		} else {
			ans = Math.max(f2(s1, s2, len1 - 1, len2), f2(s1, s2, len1, len2 - 1));
		}
		return ans;
	}

	/**
	 * 解法三: 记忆化搜索 + dp 表
	 * 自顶向下
	 * @param text1
	 * @param text2
	 * @return
	 */
	public int longestCommonSubsequence3(String text1, String text2) {
		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();

		int n = s1.length;
		int m = s2.length;

		/**
		 * dp表 需要容纳下以长度来计算的数据
		 */
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}

		return f3(s1, s2, n, m, dp);
	}

	private int f3(char[] s1, char[] s2, int len1, int len2, int[][] dp) {
		if (len1 == 0 || len2 == 0) return 0;

		if (dp[len1][len2] != -1) {
			return dp[len1][len2];
		}

		int ans;
		if (s1[len1 - 1] == s2[len2 - 1]) {
			ans = f3(s1, s2, len1 - 1, len2 - 1, dp) + 1;
		} else {
			ans = Math.max(f3(s1, s2, len1 - 1, len2, dp), f3(s1, s2, len1, len2 - 1, dp));
		}
		dp[len1][len2] = ans;
		return ans;
	}


	/**
	 * 解法四: 动态规划
	 * 1. 整理严格位置依赖
	 * 2. 从简单格子填写到复杂格子的过程, 即严格位置以来的动态规划(从底到顶)
	 * @param text1
	 * @param text2
	 * @return
	 */
	public int longestCommonSubsequence4(String text1, String text2) {
		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();

		int n = s1.length;
		int m = s2.length;

		int[][] dp = new int[n + 1][m + 1];

		for (int len1 = 1; len1 <= n; len1 ++) {
			for (int len2 = 1; len2 <= m; len2 ++) {
				if (s1[len1 - 1] == s2[len2 - 1]) {
					dp[len1][len2] = 1 + dp[len1 - 1][len2 - 1];
				} else {
					dp[len1][len2] = Math.max(dp[len1 - 1][len2], dp[len1][len2 - 1]);
				}
			}
		}
		return dp[n][m];
	}

	/**
	 * solution5: dp + space compression
	 * @param text1
	 * @param text2
	 * @return
	 */
	public int longestCommonSubsequence5(String text1, String text2) {
		/**
		 * text1 与 text2 长度长的赋值给 s1
		 * 创建dp表时, 用较短的字符串作为列, 省空间
		 */
		char[] s1, s2;
		if (text1.length() >= text2.length()) {
			s1 = text1.toCharArray();
			s2 = text2.toCharArray();
		} else {
			s1 = text2.toCharArray();
			s2 = text1.toCharArray();
		}

		int n = s1.length;
		int m = s2.length;

		int[] dp = new int[m + 1];

		for (int len1 = 1; len1 <= n; len1 ++) {
			int leftUp = 0, backUp;
			for (int len2 = 1; len2 <= m; len2 ++) {
				backUp = dp[len2];
				if (s1[len1 - 1] == s2[len2 - 1]) {
					dp[len2] = 1 + leftUp;
				} else {
					dp[len2] = Math.max(dp[len2], dp[len2 - 1]);
				}
				leftUp = backUp;
			}
		}
		return dp[m];
	}
}