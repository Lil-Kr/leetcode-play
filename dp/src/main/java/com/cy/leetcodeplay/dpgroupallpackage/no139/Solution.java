package com.cy.leetcodeplay.dpgroupallpackage.no139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2025/9/28
 * @Description: no.139. Word Break
 * link: https://leetcode.com/problems/word-break/description/
 *
 * 可看作完全背包问题:
 *  背包容量: s.length();
 *  物品: wordDict 中的每个 word, 并且无限使用
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param str
	 * @param wordDict
	 * @return
	 */
	public boolean wordBreak(String str, List<String> wordDict) {
		Set<String> dict = new HashSet<>(wordDict);
		boolean[] dp = new boolean[str.length()];
		return f1(str, 0, dict, dp);
	}

	private boolean f1(String str, int start, Set<String> dict, boolean[] dp) {
		if (start == str.length()) return true;

		if (dp[start]) {
			return dp[start];
		}

		boolean ans = false;
		for (int end = start + 1; end <= str.length(); end ++) {
			String word = str.substring(start, end);
			if (dict.contains(word) && f1(str, end, dict, dp)) {
				ans = true;
			}
		}
		dp[start] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * dp[i] 表示: 在 s[0 ... i - 1] 个字符中, 是否能被 wordDict 拆分
	 * dp[0] = true; ---> 长度为 0 的前缀字符, 一定可以被拆分
	 * @param str
	 * @param wordDict
	 * @return
	 */
	public boolean wordBreak2(String str, List<String> wordDict) {
		int n = str.length();
		Set<String> dict = new HashSet<>(wordDict);
		boolean[] dp = new boolean[n + 1];
		dp[0] = true;
		for (int i = 1; i <= n; i ++) {
			for (int j = 0; j < i; j ++) {
				if (dict.contains(str.substring(j, i)) && dp[j]) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[n];
	}
}