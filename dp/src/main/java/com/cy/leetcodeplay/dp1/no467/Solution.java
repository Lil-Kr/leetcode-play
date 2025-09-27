package com.cy.leetcodeplay.dp1.no467;

/**
 * @Author: Lil-K
 * @Date: 2024/11/8
 * @Description: no.467. Unique Substrings in Wraparound String
 *  link: https://leetcode.com/problems/unique-substrings-in-wraparound-string/description/
 *
 * todo: 未录入Anki
 *
 * 长度长的子串一定包含 长度短的 子串, 所以短的子串不需要考虑了
 * 检查每个字符, 往左边能延申多长
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @return
	 */
	public int findSubstringInWraproundString(String s) {
		int n = s.length();
		/**
		 * 将待考察的字符串转换为数字
		 */
		int[] freqS = new int[n];
		for (int i = 0; i < n; i++) {
			freqS[i] = s.charAt(i) - 'a';
		}

		/**
		 * dp[] 表示: 每个字母向左能延申的长度
		 * dp[freqS[0]] = 1; 表示: 左边第一个字符能向左延申 0 个长度, 它自身长度为 1
		 */
		int[] dp = new int[26];
		dp[freqS[0]] = 1;

		for (int i = 1, cur, prev, len = 1; i < n; i++) {
			cur = freqS[i];
			prev = freqS[i - 1];
			/**
			 * case1: 前一个字符: z, 当前字母: a,
			 * case2: 前一个字符 + 1 == 当前的字符, len ++
			 */
			if ((prev == 25 && cur == 0) || prev + 1 == cur) {
				len ++;
			} else {
				len = 1;
			}
			/**
			 * 记录 从当前字符向左可延申的长度, 取最大
			 */
			dp[cur] = Math.max(dp[cur], len);
		}

		int ans = 0;
		for (int i = 0; i < 26; i++) {
			ans += dp[i];
		}
		return ans;
	}

}