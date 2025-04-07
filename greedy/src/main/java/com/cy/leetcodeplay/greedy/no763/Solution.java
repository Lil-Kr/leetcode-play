package com.cy.leetcodeplay.greedy.no763;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/4/7
 * @Description: no. 763. Partition Labels
 * link: https://leetcode.com/problems/partition-labels/description
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @return
	 */
	public List<Integer> partitionLabels(String s) {
		List<Integer> res = new ArrayList<>();
		if (s.length() == 0) return res;

		// 记录每个字符最后出现的位置
		int[] last = new int[26];

		for (int i = 0; i < s.length(); i++) {
			last[s.charAt(i) - 'a'] = i;
		}

		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			end = Math.max(end, last[s.charAt(i) - 'a']);
			if (i == end) {
				res.add(end - start + 1);
				start = i + 1;
			}
		}

		return res;
	}
}