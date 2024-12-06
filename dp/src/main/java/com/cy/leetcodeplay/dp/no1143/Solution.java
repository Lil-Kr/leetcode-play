package com.cy.leetcodeplay.dp.no1143;

/**
 * @Author: Lil-K
 * @Date: 2024/12/6
 * @Description: no.1143. Longest Common Subsequence
 * link: https://leetcode.com/problems/longest-common-subsequence/description/
 *
 * todo: 未录入题库
 */
public class Solution {

	/**
	 * 解法一: 暴力递归
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

	private int f1(char[] s1, char[] s2, int i, int j) {
		if (i < 0 || j < 0) return 0;

		int p1 = f1(s1, s2, i - 1, j - 1);
		int p2 = f1(s1, s2, i, j - 1);
		int p3 = f1(s1, s2, i - 1, j);
		int p4 = s1[i] == s2[j] ? (p1 + 1) : 0;
		return Math.max(Math.max(p1, p2), Math.max(p3, p4));
	}
}