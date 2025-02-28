package com.cy.leetcodeplay.matrix.dp.no940;

/**
 * @Author: Lil-K
 * @Date: 2024/11/10
 * @Description: no.940. Distinct Subsequences II
 * link: https://leetcode.com/problems/distinct-subsequences-ii/description/
 *
 * 通过观察:
 *  1. 每个字符向左, 计算得到有多少个字符组合
 *  2.
 *
 * todo: 未录入题库
 */
public class Solution {

	/**
	 * 动态规划
	 * @param s
	 * @return
	 */
	public int distinctSubseqII(String s) {
		int mod = (int) (Math.pow(10.0, 9.0) + 7); // 取余
		char[] chs = s.toCharArray();
		int[] cnt = new int[26];
		int res = 1, newAdd = 0;
		for (char ch : chs) {
			newAdd = (res - cnt[ch - 'a'] + mod) % mod;
			cnt[ch - 'a'] = (cnt[ch - 'a'] + newAdd) % mod;
			res = (res + newAdd) % mod;
		}
		return (res - 1 + mod) % mod;
	}
}