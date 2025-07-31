package com.cy.leetcodeplay.backtracking.no93;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/7/31
 * @Description: no. 93. Restore IP Addresses
 * link: https://leetcode.com/problems/restore-ip-addresses/description/
 */
public class Solution {

	private List<String> res = new ArrayList<>();

	/**
	 * 回溯
	 * @param s
	 * @return
	 */
	public List<String> restoreIpAddresses(String s) {
		backtracking(s, 0, new ArrayList<>());
		return res;
	}

	private void backtracking(String s, int index, List<String> path) {
		// 如果当前路径已经超过4段, ip 不合法
		if (path.size() > 4) return;

		if (path.size() == 4 && index == s.length()) {
			res.add(String.join(".", path));
			return;
		}

		/**
		 * ip 最大为3位数, 尝试3次
		 */
		for (int len = 1; len <= 3; len ++) {
			if (index + len > s.length()) break;

			/**
			 * 截取字符串, 挨个尝试
			 */
			String segment = s.substring(index, index + len);

			// 以 0 开头的不合法, 除非是 0 自己本身
			if (segment.startsWith("0") && segment.length() > 1) continue;

			int val = Integer.parseInt(segment);
			if (val > 255) continue;

			path.add(segment);
			backtracking(s, index + len, path);
			path.remove(path.size() - 1);
		}
	}
}
