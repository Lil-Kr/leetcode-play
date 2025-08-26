package com.cy.leetcodeplay.findtable.no1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2025/8/26
 * @Description: no.1207. Unique Number of Occurrences
 * link: https://leetcode.com/problems/unique-number-of-occurrences/
 * todo: 未录入题库
 */
public class Solution {

	/**
	 *
	 * @param arr
	 * @return
	 */
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		Set<Integer> set = new HashSet<>(map.values());

		return map.size() == set.size();
	}
}