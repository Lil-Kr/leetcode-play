package com.cy.leetcodeplay.dp.no139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2025/9/16
 * @Description: no.139. Word Break
 * link: https://leetcode.com/problems/word-break/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: dp
	 * @param str
	 * @param wordDict
	 * @return
	 */
	public boolean wordBreak(String str, List<String> wordDict) {
		int n = str.length();
		Set<String> dict = new HashSet<>(wordDict); // O(1) 查询
		boolean[] dp = new boolean[n + 1];
		dp[0] = true;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && dict.contains(str.substring(j, i))) {
					dp[i] = true;
					break; // 只要找到一种拆分就行
				}
			}
		}
		return dp[n];
	}

}