package com.cy.leetcodeplay.backtracking.no131;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/24
 * @Description: no.131. Palindrome Partitioning
 *
 * 使用回溯法:
 *  1.
 *
 */
public class Solution {

	private List<List<String>> res = new ArrayList<>();

	/**
	 * 回溯
	 * @param s
	 * @return
	 */
	public List<List<String>> partition(String s) {
		backtrack(new ArrayList<>(), s, 0);
		return res;
	}

	private void backtrack(ArrayList<String> curList, String s, int start) {
		// 如果已经到达字符串的末尾, 表示一个组合完成
		if (start == s.length()) {
			res.add(new ArrayList<>(curList));
			return;
		}

		/**
		 * 从 start 开始, 遍历所有可能的子串
		 */
		for (int end = start; end < s.length(); end++) {
			// 如果是回文子串
			if (isPalindrome(s, start, end)) {
				// 做选择: 将该子串加入当前组合
				curList.add(s.substring(start, end + 1));
				// 递归: 继续对剩余部分划分
				backtrack(curList, s, end + 1);
				// 撤销选择: 回退到上一步
				curList.remove(curList.size() - 1);
			}
		}
	}

	/**
	 * 判断子串是否是回文
	 * @param s
	 * @param low
	 * @param high
	 * @return
	 */
	private boolean isPalindrome(String s, int low, int high) {
		while (low < high) {
			if (s.charAt(low++) != s.charAt(high--)) {
				return false;
			}
		}
		return true;
	}
}